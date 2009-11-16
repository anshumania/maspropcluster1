package com.masprop.cluster1.sudoku.controller;

import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.model.GameType;

import junit.framework.TestCase;

public class SudokuApplicationControllerTest extends TestCase {

	public void testGetSudokuApplicationController() {
		
		ApplicationController sac = SudokuApplicationController.getSudokuApplicationController();
		assertNotNull(sac);
		
		//fail("Not yet implemented");
	}

	public void testGetInstance() {
		
		ApplicationController sac = SudokuApplicationController.getInstance(GameType.SUDOKU);
		assertNotNull(sac);
		
		ApplicationController sac2 = SudokuApplicationController.getInstance(GameType.SUDOKU);
		assertNotNull(sac2);
		
		assertEquals(sac,sac2);
		
		
		//fail("Not yet implemented");
	}

	public void testGetGameToPlay() {
		

		
		fail("Not yet implemented");
	}

}
