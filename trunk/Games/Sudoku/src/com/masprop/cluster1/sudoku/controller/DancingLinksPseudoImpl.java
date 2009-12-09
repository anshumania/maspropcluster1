package com.masprop.cluster1.sudoku.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.masprop.cluster1.shared.model.Matrix;
/**
 * 
 * The Danclinks algorithm implementation.
 * This pseudo implementation can solve an exact cover problem
 * @author Anshuman Mehta
 *
 */
public class DancingLinksPseudoImpl {

	ColumnHeader rootNode;
	Stack partialSolution = new Stack();
	List<Node> columnsList  = new java.util.ArrayList<Node>();
	List<Node> rowsList = new ArrayList<Node>();
	Map<Integer,List<Node>> rowsMap = new java.util.HashMap<Integer,List<Node>>();
	public static Map<Integer,List<Integer>> solutionsMap = new HashMap<Integer,List<Integer>>();
	
	static int numberOfSolutions;
	
	class Node
	{
		int id;
		Node left = this ;
		Node right = this; 
		Node up = this;
		Node down = this;
		ColumnHeader columnHeader;
		int value;
		int rIndex;
		
		Node()
		{
			
		}
		Node(int row)
		{
			this.rIndex=row;
		}
		public String toString()
		{
//			return "[N{r="+rIndex+",c="+id+"}{v="+value+"}]";
			return "<N{row="+rIndex+"}>";
		}
	
	}
	class ColumnHeader extends Node
	{
		int size;
		String name;
		
		  public void addNode(final Node node) {
		        node.columnHeader = this;
		        node.down = this;
		        node.up = this.up;
		        up.down = node;
		        up = node;
//		        if(node.value == 1)
		        size++;
		    }
	}
	//choose column
	/*
	 *  set s <- infinity.
     *   for each j <- R[h], R[R[h]], ..., while j != h,
     *       if S[j] < s    set c <- j and s <- S[j].
     */
	public ColumnHeader chooseColumn()
	{
		   int s = Integer.MAX_VALUE;
	        ColumnHeader cHeadForColumn = null;

	        for (ColumnHeader nextColumnHeader = (ColumnHeader)rootNode.right;
	        nextColumnHeader != rootNode;
	        nextColumnHeader = (ColumnHeader) nextColumnHeader.right) {
	            if (nextColumnHeader.size < s) {
	                s = nextColumnHeader.size;
	                cHeadForColumn = nextColumnHeader;
	            }
	        }

	        return cHeadForColumn;
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
			Integer row = node.rIndex;
			partialSolutionsList.add(row);
		}
		solutionsMap.put(numberOfSolutions, partialSolutionsList);
//		    System.out.println("Solution"+partialSolution.toString());
	}
	
	//Algo to Solve
	/*
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
//			System.out.println("Solution" + partialSolution.toString());
//			for(Object x : partialSolution)
////			{
//				System.out.print("+"+((Node)x).toString());
////			}
//			System.out.println();
			return;
		}
		
		
		  ColumnHeader columnHeader = chooseColumn();
	        cover(columnHeader);

	        Node r = columnHeader.down;
	        while (r != columnHeader) {
//	        	System.out.println("padd" + r.toString());
	            partialSolution.push(r);
	            for (Node j = r.right; j != r; j = j.right) {
	                cover(j.columnHeader);
	            }
	           
	                solve();
	           
	            
	            //Node rem = (Node)
	            r = (Node)partialSolution.pop();
	            //remove(partialSolution.size()-1);
//	            System.out.println("removed " + r.columnHeader.name + " " + r.value);
	            columnHeader = r.columnHeader;
	            for (Node j = r.left; j != r; j = j.left) {
	                unCover(j.columnHeader);
	            }
	            r = r.down;
	        }

	        unCover(columnHeader);
	}
	
	
	//Cover
	/*
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
	
	//Uncover
	/*
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

	public static DancingLinksPseudoImpl createDlxAndSolve(int[][] matrixRow)
	{
		//Create an exact cover problem
		// r ch1 ch2 .. ch3
		//   1   0   .. 0
		//   1   1   .. 1
		//   0   0   .. 0
		
		DancingLinksPseudoImpl test = new DancingLinksPseudoImpl();
		test.rootNode = test.new ColumnHeader();
		test.rootNode.columnHeader = test.rootNode;


		ColumnHeader cHeader = test.new ColumnHeader();
		Node lastNodeInRow = test.new Node();
		
//		int[][] matrixRow = {{0,0,1},{0,1,0},{1,0,0}}; // 3x3
		
		
		for (int i = 0; i < matrixRow[0].length; i++) {
            ColumnHeader columnHeader = test.new ColumnHeader();
            columnHeader.id=i;
            columnHeader.name = "c"+i;
            columnHeader.left = test.rootNode.left;
            columnHeader.right = test.rootNode;
            test.rootNode.left.right = columnHeader;
            test.rootNode.left = columnHeader;
            test.columnsList.add(columnHeader);
            
		}
		
		
		for(int i=0;i<matrixRow.length;i++)
		{
			for(int j=0;j<matrixRow[i].length;j++)
			{
				if(matrixRow[i][j]==1)
				{
				cHeader = (ColumnHeader)test.columnsList.get(j);
		
				
				Node crNode = test.new Node();
				crNode.id = cHeader.id;
				crNode.rIndex=i;
				crNode.value=matrixRow[i][j];
				cHeader.addNode(crNode);
				// attach new node to its row
				if(test.rowsMap.containsKey(new Integer(i)))
				{
					List<Node> nodesInThisRow = test.rowsMap.get(new Integer(i));
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
					test.rowsMap.put(new Integer(i), newList);
				}
				}
			}
		}
		
//		for(Integer key : test.rowsMap.keySet())
//		{
//			List<Node> rows = test.rowsMap.get(key);
//			for(Node nod : rows)
//			{
//				System.out.print(nod.toString());
//			}
//			System.out.println();
//		}
				
		
//  
		return test;
		// test.solve();		
//		 System.out.println(test.partialSolution.toString());

	}
	
	
	
	public void buildSparseMatrix(DancingLinksPseudoImpl test,int rows , int cols) {
		
		test.rootNode = test.new ColumnHeader();
		test.rootNode.columnHeader = test.rootNode;


		ColumnHeader cHeader = test.new ColumnHeader();
		Node lastNodeInRow = test.new Node();
		
//		int[][] matrixRow = {{0,0,1},{0,1,0},{1,0,0}}; // 3x3
		
		
		for (int i = 0; i <cols; i++) {
            ColumnHeader columnHeader = test.new ColumnHeader();
            columnHeader.id=i;
            columnHeader.name = "c"+i;
            columnHeader.left = test.rootNode.left;
            columnHeader.right = test.rootNode;
            test.rootNode.left.right = columnHeader;
            test.rootNode.left = columnHeader;
            test.columnsList.add(columnHeader);
            
		}
		
		// rows
		for (int i=0; i<rows; i++) {
			Node rowNode = new Node();
			test.rowsList.add(rowNode);
		}
		
		
		
		
	}
	
	
	
	
	

	public static void main(String args[])
	{
		int [][] matrixRow = { {1,0,1,0}, {1,1,0,1} , {0,1,0,1} , { 0,0,1,0} };
		DancingLinksPseudoImpl.createDlxAndSolve(matrixRow).solve();
		System.out.println(DancingLinksPseudoImpl.solutionsMap);
	}
}
