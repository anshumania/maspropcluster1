package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.sudoku.controller.dancingLinks.SudokuDancingLinks;
import com.masprop.cluster1.sudoku.model.SudokuGame;

// TODO: Auto-generated Javadoc
/**
 * The Class SudokuAlgorithmTest.
 */
public class SudokuAlgorithmTest {

	/**
	 * Tests the validation of an invalid fourxfour sudoku game.
	 */
	@Test
	public void testValidateASudokuGameFourxFourInvalid() {
		 System.out.println("-------testValidateASudokuGameFourxFourInvalid--------");

		try
		{
		SudokuAlgorithm sdkAlgo = new SudokuAlgorithm();
		//int[][] sudokuPuzzle = sdkAlgo.generateASudokuGame(9, 0, GameLevelType.EASY);
		//test for invalidity and solving an invalid sudoku
		int[][] sudokuPuzzle = SudokuDancingLinks.getSamplePuzzles(1);	
		assertFalse(sdkAlgo.validateASudokuGame(sudokuPuzzle));;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			
		}
		System.out.println("-------test ended--------");

	}
	
	/**
	 * Tests the validation of a valid fourxfour sudoku game.
	 */
	@Test
	public void testValidateASudokuGameFourxFourValid() {
		System.out.println("-------testValidateASudokuGameFourxFourValid--------");
		try 
		{
		SudokuAlgorithm sdkAlgo = new SudokuAlgorithm();
		int[][] sudokuPuzzle1 = SudokuDancingLinks.getSamplePuzzles(7);
		assertTrue(sdkAlgo.validateASudokuGame(sudokuPuzzle1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-------test ended--------");
	}	
	
	/**
	 * Test the validation of a valid ninexnine sudoku game.
	 */
	@Test
	public void testValidateASudokuGameNinexNineValid() {
		System.out.println("-------testValidateASudokuGameNinexNineValid--------");
		try 
		{
		SudokuAlgorithm sdkAlgo = new SudokuAlgorithm();
		int[][] sudokuPuzzle2 = SudokuDancingLinks.getSamplePuzzles(2);
		assertTrue(sdkAlgo.validateASudokuGame(sudokuPuzzle2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-------test ended--------");
	}
	
	/**
	 * Test the validation of an invalid ninexnine sudoku game.
	 */
	@Test
	public void testValidateASudokuGameNinexNineInValid() {
		System.out.println("-------testValidateASudokuGameNinexNineInValid--------");
	  try
	  {
		SudokuAlgorithm sdkAlgo = new SudokuAlgorithm();
		int[][] sudokuPuzzle3 = SudokuDancingLinks.getSamplePuzzles(4);
		assertFalse(sdkAlgo.validateASudokuGame(sudokuPuzzle3));
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-------test ended--------");
		
	}

	/**
	 * Test the generation a ninexnine sudoku game.
	 */
	@Test
	public void testGenerateASudokuGame() {
		System.out.println("-------testGenerateASudokuGame--------");
		
		SudokuAlgorithm sdkAlgo = new SudokuAlgorithm();
		int[][] sudokuPuzzle = sdkAlgo.generateASudokuGame(9, 0, GameLevelType.EASY);
		assertNotNull(sudokuPuzzle);
		assertTrue(sdkAlgo.validateASudokuGame(sudokuPuzzle));
		System.out.println("-------test ended--------");
	
	}

	/**
	 * Test whether the algorithm has solved the sudoku game.
	 */
	@Test
	public void testSolveASudokuGame() {
		System.out.println("-------testSolveASudokuGame--------");
		try {
		SudokuAlgorithm sdkAlgo = new SudokuAlgorithm();
		int[][] sudokuPuzzle2 = SudokuDancingLinks.getSamplePuzzles(2);
		assertTrue(sdkAlgo.validateASudokuGame(sudokuPuzzle2));
		
		sudokuPuzzle2 = sdkAlgo.solveASudokuGame(sudokuPuzzle2);
		
		boolean solved = false;
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
				solved = sudokuPuzzle2[i][j] == 0 ? false : true;
		
		assertTrue(solved);
		assertTrue(sdkAlgo.validateASudokuGame(sudokuPuzzle2));
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-------test ended--------");
	}

}
