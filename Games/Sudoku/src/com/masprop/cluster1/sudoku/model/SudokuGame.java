package com.masprop.cluster1.sudoku.model;

import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.Matrix;

/**
 * 
 * @author Andrea Gritti
 *
 */
public class SudokuGame extends Game {
	

	public SudokuGame()
	{
		super(new Constraint(null, null, 0),new SudokuMatrix());
		//TODO dummy implementation
	}
	
	public SudokuGame(Constraint constraint, Matrix matrix)
	{
		super(constraint, matrix);
	}

}
