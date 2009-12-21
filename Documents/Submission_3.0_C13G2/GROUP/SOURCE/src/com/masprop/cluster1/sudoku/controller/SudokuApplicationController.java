package com.masprop.cluster1.sudoku.controller;

import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.controller.StorageManager;
import com.masprop.cluster1.shared.model.GameType;
import com.masprop.cluster1.shared.view.GUI;
import com.masprop.cluster1.sudoku.view.SudokuGUI;
// TODO: Auto-generated Javadoc

/**
 * The entry point into the Sudoku Application is the
 * Sudoku ApplicationController. It provides a singleton instance
 * to itself.
 * 
 * @author Anshuman Mehta
 */
public class SudokuApplicationController extends ApplicationController {
	
	//Singleton
	/**
	 * Instantiates a new sudoku application controller.
	 */
	private SudokuApplicationController()
	{
		// defeat instantiation
		setUniqueInstance(this);
	}
	
	/**
	 * Gets the sudoku application controller.
	 * 
	 * @return the sudoku application controller
	 */
	public static ApplicationController getSudokuApplicationController()
	{
	
		if(null == getGameToPlay())
			throw new IllegalArgumentException("Cannot create a Controller for " + getGameToPlay() );
		else
			return getUniqueInstance()== null ?
			 	new SudokuApplicationController() :  getUniqueInstance();
	}
	
	/**
	 * The entry point to the application begins from here where all the components 
	 * for the SudokuApplication Controller are instantiated.
	 * @see com.masprop.cluster1.shared.controller.ApplicationController#initalizeComponents()
	 */
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
		getGameManager().setStorageManager(new StorageManager());
		getGameManager().setStatisticsManager(new SudokuStatisticsManager());
		
	}
	

	public static void main(String args[])
	{
		ApplicationController.setGameToPlay(GameType.SUDOKU);
		ApplicationController sac = ApplicationController.getInstance(GameType.SUDOKU);
		assert sac!=null;
		//Initialize the components
		//Have to typeCast to get access to the protected method in the same package
		if(sac instanceof SudokuApplicationController)
		{
			((SudokuApplicationController)sac).initalizeComponents();
			((SudokuApplicationController)sac).generateGUI();
		}

	}

	/**
	 * This generates the GUI and makes it viewable
	 * @see com.masprop.cluster1.shared.controller.ApplicationController#generateGUI()
	 */
	@Override
	protected void generateGUI() {
		getGuiManager().getGui().init();
		
	}
}	

