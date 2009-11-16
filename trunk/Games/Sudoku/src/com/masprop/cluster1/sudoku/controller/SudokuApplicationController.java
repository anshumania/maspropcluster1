package com.masprop.cluster1.sudoku.controller;

import javax.activation.UnsupportedDataTypeException;

import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.model.GameType;

public class SudokuApplicationController extends ApplicationController {
	
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
}	

