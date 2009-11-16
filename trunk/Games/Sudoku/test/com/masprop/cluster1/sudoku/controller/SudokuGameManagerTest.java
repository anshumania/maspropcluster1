package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.controller.GameManager;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.shared.model.GameType;
import com.masprop.cluster1.sudoku.model.SudokuGame;
import com.masprop.cluster1.sudoku.model.SudokuGameVariant;

public class SudokuGameManagerTest {
	
	boolean isInitialized = false;

	@Before
	public void setUp() throws Exception {
		
		ApplicationController.setGameToPlay(GameType.SUDOKU);
			
		assertFalse(ApplicationController.getGameToPlay() == null);

		ApplicationController sac = ApplicationController.getInstance(GameType.SUDOKU);
		assertNotNull(sac);
		//Initialize the components
		//Have to typeCast to get access to the protected method in the same package
		if(sac instanceof SudokuApplicationController)
			((SudokuApplicationController)sac).initalizeComponents();
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		
	ApplicationController sac = ApplicationController.getUniqueInstance();
		if(sac instanceof SudokuApplicationController)
		{
			sac = (SudokuApplicationController)sac;
			sac.getGameManager().setGameGenerator(null);
			sac.getGameManager().setGameSolver(null);
			sac.getGameManager().setGameValidator(null);
			sac.getGameManager().setStatisticsManager(null);
			sac.getGameManager().setStorageManager(null);
			sac.setGameManager(null);
			
		}
	 	
		ApplicationController.setUniqueInstance(null);
		assertEquals(null,ApplicationController.getUniqueInstance());
		
		ApplicationController.setGameToPlay(null);
		assertEquals(null, ApplicationController.getGameToPlay());
	}

	@Test
	public void testGetAndSetGameGenerator() {
		ApplicationController sac = ApplicationController.getUniqueInstance();
		assertNotNull(sac.getGameManager().getGameGenerator());
		
		GameManager oldGameManager = sac.getGameManager();
		GameManager newGameManager = new SudokuGameManager();
		sac.setGameManager(newGameManager);
		
		assertNotSame(oldGameManager, sac.getGameManager());
		
	}

	@Test
	public void testGetAndSetGameSolver() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetAndSetGameValidator() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetAndSetStorageManager() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetNewGame() {
		Constraint constraint = new Constraint(GameLevelType.EASY,SudokuGameVariant.NINEcrossNINE,10);
		Game sudokuGame = ApplicationController.getUniqueInstance().getGameManager().getNewGame(constraint);
		assertNotNull(sudokuGame);
		assertTrue(sudokuGame instanceof SudokuGame);
		

	}

	@Test
	public void testValidateGame() {
		Constraint constraint = new Constraint(GameLevelType.EASY,SudokuGameVariant.NINEcrossNINE,10);
		Game game = new SudokuGame(constraint);
		boolean validation = true;
		validation = ApplicationController.getUniqueInstance().getGameManager().getGameValidator().validateGame(game);
		assertFalse(validation);
	}

	@Test
	public void testSolveGame() {
		Constraint constraint = new Constraint(GameLevelType.EASY,SudokuGameVariant.NINEcrossNINE,10);
		Game game = new SudokuGame(constraint);
		Game solvedGame = ApplicationController.getUniqueInstance().getGameManager().getGameSolver().solveGame(game);
		
		//assuming that we will return a new instance of a solved game
		assertNotSame(game, solvedGame);
		
	}

	@Test
	public void testSaveGame() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testLoadGame() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetStatistics() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetStatisticsManager() {
		fail("Not yet implemented"); // TODO
	}

}
