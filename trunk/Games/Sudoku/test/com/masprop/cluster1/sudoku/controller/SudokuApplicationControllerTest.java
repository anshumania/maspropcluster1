package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.model.GameType;

/**
 * 
 * @author Matteo de Martino
 *
 */
public class SudokuApplicationControllerTest {

	@Before
	public void setUp() throws Exception {
				
		if(ApplicationController.getGameToPlay() == null)
			ApplicationController.setGameToPlay(GameType.HIDATO);
			
		assertFalse(ApplicationController.getGameToPlay() == null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInitalizeComponents() {
		//Create the ApplicationController
		ApplicationController sac = ApplicationController.getInstance(GameType.SUDOKU);
		assertNotNull(sac);
		//Initialize the components
		//Have to typeCast to get access to the protected method in the same package
		if(sac instanceof SudokuApplicationController)
			((SudokuApplicationController)sac).initalizeComponents();
		
		//GameGenerator should not be null
		assertNotNull(sac.getGameManager().getGameGenerator());
		//GameSolver should not be null
		
		assertNotNull(sac.getGameManager().getGameSolver());
		//GameValidator should not be null
		assertNotNull(sac.getGameManager().getGameValidator());
		//StatisticsManager should not be null
		assertNotNull(sac.getGameManager().getStatisticsManager());
		//StorageManager should not be null
		assertNotNull(sac.getGameManager().getStorageManager());
	}

	@Test
	public void testGetSudokuApplicationController() {
		ApplicationController sac = SudokuApplicationController.getSudokuApplicationController();
		assertNotNull(sac);
		
	}

	@Test
	public void testGetInstance() {
		ApplicationController sac = ApplicationController.getInstance(GameType.SUDOKU);
		assertNotNull(sac);
		
		ApplicationController sac2 = ApplicationController.getInstance(GameType.SUDOKU);
		assertNotNull(sac2);
		
		assertEquals(sac,sac2);
	}

	@Test
	public void testGetAndSetGameManager() {
		//Create the ApplicationController
		ApplicationController sac = ApplicationController.getUniqueInstance();
		assertNotNull(sac);

		//GameManager is not initialized 
		//Test get
		assertNull(sac.getGameManager());
		//Test set
		sac.setGameManager(new SudokuGameManager());
		//Test set and get
		assertNotNull(sac.getGameManager());
	}


	@Test
	public void testGetAndSetGameToPlay() {
		
		if(ApplicationController.getGameToPlay()!=null)
			ApplicationController.setGameToPlay(null);
		
		//Test Get and Set
		ApplicationController.setGameToPlay(GameType.SUDOKU);
		assertNotNull(ApplicationController.getGameToPlay());
		
	}

	@Test
	public void testGetGuiManager() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGenerateGUI() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetGuiManager() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetUniqueInstance() {
		//	Get the ApplicationController -> This method assumes the Controller has been created
		
		ApplicationController sac = ApplicationController.getUniqueInstance();
		assertNotNull(sac);
		ApplicationController sac2 = ApplicationController.getUniqueInstance();
		assertNotNull(sac2);
		
		//Test both the instances are the same
		assertEquals(sac, sac2);
	}
	

	@Test
	public void testSetUniqueInstance() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetGameToPlay() {
		fail("Not yet implemented"); // TODO
	}

}
