package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.assertNotNull;

import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.model.GameType;
import com.masprop.cluster1.shared.view.GUI;
import com.masprop.cluster1.shared.view.GUIManager;
import com.masprop.cluster1.sudoku.view.SudokuGUI;
import com.masprop.cluster1.sudoku.view.SudokuGUIManager;
/**
 * The Sudoku ApplicationController
 * 
 * @author Anshuman Mehta
 *
 */
public class SudokuApplicationController extends ApplicationController {
	
	//Singleton
	private SudokuApplicationController()
	{
		// defeat instantiation
		setUniqueInstance(this);
	}
	
	public static ApplicationController getSudokuApplicationController()
	{
	
		if(null == getGameToPlay())
			throw new IllegalArgumentException("Cannot create a Controller for " + getGameToPlay() );
		else
			return getUniqueInstance()== null ?
			 	new SudokuApplicationController() :  getUniqueInstance();
	}
	
	@Override
	public void initalizeComponents()
	{
	    GUI sudokuGui = new SudokuGUI();
		//GUIManager guiManager = new SudokuGUIManager(sudokuGui);
	    setGuiManager(sudokuGui.getGuiManager());
	    
	    setGameManager(new SudokuGameManager());
		
		assert getGameManager()!=null;
		
		getGameManager().setGameGenerator(new SudokuGameGenerator());
		getGameManager().setGameSolver(new SudokuGameSolver());
		getGameManager().setGameValidator(new SudokuGameValidator());
		getGameManager().setStorageManager(new SudokuStorageManager());
		getGameManager().setStatisticsManager(new SudokuStatisticsManager());
		
	}
	
	public static void main(String args[])
	{
		ApplicationController.setGameToPlay(GameType.SUDOKU);
		ApplicationController sac = ApplicationController.getInstance(GameType.SUDOKU);
		assertNotNull(sac);
		//Initialize the components
		//Have to typeCast to get access to the protected method in the same package
		if(sac instanceof SudokuApplicationController)
		{
			((SudokuApplicationController)sac).initalizeComponents();
			((SudokuApplicationController)sac).generateGUI();
		}

	}

	@Override
	protected void generateGUI() {
		getGuiManager().getGui().init();
		
	}
}	

