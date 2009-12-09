package com.masprop.cluster1.sudoku.controller;

import com.masprop.cluster1.shared.controller.GameSolver;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.sudoku.model.SudokuGame;
/**
 * 
 * @author Matteo de Martino
 *
 */
public class SudokuGameSolver implements GameSolver {

	@Override
	public Game solveGame(Game game) {
		// TODO Auto-generated method stub
		SudokuAlgorithm sdka = new SudokuAlgorithm();
		if(game instanceof SudokuGame)
		{
			SudokuGame sdkGame = (SudokuGame)game;
			int[][] puzzle = sdkGame.getGameMatrix().getSdkPuzzle();
			int[][] solution = sdka.solveASudokuGame(puzzle);
			if(null == solution)
				return null;
			sdkGame.getGameMatrix().setSdkPuzzle(solution);
			sdkGame.getGameMatrix().createSdkCells(); //required for the UI
			return sdkGame;
		}
		
		return null;
	}

}
