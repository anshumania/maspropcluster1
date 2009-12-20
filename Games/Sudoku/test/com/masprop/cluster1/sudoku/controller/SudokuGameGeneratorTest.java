package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.sudoku.model.SudokuGame;
import com.masprop.cluster1.sudoku.model.SudokuGameVariant;

public class SudokuGameGeneratorTest {

	@Test
	public void testGenerateGame() {
		
		Constraint cons = new Constraint(GameLevelType.EASY,SudokuGameVariant.NINEcrossNINE,45);
		//Constraint consEx = new Constraint(GameLevelType.EXTREME,SudokuGameVariant.NINEcrossNINE,24);
		SudokuGameGenerator sgg = new SudokuGameGenerator();
		Game sg = sgg.generateGame(cons);
		System.out.println((SudokuGame)sg);
		assertNotNull(sg.getConstraint());
		assertNotNull(sg.getGameMatrix());
		assertNotNull(sg.getTime());
		
	}

	@Test
	public void testCreateAGame() {
		
		Constraint cons = new Constraint(GameLevelType.EASY,SudokuGameVariant.NINEcrossNINE,24);
		//Constraint consEx = new Constraint(GameLevelType.EXTREME,SudokuGameVariant.NINEcrossNINE,24);
		SudokuGameGenerator sgg = new SudokuGameGenerator();
		Game sg = sgg.createAGame(cons,9);
		System.out.println((SudokuGame)sg);
		assertNotNull(sg.getConstraint());
		assertNotNull(sg.getGameMatrix());
		assertNotNull(sg.getTime());

		

	}

}