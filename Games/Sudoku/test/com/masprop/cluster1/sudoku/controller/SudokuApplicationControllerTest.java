package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.model.GameType;
import com.masprop.cluster1.sudoku.view.SudokuGUIManagerSwingWorker;

/**
 * 
 * @author Matteo de Martino
 *
 */
public class SudokuApplicationControllerTest {

	
	
	@Before
	public void setUp() throws Exception {
				
		if(ApplicationController.getGameToPlay() == null)
			ApplicationController.setGameToPlay(GameType.SUDOKU);
			
		assertFalse(ApplicationController.getGameToPlay() == null);
	}

	@After
	public void tearDown() throws Exception {
	}

	
	/**
	 * Tests the initialization of all the components 
	 * of an ApplicationController.
	 * Goal : To initialize the ApplicationController
	 * Effect : All components in the ApplicationController should 
	 *          have been instantiated
	 */
	
	@Test
	public void testInitalizeComponents() {
		//Create the ApplicationController
		System.out.println("----------testInitalizeComponents-----------");
		ApplicationController sac = ApplicationController.getInstance(GameType.SUDOKU);
		assertNotNull(sac);
		//Initialize the components
		//Have to typeCast to get access to the protected method in the same package
		if(sac instanceof SudokuApplicationController)
		{
			((SudokuApplicationController)sac).initalizeComponents();
			}
			 
		
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
		System.out.println("----------test ended-----------");
	}

	/**
	 * Tests whether the ApplicationController is
	 * infact a SudokuApplicationController
	 */
	@Test
	public void testGetSudokuApplicationController() {
		System.out.println("----------testGetSudokuApplicationController-----------");
		ApplicationController sac = SudokuApplicationController.getSudokuApplicationController();
		assertNotNull(sac);
		System.out.println("----------test ended-----------");
	}
	
	/**
	 * Tests whether getInstance returns always the same instance
	 * for the particular GameType.
	 */
	@Test
	public void testGetInstance() {
		System.out.println("----------testGetInstance-----------");
		ApplicationController sac = ApplicationController.getInstance(GameType.SUDOKU);
		assertNotNull(sac);
		
		ApplicationController sac2 = ApplicationController.getInstance(GameType.SUDOKU);
		assertNotNull(sac2);
		
		assertEquals(sac,sac2);
		System.out.println("----------test ended-----------");
	}
	
	/**
	 * Tests the operation of the set and get for GameManager
	 */
	@Test
	public void testGetAndSetGameManager() {
		System.out.println("----------testGetAndSetGameManager-----------");
		//Create the ApplicationController
		ApplicationController sac = ApplicationController.getUniqueInstance();
		assertNotNull(sac);

		//GameManager is not initialized 
		//Test get
		assertNotNull(sac.getGameManager());
		//Test set
		sac.setGameManager(new SudokuGameManager());
		//Test set and get
		assertNotNull(sac.getGameManager());
		System.out.println("----------test ended-----------");
	}

	/**
	 * Test the operation of the set and get for GameToPlay
	 */
	@Test
	public void testGetAndSetGameToPlay() {
		System.out.println("----------testGetAndSetGameToPlay-----------");
		if(ApplicationController.getGameToPlay()!=null)
			ApplicationController.setGameToPlay(null);
		
		//Test Get and Set
		ApplicationController.setGameToPlay(GameType.SUDOKU);
		assertNotNull(ApplicationController.getGameToPlay());
		System.out.println("----------test ended-----------");
	}

	
	/**
	 * Test whether the getUniqueInstance always 
	 * returns the unique Singleton instance
	 */
	@Test
	public void testGetUniqueInstance() {
		System.out.println("----------testGetUniqueInstance-----------");
		//	Get the ApplicationController -> This method assumes the Controller has been created
		
		ApplicationController sac = ApplicationController.getUniqueInstance();
		assertNotNull(sac);
		ApplicationController sac2 = ApplicationController.getUniqueInstance();
		assertNotNull(sac2);
		
		//Test both the instances are the same
		assertEquals(sac, sac2);
		System.out.println("----------test ended-----------");
	}
	
	
	/**
	 * Tests whether the GUI is generated 
	 * 
	 */
	@Test
	public void testGenerateGUI() {
		System.out.println("----------testGenerateGUI-----------");
		//	Get the ApplicationController -> This method assumes the Controller has been created
		
		ApplicationController sac = ApplicationController.getUniqueInstance();
		assertNotNull(sac);
		
		assertNotNull(sac.getGuiManager());
		assertNotNull(sac.getGuiManager().getGui());
		if(sac instanceof SudokuApplicationController)
			((SudokuApplicationController)sac).generateGUI();
		
		//Test both the instances are the same
//		assertEquals(sac, sac2);
		
		System.out.println("----------test ended-----------");
	}
	

	/**
	 * Tests the operation of the set and get for GuiManager
	 *//*
	@Test
	public void testGetGuiManager() {
		
		ApplicationController sac = ApplicationController.getUniqueInstance();
		assertNotNull(sac);

		//GameManager is not initialized 
		//Test get
		assertNotNull(sac.getGuiManager());
		//Test set
		sac.setGuiManager(new SudokuGUIManager(null));
		//Test set and get
		assertNotNull(sac.getGameManager());

	}*/
	
	}
