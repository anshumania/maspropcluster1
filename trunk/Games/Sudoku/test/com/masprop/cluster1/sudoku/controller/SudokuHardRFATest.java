package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.*;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class SudokuHardRFATest.
 */
public class SudokuHardRFATest {

	/**
	 * Test to get a random extreme sudoku by indexing
	 * randomly into the ExtremeSudoku17
	 */
	@Test
	public void testGetAnExtremeSudoku() {
		
		System.out.println("-------testGetAnExtremeSudoku--------");

		int[][] sdkPuzzle = SudokuHardRFA.getAnExtremeSudoku();
		assertNotNull(sdkPuzzle);
		System.out.println("-------test ended--------");

	}

}
