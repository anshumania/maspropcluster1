package com.masprop.cluster1.sudoku.controller;

import javax.activation.UnsupportedDataTypeException;

import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.model.GameType;

public class SudokuApplicationController extends ApplicationController {
	
	private SudokuApplicationController()
	{
		// defeat instantiation
	}
	
	public static ApplicationController getSudokuApplicationController()
	{
	
		setUniqueInstance(getUniqueInstance()== null ?
			 	new SudokuApplicationController() :  getUniqueInstance());
			
			if(null == getUniqueInstance())
				throw new IllegalArgumentException("Cannot create a Controller for " + getGameToPlay() );

					
	        return getUniqueInstance();
	}
}	

