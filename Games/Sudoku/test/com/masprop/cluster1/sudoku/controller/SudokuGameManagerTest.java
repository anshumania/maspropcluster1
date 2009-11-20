package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.controller.GameManager;
import com.masprop.cluster1.shared.controller.GameSolver;
import com.masprop.cluster1.shared.controller.GameValidator;
import com.masprop.cluster1.shared.controller.StatisticsManager;
import com.masprop.cluster1.shared.controller.StorageManager;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.shared.model.GameType;
import com.masprop.cluster1.sudoku.model.SudokuGame;
import com.masprop.cluster1.sudoku.model.SudokuGameVariant;
import com.masprop.cluster1.sudoku.model.SudokuMatrix;

/**
 * 
 * @author Andrea Gritti
 *
 */
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

	
	/**
	 * Tests the operation of the set and get of a GameGenerator
	 */
	@Test
	public void testGetAndSetGameGenerator() {
		//TODO update when GameGenerator is implemented
		ApplicationController sac = ApplicationController.getUniqueInstance();
		assertNotNull(sac.getGameManager().getGameGenerator());
		
		GameManager oldGameManager = sac.getGameManager();
		GameManager newGameManager = new SudokuGameManager();
		sac.setGameManager(newGameManager);
		
		assertNotSame(oldGameManager, sac.getGameManager() );
		
	}

	/**
	 * Tests the operation of the set and get of a GameSolver
	 */
	@Test
	public void testGetAndSetGameSolver() {
		//TODO update when GameSolver is implemented
		ApplicationController sac = ApplicationController.getUniqueInstance();
		assertNotNull(sac.getGameManager().getGameSolver());
		
		GameSolver oldgs = sac.getGameManager().getGameSolver();
		GameSolver newgs = new SudokuGameSolver();
		sac.getGameManager().setGameSolver(newgs);
		assertNotSame(oldgs, sac.getGameManager().getGameSolver());
	}

	/**
	 * Test the operation of the set and get of a GameValidator
	 */
	@Test
	public void testGetAndSetGameValidator() {
		//TODO update when GameValidator is implemented
		ApplicationController sac = ApplicationController.getUniqueInstance();
		assertNotNull(sac.getGameManager().getGameValidator());
		
		GameValidator oldgv = sac.getGameManager().getGameValidator() ;
		GameValidator newgv = new SudokuGameValidator() ;
		sac.getGameManager().setGameValidator(newgv);
		assertNotSame(oldgv, sac.getGameManager().getGameValidator());
	}

	/**
	 * Tests the operation of the set and get of a StorageManager
	 */
	@Test
	public void testGetAndSetStorageManager() {
		//TODO update when StorageManager is implemented
		ApplicationController sac = ApplicationController.getUniqueInstance();
		assertNotNull(sac.getGameManager().getStorageManager());
		
		StorageManager oldsm = sac.getGameManager().getStorageManager();
		StorageManager newsm = new SudokuStorageManager() ;
		sac.getGameManager().setStorageManager(newsm);
		assertNotSame(oldsm, sac.getGameManager().getGameValidator());
		
	}

	/**
	 * Test the operation of getting a new game
	 */
	@Test
	public void testGetNewGame() {
		//TODO update when NewGame is implemented
		Constraint constraint = new Constraint(GameLevelType.EASY,SudokuGameVariant.NINEcrossNINE,10);
		Game sudokuGame = ApplicationController.getUniqueInstance().getGameManager().getNewGame(constraint);
		assertNotNull(sudokuGame);
		assertTrue(sudokuGame instanceof SudokuGame);
		

	}
    
	/**
	 * Test the operation of validation of a game
	 */
	@Test
	public void testValidateGame() {
		//TODO update when ValidateGame is implemented
		Constraint constraint = new Constraint(GameLevelType.EASY,SudokuGameVariant.NINEcrossNINE,10);
		Game game = new SudokuGame(constraint, new SudokuMatrix());
		boolean validation = true;
		validation = ApplicationController.getUniqueInstance().getGameManager().getGameValidator().validateGame(game);
		assertFalse(validation);
	}

	/**
	 * Test the operation of solving a game
	 */
	@Test
	public void testSolveGame() {
		//TODO update when SolveGame is implemented
		Constraint constraint = new Constraint(GameLevelType.EASY,SudokuGameVariant.NINEcrossNINE,10);
		Game game = new SudokuGame(constraint, new SudokuMatrix());
		Game solvedGame = ApplicationController.getUniqueInstance().getGameManager().getGameSolver().solveGame(game);
		
		//assuming that we will return a new instance of a solved game
		assertNotSame(game, solvedGame);
		
	}

	/**
	 * Test the operation of saving a game
	 */
	@Test
	public void testSaveGame() {
		//TODO update when StorageManager SaveSoFile is implemented
		Constraint constraint = new Constraint(GameLevelType.EASY,SudokuGameVariant.NINEcrossNINE,10);
		Game game = new SudokuGame(constraint, new SudokuMatrix());
		
		ApplicationController sac = ApplicationController.getUniqueInstance();
		sac.getGameManager().saveGame(game,new File("x"));
		
	}

	/**
	 * Tests the operation of loading a game
	 */
	@Test
	public void testLoadGame() {
		//TODO update when StorageManager loadFromFile is implemented
		ApplicationController sac = ApplicationController.getUniqueInstance();
		sac.getGameManager().loadGame(new File("x"));	
	
	}

	/**
	 * Tests the operation of getting the statistics for a game
	 */
	@Test
	public void testGetStatistics() {
		//TODO update when StatisticsManager is implemented
		ApplicationController sac = ApplicationController.getUniqueInstance();
		assertNotNull(sac.getGameManager().getStatistics());	
	}

	/**
	 * Tests the operation of a get and set of a StatisticsManager
	 */
	@Test
	public void testGetAndSetStatisticsManager() {
		//TODO update when StatisticsManager is implemented
		ApplicationController sac = ApplicationController.getUniqueInstance();
		assertNotNull(sac.getGameManager().getStatisticsManager());
		
		StatisticsManager oldsm = sac.getGameManager().getStatisticsManager();
		StatisticsManager newsm = new SudokuStatisticsManager();
		sac.getGameManager().setStatisticsManager(newsm);
		assertNotSame(oldsm, sac.getGameManager().getStatisticsManager());
		
	}

}
