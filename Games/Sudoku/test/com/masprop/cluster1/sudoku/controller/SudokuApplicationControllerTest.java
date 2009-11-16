package com.masprop.cluster1.sudoku.controller;

import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.model.GameType;

import junit.framework.TestCase;

public class SudokuApplicationControllerTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		
		if(SudokuApplicationController.getGameToPlay() == null)
			SudokuApplicationController.setGameToPlay(GameType.SUDOKU);
			
		assertFalse(SudokuApplicationController.getGameToPlay() == null);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetSudokuApplicationController() {
		ApplicationController sac = SudokuApplicationController.getSudokuApplicationController();
		assertNotNull(sac);
	}

	public void testGetInstance() {
		ApplicationController sac = SudokuApplicationController.getInstance(GameType.SUDOKU);
		assertNotNull(sac);
		
		ApplicationController sac2 = SudokuApplicationController.getInstance(GameType.SUDOKU);
		assertNotNull(sac2);
		
		assertEquals(sac,sac2);
	}

	public void testGetGameManager() {
		fail("Not yet implemented");
	}

	public void testSetGameManager() {
		fail("Not yet implemented");
	}

	public void testGetGameToPlay() {
		fail("Not yet implemented");
	}

	public void testGetGuiManager() {
		fail("Not yet implemented");
	}

	public void testGenerateGUI() {
		fail("Not yet implemented");
	}

	public void testInitalizeComponents() {
		fail("Not yet implemented");
	}

	public void testSetGuiManager() {
		fail("Not yet implemented");
	}

	public void testGetUniqueInstance() {
		fail("Not yet implemented");
	}

	public void testSetUniqueInstance() {
		fail("Not yet implemented");
	}

	public void testSetGameToPlay() {
		fail("Not yet implemented");
	}

}
