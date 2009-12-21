package com.masprop.cluster1.sudoku.controller.dancingLinks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Stack;

import com.masprop.cluster1.shared.controller.Algorithm;
import com.masprop.cluster1.shared.model.Game;

/**
 * The implementation of the DancingLinks Algorithm
 * inspired from Dr. Knuths papers.
 * 
 * www-cs-faculty.stanford.edu/~knuth/papers/dancing.ps.gz
 * 
 * @author Anshuman Mehta
 *
 */
public class DancingLinks extends Observable{

	
	ColumnHeader rootNode;


	Stack<Node> partialSolution = new Stack<Node>();


	List<Node> columnsList  = new ArrayList<Node>();
	List<Node> rowsList = new ArrayList<Node>();
	Map<Integer,List<Node>> rowsMap = new HashMap<Integer,List<Node>>();
	

	boolean stop;

	public  Map<Integer,List<Integer>> solutionsMap = new HashMap<Integer,List<Integer>>();
	
	static int numberOfSolutions;
	
	String name;
	
	public DancingLinks(String threadName) {
		this.name = threadName;
	}




	/**
	 *  Choose Column
	 *   <from knuth's algorithm> 
	 *   set s <- infinity.
     *   for each j <- R[h], R[R[h]], ..., while j != h,
     *       if S[j] < s    set c <- j and s <- S[j].
     */
	
	protected ColumnHeader chooseColumn()
	{
		   int s = Integer.MAX_VALUE;
	        ColumnHeader cHeadForColumn = null;

	        for (ColumnHeader nextColumnHeader = (ColumnHeader)getRootNode().getRight();
	        nextColumnHeader != getRootNode();
	        nextColumnHeader = (ColumnHeader) nextColumnHeader.getRight()) {
	            if (nextColumnHeader.getSize() < s) {
	                s = nextColumnHeader.getSize();
	                cHeadForColumn = nextColumnHeader;
	            }
	        }

	        return cHeadForColumn;
	}

	
	
	
	/**
	 * 
	 * Cover a column
	 * 
	 * Set L[R[c]]<-L[c] and R[L[c]]<-R[c]
	 * For each i<-D[c],D[D[c]],...,while i!=c
	 * 	for each j<-R[i],R[R[i]],...,while j!=i
	 * 	 set U[D[j]]<-U[j],D[U[j]]<-D[j]
	 *   and set S[C[j]]<-S[C[j]]-1
	 */
	
	public void cover (ColumnHeader cHeader)
	{
		
		
		cHeader.right.left = cHeader.left;
		
		cHeader.left.right = cHeader.right;
		
		  for (Node i = cHeader.down; i != cHeader; i = i.down) {
	            for (Node j = i.right; j != i; j = j.right) {
	                j.down.up = j.up;
	                j.up.down = j.down;
	                j.columnHeader.size--;
	            }
	        }
		

		
	}
	
	
	
	/**
	 * Uncover a column
	 *   For each i <- U[c], U[U[c]], ..., while i != c,
	 *       for each j <- L[i], L[L[i]], ..., while j != i,
	 *           set S[C[j]] <- S[C[j]] + 1.
	 *           and set U[D[j]] <- j, D[U[j]] <- j.
	 *   Set L[R[c]] <- c and R[L[c]] <- c.
	 */
	
	
	public void unCover (ColumnHeader cHeader)
	{
	
		 for (Node i = cHeader.up; i != cHeader; i = i.up) {
	            for (Node j = i.left; j != i; j = j.left) {
	                j.columnHeader.size++;
	                j.down.up = j;
	                j.up.down = j;
	            }
	        }

		 cHeader.right.left = cHeader;
		 cHeader.left.right = cHeader;
		
		
	}
	
	
	/**
	 * Algorithm to solve
	 * 
	 * If R[h] = h , print current solution return
	 * choose a column object c
	 * cover column c
	 * For each r<-D[c], D[D[c]],..., while r!=c
	 * 		set Ok<-r;
	 *		For each j<-R[r], R[R[r]],...,while j!=r
	 *			cover column C[j]
	 *		search(k+1)
	 *		set r<-Ok and c<-C[r];
	 *		For each j<-L[r],L[L[r],...,while j!=r
	 *			uncover column C[j]
	 * Uncover column c and return
	 */
	
	public void solve()
	{
		if(rootNode.right == rootNode)
		{
			numberOfSolutions++;
			printSolution();
			return;
		}
		
		
		  ColumnHeader columnHeader = chooseColumn();
        cover(columnHeader);

	        Node r = columnHeader.down;
	        while (r != columnHeader) {

	            partialSolution.push(r);
	            for (Node j = r.right; j != r; j = j.right) {
	                cover(j.columnHeader);
	            }
	           
	            // only a sudoku with one solution is a valid sudoku
	            if(!stop)
	                solve();
	           
	            

	            r = (Node)partialSolution.pop();
	            columnHeader = r.getColumnHeader();
	            for (Node j = r.left; j != r; j = j.left) {
	                unCover(j.columnHeader);
	            }
	            r = r.down;
	        }

	        unCover(columnHeader);
	}
	
	
	public  void printSolution()
	{
		 /*try {
//		        BufferedWriter out = new BufferedWriter(new FileWriter("outfilename.txt",true));
//		        out.write(partialSolution.toString());
//		        out.close();
			 
		    } catch (IOException e) {
		    }*/
		List<Integer> partialSolutionsList = new ArrayList<Integer>();
		for(Iterator iter = partialSolution.iterator();iter.hasNext();)
		{
			Node node = (Node)iter.next();
			Integer row = node.getRowIndex();
			partialSolutionsList.add(row);
		}
		solutionsMap.put(numberOfSolutions, partialSolutionsList);
		
		setChanged();
	/*	
		int x = countObservers();
		System.out.println("observers " +x);*/
		notifyObservers();

	}
	
	
	public static DancingLinks createDlxSparseMatrix(int[][] matrixRow)
	{
		
		DancingLinks dlx = new DancingLinks("DancingLinks");
		dlx.rootNode = new ColumnHeader();
		dlx.rootNode.columnHeader = dlx.rootNode;


		ColumnHeader cHeader = new ColumnHeader();
		Node lastNodeInRow = new Node();
		

		
		for (int i = 0; i < matrixRow[0].length; i++) {
            ColumnHeader columnHeader = new ColumnHeader();
            columnHeader.id=i;
            columnHeader.name = "c"+i;
            columnHeader.left = dlx.rootNode.left;
            columnHeader.right = dlx.rootNode;
            dlx.rootNode.left.right = columnHeader;
            dlx.rootNode.left = columnHeader;
            dlx.columnsList.add(columnHeader);
            
		}
		
		
		for(int i=0;i<matrixRow.length;i++)
		{
			for(int j=0;j<matrixRow[i].length;j++)
			{
				if(matrixRow[i][j]==1)
				{
				cHeader = (ColumnHeader)dlx.columnsList.get(j);
		
				
				Node crNode = new Node();
				crNode.id = cHeader.id;
				crNode.rowIndex=i;
				crNode.value=matrixRow[i][j];
				cHeader.addNode(crNode);
				// attach new node to its row
				if(dlx.rowsMap.containsKey(new Integer(i)))
				{
					List<Node> nodesInThisRow = dlx.rowsMap.get(new Integer(i));
					lastNodeInRow = nodesInThisRow.get(nodesInThisRow.size()-1);
					crNode.left = lastNodeInRow.left;
					crNode.right = lastNodeInRow;
				    lastNodeInRow.left.right = crNode;
				    lastNodeInRow.left = crNode;
				    nodesInThisRow.add(crNode);
				}
				else
				{
					List<Node> newList = new ArrayList<Node>();
					newList.add(crNode);
					dlx.rowsMap.put(new Integer(i), newList);
				}
				}
			}
		}
		return dlx;

	}
	
	public ColumnHeader getRootNode() {
		return rootNode;
	}



	public void setRootNode(ColumnHeader rootNode) {
		this.rootNode = rootNode;
	}
	
	public List<Node> getColumnsList() {
		return columnsList;
	}



	public void setColumnsList(List<Node> columnsList) {
		this.columnsList = columnsList;
	}



	public List<Node> getRowsList() {
		return rowsList;
	}



	public void setRowsList(List<Node> rowsList) {
		this.rowsList = rowsList;
	}



	public Map<Integer, List<Node>> getRowsMap() {
		return rowsMap;
	}



	public void setRowsMap(Map<Integer, List<Node>> rowsMap) {
		this.rowsMap = rowsMap;
	}

	public  Map<Integer, List<Integer>> getSolutionsMap() {
		return solutionsMap;
	}
	public static void main(String args[])
	{
	
			int [][] matrixRow = { {0,1,0,1}, {0,1,1,0} , {1,0,0,0} , { 0,0,1,0} };
			DancingLinks dlx = DancingLinks.createDlxSparseMatrix(matrixRow);
			dlx.solve();
			System.out.println(dlx.getSolutionsMap());
	
	}






}
















