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
import com.masprop.cluster1.sudoku.controller.dancingLinks.SudokuRandomizer;

// TODO: Auto-generated Javadoc
/**
 * Tests for randomly creating Sudokus.
 * 
 * @author Matteo de Martino
 */
public class SudokuRandomizerTest {
	
	/** The Sudoku Algorithm. */
	SudokuAlgorithm sdka =  null; // the algorithm to user
	
	/** The dimension to use. */
	int N; //the dimension to use
	
	
	@Before
	public void setUp() throws Exception {
		
		sdka = new SudokuAlgorithm();

	}

	/**
	 * Tear down.
	 * 
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
		
		sdka = null;
	}

	/**
	 * A test to create a truly random random sudoku
	 * test for 9x9
	 * Test method for {@link com.masprop.cluster1.sudoku.controller.dancingLinks.SudokuRandomizer#createSudoku(int)}.
	 */
	@Test
	public void testCreateSudoku() {
		System.out.println("-------testCreateSudoku--------");

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
    	System.out.println("-------test ended--------");
	}

	/**
	 * A test for the generating a randomly filled valid
	 * partial sudoku for the user.
	 * Test method for {@link com.masprop.cluster1.sudoku.controller.dancingLinks.SudokuRandomizer#createRandomPartialSudoku(int)}.
	 */
	@Test
	public void testCreateRandomPartialSudoku() {
		
		System.out.println("-------testCreateRandomPartialSudoku--------");
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
    	System.out.println("-------test ended--------");	
	}

}
