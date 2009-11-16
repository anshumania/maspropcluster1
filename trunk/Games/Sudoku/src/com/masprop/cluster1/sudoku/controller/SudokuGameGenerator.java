package com.masprop.cluster1.sudoku.controller;

import com.masprop.cluster1.shared.controller.GameGenerator;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.sudoku.model.SudokuGame;

public class SudokuGameGenerator implements GameGenerator {


	@Override
	public Game generateGame(Constraint constraint) {
		// TODO Auto-generated method stub
		return new SudokuGame(constraint);
	}

}
