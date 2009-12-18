package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuHardRFATest {

	@Test
	public void testGetAnExtremeSudoku() {
		
		int[][] sdkPuzzle = SudokuHardRFA.getAnExtremeSudoku();
		assertNotNull(sdkPuzzle);
	}

}
