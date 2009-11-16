package com.masprop.cluster1.sudoku.controller;

import com.masprop.cluster1.shared.controller.GameSolver;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.sudoku.model.SudokuGame;

public class SudokuGameSolver implements GameSolver {

	@Override
	public Game solveGame(Game game) {
		// TODO Auto-generated method stub
		return new SudokuGame(game.getConstraint());
	}

}
