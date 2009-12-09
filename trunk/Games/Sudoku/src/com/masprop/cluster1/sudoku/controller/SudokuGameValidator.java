package com.masprop.cluster1.sudoku.controller;

import java.util.Observable;
import java.util.Observer;

import com.masprop.cluster1.shared.controller.GameValidator;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.sudoku.model.SudokuGame;
import com.masprop.cluster1.sudoku.model.SudokuMatrix;

/**
 * 
 * @author Matteo de Martino
 *
 */
public class SudokuGameValidator implements GameValidator{

	
	
	@Override
	public boolean validateGame(Game game) {
		// TODO Auto-generated method stub
		
		SudokuAlgorithm sdka = new SudokuAlgorithm();

                if(game instanceof SudokuGame)
                {
                    SudokuGame sdkGame = (SudokuGame)game;
                    int[][] sdkPuzzle = ((SudokuMatrix)sdkGame.getGameMatrix()).getSdkPuzzle();
                    return sdka.validateASudokuGame(sdkPuzzle);
                }

                System.err.println("Game Not Supported");
		return false;
		
		
	}

	public static void main(String args[])
	{

		GameValidator gmv = new SudokuGameValidator();
		try {
			System.out.println((gmv.validateGame(SudokuGame.getSampleSudokuGame())));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
