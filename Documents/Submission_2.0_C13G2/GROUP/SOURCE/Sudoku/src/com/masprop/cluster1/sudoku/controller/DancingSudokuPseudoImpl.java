package com.masprop.cluster1.sudoku.controller;


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
	 */
	
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
		
		
		//create a sparse matrix with the before mentioned rules
		int cols = 4*4*4; // NxNx4
		int rows = 4*4*4; // NxNxN
		
		int[][] sparseMatrix = new int[rows][cols];
		//first flush the whole matrix
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				sparseMatrix[i][j]=0;
		
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
	
	public void createAFourxFour()
	{
		
		//create a sparse matrix with the before mentioned rules
		int cols = 4*4*4; // NxNx4
		int rows = 4*4*4; // NxNxN
		
		int[][] sparseMatrix = new int[rows][cols];
		//first flush the whole matrix
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
			{
				
				sparseMatrix[i][j]=0;
			}
		//random
		sparseMatrix[0][0]=1;
		for(int i=0;i<rows-1;i++)
//			for(int j=i;j<cols;j++)
			{
				
				sparseMatrix[i][i+1]=1;
				
			}
		
		//try to solve it !!
		DancingLinksPseudoImpl x = new DancingLinksPseudoImpl();
		x.createDlxAndSolve(sparseMatrix);
		
	}
	
	public static void main(String args[])
	{
		
		new DancingSudokuPseudoImpl().createAFourxFour();
		
		
	}

}
