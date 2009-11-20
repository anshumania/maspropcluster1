package com.masprop.cluster1.sudoku.controller;


import com.masprop.cluster1.shared.controller.GameGenerator;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.Matrix;
import com.masprop.cluster1.sudoku.model.SudokuGame;
import com.masprop.cluster1.sudoku.model.SudokuMatrix;

/**
 * 
 * @author Matteo de Martino
 *
 */
public class SudokuGameGenerator implements GameGenerator {


	@Override
	public Game generateGame(Constraint constraint) {
		// TODO Auto-generated method stub
		
						
			int[] puzzleFourXFour= 
			{ 8,-1,-1, 6,-1,-1,5, -1, 1,
					 6,-1, 7,-1,-1, 3,-1, 2,-1,
					 -1, 5,-1,-1, 2,-1,-1,-1,-1,
					 -1,-1,-1, 1, 8,-1,-1, 3,-1,
					 -1,-1, 6, 9,-1, 5, 1,-1,-1,
					 -1, 4,-1,-1, 6, 2,-1,-1,-1,
					 -1,-1,-1,-1, 9,-1,-1, 6,-1,
					 -1, 6,-1, 4,-1,-1, 2,-1, 5,
					  4,-1, 5,-1,-1,-1,-1,-1,-1  };
		
 	
		return new SudokuGame(constraint,new SudokuMatrix(9, 9, puzzleFourXFour));
	}

}
