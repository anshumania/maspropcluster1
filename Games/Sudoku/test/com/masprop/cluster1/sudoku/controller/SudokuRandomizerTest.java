/**
 * 
 */
package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.shared.model.GameType;
import com.masprop.cluster1.sudoku.controller.SudokuAlgorithm;
import com.masprop.cluster1.sudoku.controller.dancingLinks.SudokuRandomizer;

/**
 * @author ANSHUMAN
 *
 */
public class SudokuRandomizerTest {
	
	SudokuAlgorithm sdka =  null; // the algorithm to user
	int N; //the dimension to use
	
	@Before
	public void setUp() throws Exception {
		
		sdka = new SudokuAlgorithm();

	}

	@After
	public void tearDown() throws Exception {
		
		sdka = null;
	}

	/**
	 * 
	 * A test to create a truly random random sudoku
	 * test for 9x9
	 * Test method for {@link com.masprop.cluster1.sudoku.controller.dancingLinks.SudokuRandomizer#createSudoku(int)}.
	 */
	@Test
	public void testCreateSudoku() {
		

		int givens = 34;
		N = 9;
    	int[][] genSudoku = new int[N][N];
    	for(int i=0;i<N;i++)
    		for(int j=0;j<N;j++)
    			genSudoku[i][j]=0;
    	
    	SudokuRandomizer sudoku = new SudokuRandomizer(genSudoku,GameLevelType.EASY); 
    	sudoku.setSdkAlgo(sdka);
    	
    	
    	int fGivens = 0;
  		System.out.println("Creating with " + givens + " givens ") ;
        int[][] aSudoku = sudoku.createSudoku(givens++);
        
        for(int i=0;i<N;i++)
    		for(int j=0;j<N;j++)
    			if(aSudoku[i][j]>0) fGivens++;
    	
    	System.out.println("no. of givens finally " + fGivens);
    	System.out.println("done!");
    	assertNotNull(aSudoku);   // the sudoku generated is not null
    	assertTrue(fGivens > 0 );  //there should be some givens in the generated sudoku
		
	}

	/**
	 * 
	 * A test for the generating a randomly filled valid
	 * partial sudoku for the user.
	 * Test method for {@link com.masprop.cluster1.sudoku.controller.dancingLinks.SudokuRandomizer#createRandomPartialSudoku(int)}.
	 */
	@Test
	public void testCreateRandomPartialSudoku() {
		
		N = 9;
    	int[][] genSudoku = new int[N][N];
    	for(int i=0;i<N;i++)
    		for(int j=0;j<N;j++)
    			genSudoku[i][j]=0;
		SudokuRandomizer sudoku = new SudokuRandomizer(genSudoku);
		genSudoku = sudoku.createRandomPartialSudoku(34);
		int fGivens=0;
        for(int i=0;i<N;i++)
        {
    		for(int j=0;j<N;j++)
    		{
    			if(genSudoku[i][j]>0) fGivens++;
    			System.out.print(genSudoku[i][j]);
    		}
    		System.out.println();
        }
    	
    	System.out.println("no. of givens finally " + fGivens);
    	assertNotNull(genSudoku); // the sudoku generated is not null
    	assertTrue(fGivens > 0); // the number of final givens is greater than 0
		
	}

}
