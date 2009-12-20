package com.masprop.cluster1.sudoku.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import com.masprop.cluster1.shared.controller.Algorithm;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.sudoku.controller.dancingLinks.Node;

import com.masprop.cluster1.sudoku.controller.dancingLinks.SudokuDancingLinks;
import com.masprop.cluster1.sudoku.controller.dancingLinks.SudokuRandomizer;
import com.masprop.cluster1.sudoku.model.SudokuGame;

/**
 * 
 * This an Observable class.
 * The idea is that the GameControllers i.e.
 * (or one of them)
 * the GameGenerator
 * the GameSolver
 * the GameValidator
 * will Observe this class to know if the
 * sudoku is valid or not . starting with Validator.
 * 
 * @author Anshuman
 *
 */

public class SudokuAlgorithm implements Algorithm{

	public enum modeDlx { GENERATOR , VALIDATOR , SOLVER };
	
	public enum GivensPerGameLevelPerGameVariant{
		fourxfourEasy, fourxfourMedium, fourxfourDifficult, fourxfourExtreme,
		ninexnineEasy, ninexnineMedium, ninexnineDifficult,
		sixteenxsixteenEasy, sixteenxsixteenMedium, sixteenxsixteenDifficult, sixteenxsixteenExtreme ;
		
	static public int evaluate(GivensPerGameLevelPerGameVariant z)
		{
			switch(z)
			{
			case fourxfourEasy : return 10 ; 
			case fourxfourMedium : return 7 ;
			case fourxfourDifficult : return 5 ;
			case fourxfourExtreme : return 4 ;
			case ninexnineEasy : return 45 ; 
			case ninexnineMedium : return 40 ;
			case ninexnineDifficult : return 34 ;
			case sixteenxsixteenEasy : return 200 ;
			case sixteenxsixteenMedium : return 200 ;
			case sixteenxsixteenDifficult : return 200 ;
			case sixteenxsixteenExtreme  : return 200 ;
			default : return -1;
			}
		}
	}
	
	SudokuDancingLinks sdlx;
	boolean working;
	int solutionCounter;
	
	int[][] genSudoku;
	boolean[][][] allowed;
	int numberFilled;
	
	List<Integer> shuffledCells = new ArrayList<Integer>();
	
	
	@Override
	public void performAlgorithmics(Game game) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean validateASudokuGame(int[][] sudokuPuzzle)
	{
		
	
		
		sdlx = new SudokuDancingLinks(sudokuPuzzle.length, modeDlx.VALIDATOR);
		
		
		sdlx.generateSudokuDlxSparseMatrix();
		sdlx.pushGivensInSudokuDlx(sudokuPuzzle);
		sdlx.solveSudokuDlx();
		//while(!sdlx.stopped);
			
		sdlx.clearTheGivensFromSudokuDlx(sudokuPuzzle);
//		sdlx.printSolvedSudoku(sudokuPuzzle);
		return sdlx.validSudoku;
		
	}
	/**
	 * Generates a completely random NxN sudoku
	 * for gameLevels DIFFICULT, MEDIUM and EASY
	 * using the dimension,the user givens and the gameLEVEL
	 * @param cons
	 * @return a valid generated sudoku
	 */
	
	public int[][] generateASudokuGame(int dim, int givens, GameLevelType level)
	{

    	int[][] genSudoku = new int[dim][dim];
    	for(int i=0;i<dim;i++)
    		for(int j=0;j<dim;j++)
    			genSudoku[i][j]=0;

		
		
		//Fetch our very own SudokuRandomizer
		SudokuRandomizer sdkRandomizer = new SudokuRandomizer(genSudoku,level);
		// set the algorithm for the randomizer !!
		sdkRandomizer.setSdkAlgo(this);
	
		
		switch(level)
		{
		case DIFFICULT :    		if(dim == 4)
										genSudoku = sdkRandomizer.createSudoku(GivensPerGameLevelPerGameVariant.evaluate(GivensPerGameLevelPerGameVariant.fourxfourDifficult));
                                    if(dim == 9)
                                        genSudoku = sdkRandomizer.createSudoku(GivensPerGameLevelPerGameVariant.evaluate(GivensPerGameLevelPerGameVariant.ninexnineDifficult));
                                    if(dim == 16)
                                        genSudoku = sdkRandomizer.createSudoku(GivensPerGameLevelPerGameVariant.evaluate(GivensPerGameLevelPerGameVariant.sixteenxsixteenDifficult));
                                    break;
		case MEDIUM	   :
                                        if(dim == 4)
                                            genSudoku = sdkRandomizer.createSudoku(GivensPerGameLevelPerGameVariant.evaluate(GivensPerGameLevelPerGameVariant.fourxfourMedium));
                                        if(dim == 9)
                                            genSudoku = sdkRandomizer.createSudoku(GivensPerGameLevelPerGameVariant.evaluate(GivensPerGameLevelPerGameVariant.ninexnineMedium));
                                        if(dim == 16)
                                            genSudoku = sdkRandomizer.createSudoku(GivensPerGameLevelPerGameVariant.evaluate(GivensPerGameLevelPerGameVariant.sixteenxsixteenMedium));
                                    break;
		case EASY	   :
                                        if(dim == 4)
                                            genSudoku = sdkRandomizer.createSudoku(GivensPerGameLevelPerGameVariant.evaluate(GivensPerGameLevelPerGameVariant.fourxfourEasy));
                                        if(dim == 9)
                                            genSudoku = sdkRandomizer.createSudoku(GivensPerGameLevelPerGameVariant.evaluate(GivensPerGameLevelPerGameVariant.ninexnineEasy));
                                        if(dim == 16)
                                            genSudoku = sdkRandomizer.createSudoku(GivensPerGameLevelPerGameVariant.evaluate(GivensPerGameLevelPerGameVariant.sixteenxsixteenEasy));
                                    break;
        
		case EXTREME	   :  //EXTREME for 9x9 have already been handled 
										if(dim == 4)
							                genSudoku = sdkRandomizer.createSudoku(GivensPerGameLevelPerGameVariant.evaluate(GivensPerGameLevelPerGameVariant.fourxfourExtreme));
							            /*if(dim == 9)
							                genSudoku = sdkRandomizer.createSudoku(45);*/
							            if(dim == 16)
							                genSudoku = sdkRandomizer.createSudoku(GivensPerGameLevelPerGameVariant.evaluate(GivensPerGameLevelPerGameVariant.sixteenxsixteenExtreme));
							            break;
		default   :
						genSudoku = null;
						break;
				
		}
		int noOfGivens = 0;
		for(int i=0;i<dim;i++)
		{
    		for(int j=0;j<dim;j++)
    		{
    			if(genSudoku[i][i]>0) noOfGivens++;
    			System.out.print(genSudoku[i][j]);
    		}
    		System.out.println();
		}
		
		System.out.println("no of givens in final sudoku =" + noOfGivens);
		
		return genSudoku;
		
	
	}
	
	public int[][] solveASudokuGame(int[][] sudokuPuzzle)
	{
		sdlx = new SudokuDancingLinks(sudokuPuzzle.length, modeDlx.SOLVER);
		
		
		sdlx.generateSudokuDlxSparseMatrix();
		sdlx.pushGivensInSudokuDlx(sudokuPuzzle);
		sdlx.solveSudokuDlx();
		//while(!sdlx.stopped);
		
		List<int[][]> solutions = sdlx.fetchSolvedSudokus(sudokuPuzzle);	
		sdlx.clearTheGivensFromSudokuDlx(sudokuPuzzle);
		
		return solutions.isEmpty() ? null : solutions.get(0);
		
//		sdlx.printSolvedSudoku(sudokuPuzzle);
//		return sdlx.validSudoku;
		
	}
	
	public static void main(String args[])
	{
		SudokuAlgorithm sdkAlgo = new SudokuAlgorithm();
		int[][] sudokuPuzzle = sdkAlgo.generateASudokuGame(9, 0, GameLevelType.EASY);
		//test for invalidity and solving an invalid sudoku
		/*int[][] sudokuPuzzle = 
		{
			{4,3,1,1},
			{0,1,4,0},
			{0,4,2,1},
			{0,4,2,1}
		};*/
		System.out.println(sdkAlgo.validateASudokuGame(sudokuPuzzle));;
		
		int[][] solution = sdkAlgo.solveASudokuGame(sudokuPuzzle);
		for(int i=0;i<solution.length;i++)
		{
			for(int j=0;j<solution[i].length;j++)
				System.out.print(solution[i][j]);
			System.out.println();
		}
	}
	
		
}
