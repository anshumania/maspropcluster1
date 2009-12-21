package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import com.masprop.cluster1.shared.controller.GameValidator;
import com.masprop.cluster1.sudoku.model.SudokuGame;

public class SudokuGameValidatorTest {

	@Test
	public void testValidateGame() {
		
		 System.out.println("-------testValidateGame--------");

		GameValidator gmv = new SudokuGameValidator();
		try {
			boolean validGame = gmv.validateGame(SudokuGame.getSampleSudokuGame());
			assertTrue(validGame);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-------test ended--------");

	}

}
