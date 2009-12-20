package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.sudoku.controller.dancingLinks.SudokuDancingLinks;
import com.masprop.cluster1.sudoku.model.SudokuGame;

public class SudokuAlgorithmTest {

	@Test
	public void testValidateASudokuGameFourxFourInvalid() {
		
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
	}
	
	@Test
	public void testValidateASudokuGameFourxFourValid() {
		try 
		{
		SudokuAlgorithm sdkAlgo = new SudokuAlgorithm();
		int[][] sudokuPuzzle1 = SudokuDancingLinks.getSamplePuzzles(7);
		assertTrue(sdkAlgo.validateASudokuGame(sudokuPuzzle1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	@Test
	public void testValidateASudokuGameNinexNineValid() {
		try 
		{
		SudokuAlgorithm sdkAlgo = new SudokuAlgorithm();
		int[][] sudokuPuzzle2 = SudokuDancingLinks.getSamplePuzzles(2);
		assertTrue(sdkAlgo.validateASudokuGame(sudokuPuzzle2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testValidateASudokuGameNinexNineInValid() {
	  try
	  {
		SudokuAlgorithm sdkAlgo = new SudokuAlgorithm();
		int[][] sudokuPuzzle3 = SudokuDancingLinks.getSamplePuzzles(4);
		assertFalse(sdkAlgo.validateASudokuGame(sudokuPuzzle3));
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Test
	public void testGenerateASudokuGame() {
		
		SudokuAlgorithm sdkAlgo = new SudokuAlgorithm();
		int[][] sudokuPuzzle = sdkAlgo.generateASudokuGame(9, 0, GameLevelType.EASY);
		assertNotNull(sudokuPuzzle);
		assertTrue(sdkAlgo.validateASudokuGame(sudokuPuzzle));
		
	
	}

	@Test
	public void testSolveASudokuGame() {
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
		
	}

}
