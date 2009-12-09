package com.masprop.cluster1.sudoku.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.masprop.cluster1.sudoku.controller.DancingLinksPseudoImpl.Node;


/**
 * An effort to represent Sudoku as an exact cover problem.
 * 
 * 
 * @author Anshuman Mehta
 *
 */
public class DancingSudokuPseudoImpl {
	
	/*
	 * Represent Sudoku as a exact cover problem
	 * 
	 * in a NxN sudoku matrix
	 * columns = constraints   ( see below => NxNx4 columns )
	 *         a. 1 number per cell ( NxN cells) 
	 *         b. 1 number per row  ( N numbers in N rows)
	 *         c. 1 number per column(N numbers in N cols)
	 *         d. 1 number per 'zone'(N numbers in N 'zones')
	 *         
	 * rows = each possible position for each possible number
	 *        => NxNxN rows.
	 *		   a. possible positions(cells) = NxN
	 *		   b. possible numbers          = N
	 *
	 * now lets try !!
	 * 
	 * The matrix will have the following structure => {testing!}
	 *	
	 *  4x4   { n = each possible number , p = each possible position 1 }
	 *  			
	 *             numberPerCell |  numberPerRow  |  numberPerCol  |  numberPerZone
	 *  		  cell-constraint| row-constraint | col-constraint | zone-constraint
	 *  (n) (p)  1234123412341234|1234123412341234|1234123412341234|1234123412341234  
	 *   1	r1c1 1				 |1               |1               |1     
	 *   2	r1c1 1				 | 1              | 1              | 1
	 *   3 	r1c1 1				 |  1             |  1             |  1
	 *   4	r1c1 1				 |   1            |   1            |   1
	 *   1  r1c2  1				 |1               |    1           |1
	 *   2  r1c2  1				 | 1              |     1          | 1
	 *   3  r1c2  1				 |  1             |      1         |  1
	 *   4  r1c2  1				 |   1            |       1        |   1
	 *   1  r1c3				 |                |                |
	 *   2  r1c3				 |                |                |
	 *   .      				 |                |                |	   
	 *   .      				 |                |                |
	 *   4  r1c4				 |                |                |
	 *   .      				 |                |                |
	 *   .      				 |                |                |
	 *   .  r4c4				 |                |                |
	 *   
	 *   
	 *   
	 *   /// Constraints: 
		/// 4 columns group: <r,c> <d,r> <d,c> <d,b>
		/// 1 : r*dim+c
		/// 2 : (dim*dim) + r*dim + d = dim*(r+dim) + d
		/// 3 : (2*dim*dim) + c*dim + d = dim*(2*dim+c) + d
		/// 4 : (3*dim*dim) + b*dim + d = dim*(3*dim+b) + d
		/// --------------------------------------------------
		/// Retrieving row informations
		/// row= r*dim*dim + c*dim + d
		/// d=row%dim
		/// c=(row/dim)%dim
		/// r=row/(dim*dim)
		/// ----------------
	 *   
	 *   
	 */
	
	public int matrixDimension ; 	// dimension of the requested sudoku matrix
	public int zoneDimension ; 		// zone dimensions within the matrixDimensino = sqrt(matrixDimension)
	
//	public int[][]	sparseMatrix; 	// sparse matrix representation of the sudoku matrix 
	
    public DancingSudokuPseudoImpl(int dim) {
    	
    	this.matrixDimension = dim;
    	this.zoneDimension = (int)Math.sqrt(dim);
	}
	
    
    public int[][] getSamplePuzzles(int puzzleId) throws Exception
    {
    
    	switch(puzzleId)
    	{
    	case '1' :
    		
    		 return new int[][]
    		          {
    					{1,0,2,0},
    					{0,0,1,0},
    					{0,1,4,0},
    					{4,0,3,1}
    				  };
    		 
    	case '2' : 
    		
    		return new int[][]
    		{
    			{0,0,3,0,2,0,6,0,0},
    			{9,0,0,3,0,5,0,0,1},
    			{0,0,1,8,0,6,4,0,0},
    			{0,0,8,1,0,2,9,0,0},
    			{7,0,0,0,0,0,0,0,8},
    			{0,0,6,7,0,8,2,0,0},
    			{0,0,2,6,0,9,5,0,0},
    			{8,0,0,2,0,3,0,0,9},
    			{0,0,5,0,1,0,3,0,0},
    		};
    		
    	case '3' :
    		
    		return new int[][]
    		{
    				{2,1,6,0,0,0,3,0,0},
    				{0,0,0,6,3,0,0,0,0},
    				{0,0,0,0,0,0,7,9,0},
    				{7,4,0,0,5,0,6,0,0},
    				{0,0,0,0,6,0,0,0,0},
    				{0,0,1,0,8,0,0,2,4},
    				{0,7,5,0,0,0,0,0,0},
    				{0,0,0,0,9,2,0,0,0},
    				{0,0,3,0,0,0,9,6,8},
    		};          
    	
    	default : throw new Exception("puzzleId does not exist");
    	}
    	
    }
	
    public void generateTheSparseMatrix()
    {
    	
    	int N = matrixDimension;
		
		//create a sparse matrix with the before mentioned rules
		int cols = N*N*4; // NxNx4
		int rows = N*N*N; // NxNxN
		
		int [][]sparseMatrix = new int[rows][cols];
		
		//first flush the whole matrix
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				sparseMatrix[i][j]=0;
		
		//create the exact cover matrix		
		for (int row=0,r=0; r<N; r++)
			for (int c=0; c<N; c++)
				for (int i=0; i<N; i++,row++)
				{
					//cell constraint
					sparseMatrix[row][r+N*c]=1;
					//row constraint
					sparseMatrix[row][N*N+N*r+i]=1;
					//column constraint
					sparseMatrix[row][2*N*N+N*c+i]=1;
					//zone constraint
					sparseMatrix[row][3*N*N+N*(zoneDimension*((r)/zoneDimension)+((c)/zoneDimension))+i]=1;
				}
		
			
    }
    
    //4x4
	
	public void createFourCrossFour()
	{
		int[][] fourxfour= { 
					{1,3,2,4},
					{2,4,1,3},
					{3,1,4,2},
					{4,2,3,1}
				  };
		
		int[][] puzzle = {
				{1,0,2,0},
				{0,0,1,0},
				{0,1,4,0},
				{4,0,3,1}
			  };
		
		int N = 4;
		//create a sparse matrix with the before mentioned rules
		int cols = N*N*4; // NxNx4
		int rows = N*N*N; // NxNxN
		
		int[][] sparseMatrix = new int[rows][cols];
		//first flush the whole matrix
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				sparseMatrix[i][j]=0;
		
		
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
			{
				if(puzzle[i][j]>0)
				{
					
				}
				sparseMatrix[i][j]=0;
			}
		
		
		/*have to push the 'givens' into the right cols n rows !!
		 *suppose number is at matrix[1,2] and it is 1 then its position in the sparse matrix is ?
		 * 1%N implies i am looking for all positions of 1 in rows.
		 * i=1 tells me to skip all r1 => i*NxN
		 * j=2 tells me to go to r1+i*NxN + j*N 
		 *  
		 * constraint is -> cell1,r1,c1,zone1
		 */
		
		
		
		//now populate the sparse matrix
		
	}
	
	public void createANinexNine()
	{
		int N = matrixDimension;
		
	
	}
	
	public void createAFourxFour()
	{
		int N = matrixDimension;
		
		//create a sparse matrix with the before mentioned rules
		int cols = N*N*4; // NxNx4
		int rows = N*N*N; // NxNxN
		
		int[][] sparseMatrix = new int[rows][cols];
		//first flush the whole matrix
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
			{
				
				sparseMatrix[i][j]=0;
			}
		
		/// 1 : r*dim+c
		/// 2 : (dim*dim) + r*dim + d = dim*(r+dim) + d
		/// 3 : (2*dim*dim) + c*dim + d = dim*(2*dim+c) + d
		/// 4 : (3*dim*dim) + b*dim + d = dim*(3*dim+b) + d
		for (int row=0,r=0; r<N; r++)
			for (int c=0; c<N; c++)
				for (int i=0; i<N; i++,row++)
				{
					//uniqueness constraint
					sparseMatrix[row][r+N*c]=1;
					//row constraint
					sparseMatrix[row][N*N+i+N*r]=1;
					//column constraint
					sparseMatrix[row][2*N*N+i+N*c]=1;
					//zone constraint
					sparseMatrix[row][3*N*N+i+N*(zoneDimension*((r)/zoneDimension)+((c)/zoneDimension))]=1;
				}
		
		int[][] fourxfour= { 
				{1,3,2,4},
				{2,4,1,3},
				{3,1,4,2},
				{4,2,3,1}
			  };
	
	int[][] puzzle = {
			{1,0,2,0},
			{0,0,1,0},
			{0,1,4,0},
			{4,0,3,1}
		  };
	
	
	int [][] puzzle3 = 
		{
			{0,0,3,0,2,0,6,0,0},
			{9,0,0,3,0,5,0,0,1},
			{0,0,1,8,0,6,4,0,0},
			{0,0,8,1,0,2,9,0,0},
			{7,0,0,0,0,0,0,0,8},
			{0,0,6,7,0,8,2,0,0},
			{0,0,2,6,0,9,5,0,0},
			{8,0,0,2,0,3,0,0,9},
			{0,0,5,0,1,0,3,0,0},
		};
	
	int[][] puzzle4 =
	{
			{2,1,6,0,0,0,3,0,0},
			{0,0,0,6,3,0,0,0,0},
			{0,0,0,0,0,0,7,9,0},
			{7,4,0,0,5,0,6,0,0},
			{0,0,0,0,6,0,0,0,0},
			{0,0,1,0,8,0,0,2,4},
			{0,7,5,0,0,0,0,0,0},
			{0,0,0,0,9,2,0,0,0},
			{0,0,3,0,0,0,9,6,8},
	};
	
	DancingLinksPseudoImpl dlx = DancingLinksPseudoImpl.createDlxAndSolve(sparseMatrix);
	
	for (int r=0; r<matrixDimension; r++)
		for (int c=0; c<matrixDimension; c++)
		{
		
			if (puzzle[r][c]>0) //known value
			{
				pushGiven(dlx,matrixDimension*matrixDimension*r+matrixDimension*c+puzzle[r][c]-1);
//				sparseMatrix = cover_row(sparseMatrix,dim*dim*r+dim*c+puzzle[r][c]-1);
				//grid[r][c]=ch-'0';
			}
			
		}
	
		
//	printSparseMatrix(sparseMatrix);
	
		dlx.solve();
		
		
		for (int r=0; r<matrixDimension; r++)
		for (int c=0; c<matrixDimension; c++)
		{
		
			if (puzzle[r][c]>0) //known value
			{
				UnpushGiven(dlx,matrixDimension*matrixDimension*r+matrixDimension*c+puzzle[r][c]-1);
//				sparseMatrix = cover_row(sparseMatrix,dim*dim*r+dim*c+puzzle[r][c]-1);
				//grid[r][c]=ch-'0';
			}
			
		}
	
		
		Map<Integer,List<Integer>> solutions = dlx.solutionsMap;
		System.out.println(solutions.size());
//		printSolutions(sparseMatrix, solutions);
		
		
		printSolvedSudoku(puzzle,sparseMatrix,solutions);
		
	}
	public void UnpushGiven(DancingLinksPseudoImpl dlx,int index)
	{
		/*Node givenNode = dlx.rowsList.get(index);
		dlx.partialSolution.push(givenNode);
		do
		{
			dlx.cover(givenNode.columnHeader);
			givenNode = givenNode.right;
		}
		while(givenNode != dlx.rowsList.get(index));*/
		
		List<Node> givenRow = dlx.rowsMap.get(index);
		for(Node inRow : givenRow)
			dlx.unCover(inRow.columnHeader);
		
	}
	
	private void printSolvedSudoku(int[][] puzzle,
			int[][] sparseMatrix,
			Map<Integer, List<Integer>> solutions) {
		
		/// Retrieving row informations
		/// row= r*dim*dim + c*dim + d
		/// d=row%dim
		/// c=(row/dim)%dim
		/// r=row/(dim*dim)
		
		
	for(Integer key : solutions.keySet())
	{
		int[][]solution = new int[matrixDimension][matrixDimension];
		for(int i=0;i<solution.length;i++)
			for(int j=0;j<solution[i].length;j++)
				solution[i][j]=puzzle[i][j];
		
		System.out.println("\n Solution number " + key + "\n");
		List<Integer> solutionRow = solutions.get(key);
		for(Integer row : solutionRow)
		{
			int d= row%matrixDimension+1;
			int c= (row/matrixDimension)%matrixDimension;
			int r = row/(matrixDimension*matrixDimension);
			solution[r][c]=d;
		//	puzzle[r][c] = d;
		}
		
		System.out.println("Solution ->");
		for(int i=0;i<matrixDimension;i++)
		{
			for(int j=0;j<matrixDimension;j++)
				System.out.print(solution[i][j]);
			System.out.println();
		}

		
	}
	
	System.out.println("Solved ->");
	for(int i=0;i<matrixDimension;i++)
	{
		for(int j=0;j<matrixDimension;j++)
			System.out.print(puzzle[i][j]);
		System.out.println();
	}

	
	
	}



	
 public String getRowFromSparseMatrix(int[] sparseMatrixRow)
	 {
		StringBuffer stringified = new StringBuffer(); 
	 
		 for(int col=0;col<sparseMatrixRow.length;col++)
		 {
		 stringified.append(sparseMatrixRow[col] == 0 ? '0' : '1' );
		 }
		 return stringified.toString();
	 }

	public void pushGiven(DancingLinksPseudoImpl dlx,int index)
	{
		/*Node givenNode = dlx.rowsList.get(index);
		dlx.partialSolution.push(givenNode);
		do
		{
			dlx.cover(givenNode.columnHeader);
			givenNode = givenNode.right;
		}
		while(givenNode != dlx.rowsList.get(index));*/
		
		List<Node> givenRow = dlx.rowsMap.get(index);
		for(Node inRow : givenRow)
			dlx.cover(inRow.columnHeader);
		
	}
	
	public int[][] cover_row(int[][] sparseMatrix,int row) {
		// TODO Auto-generated method stub
	
		
		for (int col=0; col<matrixDimension*matrixDimension*4; col++)
			if (sparseMatrix[row][col]==1)
			{
				sparseMatrix[row][col]=0;
				sparseMatrix = cover_col(sparseMatrix,col);
			}
		return sparseMatrix;
	}
	
	public int[][] cover_col(int[][]sparseMatrix,int col)
	{
		for (int row=0; row<matrixDimension*matrixDimension*matrixDimension; row++)
			if (sparseMatrix[row][col]==1)
			{
				sparseMatrix[row][col]=0;
				//memset(matrix[row],0,sizeof(matrix[row]));
			}
		return sparseMatrix;
	}
	


	public void BuildSudokuMatrix() {
		
		int N = 4;
		int cols = N*N*4; // NxNx4
		int rows = N*N*N;
		
		DancingSudokuPseudoImpl sudoku = new DancingSudokuPseudoImpl(N);
				
		DancingLinksPseudoImpl test = new DancingLinksPseudoImpl();
		test.buildSparseMatrix(test, rows, cols);
		
		//appending all the rows then
		
		
	
	} 
	
	public void printSolutions(int[][] sparseMatrix,Map<Integer,List<Integer>> solutions)
	{
		 try {
		        BufferedWriter out = new BufferedWriter(new FileWriter("outSolutions.txt",true));
		for(Integer key : solutions.keySet())
		{
			out.write("\n Solution number " + key + "\n");
			List<Integer> solutionRow = solutions.get(key);
			for(Integer row : solutionRow)
			{
		
				out.write(getStringOfSparseMatrixRow(sparseMatrix[row]) +"\n");
			}
			out.write("\n");
		}
		out.close();
		 }catch (IOException e) {
		    }
		
	}
		
	 public String getStringOfSparseMatrixRow(int[] sparseMatrixRow)
		 {
			StringBuffer stringified = new StringBuffer(); 
		 
			 for(int col=0;col<sparseMatrixRow.length;col++)
			 {
			 stringified.append(sparseMatrixRow[col] == 0 ? '0' : '1' );
			 }
			 return stringified.toString();
		 }
		 
	public  void printSparseMatrix(int[][] sparseMatrix)
	{
		 try {
		        BufferedWriter out = new BufferedWriter(new FileWriter("outsparse.txt",true));
		        for(int i=0; i<sparseMatrix.length;i++)
		        {
		        	for(int j=0;j<sparseMatrix[i].length;j++)
		        		if(sparseMatrix[i][j]==0)
		        			out.write("0,");
		        		else
		        			out.write("1,");
		        	out.write("\n");
		        }
		        out.close();
			 
		    } catch (IOException e) {
		    }
//		    System.out.println(partialSolution.toString());
	}
	
	
	public static void main(String args[])
	{
		
		new DancingSudokuPseudoImpl(4).createAFourxFour();
		
		
	}

}
