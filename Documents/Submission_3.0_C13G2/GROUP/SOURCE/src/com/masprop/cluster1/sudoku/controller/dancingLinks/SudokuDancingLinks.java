package com.masprop.cluster1.sudoku.controller.dancingLinks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import com.masprop.cluster1.sudoku.controller.SudokuAlgorithm.modeDlx;


// TODO: Auto-generated Javadoc
/**
 * Implementation of a Suoku as an ExactCover problem and
 * solving it using <tt>DancingLinks<tt> inspired from
 * Dr. Knuths Algorithm
 * 
 * @author Anshuman Mehta
 */

public class SudokuDancingLinks  extends Observable implements Observer {

	
	/** The dimension of the sudoku matrix */
	public int matrixDimension ; 	// dimension of the requested sudoku matrix
	
	/** The zone dimension with the matrix . 
	 *  zoneDimension = sqrt(matrixDimension) 
	 */
	public int zoneDimension ; 		// zone dimensions within the matrixDimensino = sqrt(matrixDimension)
	
	/** boolean to valid sudoku. */
	public boolean validSudoku = true; // to validate a sudoku => only 1 solution
	
	/** boolean to indicate stop processing for more solutions. */
	public boolean stopped;			// indicate that it has stopped processing more solutions
	
	/** The has solution. */
	public boolean hasSolution; // for generation used to notify the upper algo to start picking a sudoku
	
	/** The modedlx. */
	public modeDlx modedlx;
	
	/** The solutions map. */
	public  Map<Integer,List<Integer>> solutionsM = new HashMap<Integer,List<Integer>>();
	
	
	/** The sudoku dancing links. */
	public DancingLinks sudokuDancingLinks;
	
//	public int[][]	sparseMatrix; 	// sparse matrix representation of the sudoku matrix 
	
    /**
 * Instantiates a new sudoku dancing links.
 * 
 * @param dim the dim
 */
public SudokuDancingLinks(int dim) {
    	
    	this.matrixDimension = dim;
    	this.zoneDimension = (int)Math.sqrt(dim);
	}
    
  /**
   * Instantiates a new sudoku dancing links.
   * 
   * @param dim the dim
   * @param mode the mode
   */
  public SudokuDancingLinks(int dim, modeDlx mode) {
    	
    	this.matrixDimension = dim;
    	this.zoneDimension = (int)Math.sqrt(dim);
    	this.modedlx = mode;
	}
    
	/**
	 * key
	 * puzzle 1 = 4x4
	 * puzzle 2 = 9x9
	 * puzzle 3 = 9x9
	 * puzzle 4 = 9x9 309 solutions.
	 * 
	 * @param puzzleId the puzzle id
	 * 
	 * @return the sample puzzles
	 * 
	 * @throws Exception the exception
	 */
    
    public static int[][] getSamplePuzzles(int puzzleId) throws Exception
    {
    
    	switch(puzzleId)
    	{
    	case 1 :
    		
    		 return new int[][]
    		          {
    					{1,0,2,0},
    					{0,0,1,0},
    					{0,1,4,0},
    					{4,0,3,1}
    				  };
    		 
    	case 2 : 
    		
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
    		
    	case 3 :
    		
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
    		
    	case 4 :
    		
    		return new int[][]
    		{
    				{0, 0, 1, 0, 0, 2, 0, 0, 0}, 
    				{0, 4, 0, 0, 0, 0, 0, 5, 0},
    				{6, 0, 0, 0, 7, 0, 1, 0, 0},
    				{0, 0, 0, 6, 0, 3, 0, 0, 8}, 
    				{0, 0, 9, 0, 0, 0, 2, 0, 0},
    				{8, 0, 0, 2, 0, 1, 0, 0, 0},
    				{0, 0, 6, 0, 3, 0, 0, 0, 9},
    				{0, 5, 0, 0, 0, 0, 0, 4, 0},
    				{9, 0, 0, 7, 0, 0, 8, 0, 0} 
    				
    		};
    		
    	case 5 :
    		return new int[][]
    		                 {
    				{0,0,2,8,3,0,0,0,0},
    				{6,7,4,0,0,0,0,0,0},
    				{0,0,8,0,1,6,0,0,0},
    				{2,0,0,6,8,0,7,0,0},
    				{0,5,0,0,0,1,0,0,0},
    				{0,1,7,0,5,0,4,0,2},
    				{1,0,0,0,0,3,0,0,0},
    				{0,8,0,0,0,0,5,0,3},
    				{0,0,0,0,4,0,0,0,5}
    		                 };
    		
    	case 6 :
    		return new int[][]
    		                 {
    				{8,0,0,0,0,0,0,0,0},
    				{0,0,0,0,0,2,0,0,0},
    				{1,0,9,0,0,0,3,5,7},
    				{0,0,0,2,0,0,1,0,0},
    				{0,0,3,0,8,4,0,6,0},
    				{0,0,0,0,0,0,0,0,0},
    				{0,0,0,0,3,0,0,0,0},
    				{7,0,6,0,0,0,0,0,0},
    				{0,0,0,4,0,0,2,0,0}
    		            };
    		
    	case 7 :
    		return new int[][]
    		                 {
    				{0,0,4,0},
					{0,0,2,1},
					{0,3,1,0},
					{4,0,3,2}
    		                 };
    	
    	default : throw new Exception("puzzleId does not exist");
    	}
    	
    }
    
    /**
     * Generates the sudoku dlx sparse matrix.
     */
    public void generateSudokuDlxSparseMatrix()
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
		
		
	
	sudokuDancingLinks = DancingLinks.createDlxSparseMatrix(sparseMatrix);
	}
    
    
    /**
     * Push the givens in the sudoku dlx.
     * 
     * @param puzzle the puzzle
     */
    public void pushGivensInSudokuDlx(int[][] puzzle)
    {
    	
	
	for (int r=0; r<matrixDimension; r++)
		for (int c=0; c<matrixDimension; c++)
		{
		
			if (puzzle[r][c]>0) //known value
			
				pushGiven(sudokuDancingLinks,matrixDimension*matrixDimension*r+matrixDimension*c+puzzle[r][c]-1);
//				sparseMatrix = cover_row(sparseMatrix,dim*dim*r+dim*c+puzzle[r][c]-1);
				//grid[r][c]=ch-'0';
			
			
		}

    }
    
    /**
     * Solve the sudoku dlx.
     */
    public void solveSudokuDlx()
    {
    	
	    if(sudokuDancingLinks.stop)
	    	sudokuDancingLinks.stop = false;
		sudokuDancingLinks.addObserver(this);
	   	sudokuDancingLinks.solve();
	   	// 	System.out.println("sdlx noOfSols" + sudokuDancingLinks.numberOfSolutions);
	   	
	   	//stopped = true;
    	//while(!sudokuDancingLinks.stop);
    	
//    	p.interrupt();
    	
    	
    	//System.out.println("the solution size is " + fetchSolutionSize());
    	validSudoku = ((fetchSolutionSize() > 1) || (fetchSolutionSize() == 0)) ? false : true;
    	sudokuDancingLinks.numberOfSolutions = 0;
    	
	
		
    }
    
    /**
     * Clear the givens from sudoku dlx.
     * 
     * @param puzzle the puzzle
     */
    public void clearTheGivensFromSudokuDlx(int[][] puzzle)
    {
		for (int r=0; r<matrixDimension; r++)
		for (int c=0; c<matrixDimension; c++)
		{
		
			if (puzzle[r][c]>0) //known value
			{
				clearGiven(matrixDimension*matrixDimension*r+matrixDimension*c+puzzle[r][c]-1);
//				sparseMatrix = cover_row(sparseMatrix,dim*dim*r+dim*c+puzzle[r][c]-1);
				//grid[r][c]=ch-'0';
			}
			
		}
    }
    
    /**
     * Fetch solution size.
     * 
     * @return the int
     */
    public int fetchSolutionSize()
    {
    	return sudokuDancingLinks.getSolutionsMap().size();
    }
		
 	

    
    
	/**
	 * Push given.
	 * 
	 * @param dlx the dlx
	 * @param index the index
	 */
	public void pushGiven(DancingLinks dlx,int index)
	{
			
		List<Node> givenRow = dlx.rowsMap.get(index);
		for(Node inRow : givenRow)
			dlx.cover(inRow.columnHeader);
		
	}
    
	/**
	 * Clear given.
	 * 
	 * @param index the index
	 */
	public void clearGiven(int index)
	{

		List<Node> givenRow = sudokuDancingLinks.rowsMap.get(index);
		for(Node inRow : givenRow)
			sudokuDancingLinks.unCover(inRow.columnHeader);
		
	}
	
	/**
	 * Prints the solved sudoku.
	 * 
	 * @param puzzle the puzzle
	 */
	public void printSolvedSudoku(int[][] puzzle) {
		
		/// Retrieving row informations
		/// row= r*dim*dim + c*dim + d
		/// d=row%dim
		/// c=(row/dim)%dim
		/// r=row/(dim*dim)
		
		
	for(Integer key : sudokuDancingLinks.getSolutionsMap().keySet())
	{
		int[][]solution = new int[matrixDimension][matrixDimension];
		for(int i=0;i<solution.length;i++)
			for(int j=0;j<solution[i].length;j++)
				solution[i][j]=puzzle[i][j];
		
		System.out.println("\n Solution number " + key + "\n");
		List<Integer> solutionRow = sudokuDancingLinks.getSolutionsMap().get(key);
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
	
	
	/**
	 * Fetch solved sudokus.
	 * 
	 * @param puzzle the puzzle
	 * 
	 * @return the list<int[][]>
	 */
	public List<int[][]> fetchSolvedSudokus(int[][] puzzle) {
		
		/// Retrieving row informations
		/// row= r*dim*dim + c*dim + d
		/// d=row%dim
		/// c=(row/dim)%dim
		/// r=row/(dim*dim)
		
	List<int[][]> solutionsArray = new ArrayList<int[][]>();
	for(Integer key : sudokuDancingLinks.getSolutionsMap().keySet())
	{
		int[][]solution = new int[matrixDimension][matrixDimension];
		for(int i=0;i<solution.length;i++)
			for(int j=0;j<solution[i].length;j++)
				solution[i][j]=puzzle[i][j];
		
//		System.out.println("\n Solution number " + key + "\n");
		List<Integer> solutionRow = sudokuDancingLinks.getSolutionsMap().get(key);
		for(Integer row : solutionRow)
		{
			int d= row%matrixDimension+1;
			int c= (row/matrixDimension)%matrixDimension;
			int r = row/(matrixDimension*matrixDimension);
			solution[r][c]=d;
		//	puzzle[r][c] = d;
		}
		solutionsArray.add(solution);
		/*System.out.println("Solution ->");
		for(int i=0;i<matrixDimension;i++)
		{
			for(int j=0;j<matrixDimension;j++)
				System.out.print(solution[i][j]);
			System.out.println();
		}*/
	
	}
	return solutionsArray;
	}
	
	
	public static void main(String args[]) throws Exception
	{
		SudokuDancingLinks sdlx = new SudokuDancingLinks(9,modeDlx.VALIDATOR);
		/*
		 * fetch key
		 * puzzle 1 = 4x4 
		 * puzzle 2 = 9x9
		 * puzzle 3 = 9x9
		 */
		
//		int[][] puzzle = SudokuDancingLinks.getSamplePuzzles(6);
		
		int[][] puzzle2 = 
		{
		{0,	0,	0,	5,	0,	0,	0,	7,	0},	
		{0,	0,	0,	0,	0,	2,	0,	0,	0},	
		{3,	0,	0,	0,	0,	0,	0,	0,	0},	
		{9,	0,	0,	0,	5,	0,	0,	8,	0},	
		{1,	0,	0,	0,	0,	0,	0,	3,	0},	
		{0,	0,	0,	0,	8,	0,	0,	0,	0},	
		{5,	7,	0,	2,	1,	0,	0,	0,	0},	
		{0,	3,	0,	0,	9,	6,	0,	0,	0},	
		{0,	0,	8,	0,	0,	0,	0,	0,	0}
			
		};
		
		int[][] puzzle3 =
		{
				{0,	6,	0,	0,	0,	0,	0,	0,	0},	
				{0,	5,	0,	0,	4,	0,	0,	0,	0},	
				{0,	0,	4,	0,	7,	5,	0,	0,	0},	
				{5,	0,	0,	4,	0,	9,	0,	0,	1},	
				{0,	0,	0,	0,	0,	0,	0,	7,	0},	
				{0,	3,	0,	0,	0,	0,	5,	6,	0},	
				{7,	1,	0,	0,	0,	0,	6,	0,	0},	
				{8,	0,	0,	0,	0,	6,	9,	0,	0},	
				{0,	0,	0,	9,	0,	0,	0,	0,	0},	
		};
		int[][] puzzle =
		{
		{0,	3,	5,	0,	0,	0,	0,	0,	0},	
		{0,	0,	0,	9,	0,	0,	1,	0,	0},	
		{0,	0,	9,	0,	0,	0,	0,	6,	0},	
		{8,	0,	0,	0,	2,	0,	0,	1,	0},	
		{2,	0,	0,	0,	0,	0,	7,	0,	0},	
		{0,	4,	0,	7,	0,	0,	0,	8,	3},	
		{0,	7,	0,	0,	9,	0,	0,	0,	2},	
		{0,	0,	0,	6,	0,	7,	0,	9,	0},	
		{4,	0,	8,	3,	0,	0,	6,	0,	0}
		};
		
		sdlx.generateSudokuDlxSparseMatrix();
		sdlx.pushGivensInSudokuDlx(puzzle);
		sdlx.solveSudokuDlx();
		
		sdlx.clearTheGivensFromSudokuDlx(puzzle);
		sdlx.printSolvedSudoku(puzzle);
		
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		
		DancingLinks dlx = (DancingLinks)o;
		if(this.modedlx.equals(modeDlx.VALIDATOR))
		{
			//System.out.println(dlx.numberOfSolutions);
			if( dlx.getSolutionsMap().size() > 1)
			{
				dlx.stop = true;
				stopped = true;
				validSudoku = false;
				
			}
		}
				
	}

	
}
