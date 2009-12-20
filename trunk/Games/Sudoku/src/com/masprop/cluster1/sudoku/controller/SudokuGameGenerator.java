package com.masprop.cluster1.sudoku.controller;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



import com.masprop.cluster1.shared.controller.GameGenerator;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.shared.model.Matrix;
import com.masprop.cluster1.sudoku.controller.dancingLinks.SudokuRandomizer;
import com.masprop.cluster1.sudoku.model.SudokuGame;
import com.masprop.cluster1.sudoku.model.SudokuGameVariant;
import com.masprop.cluster1.sudoku.model.SudokuMatrix;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.NoFixedFacet;

/**
 * 
 * @author Matteo de Martino
 *
 */
public class SudokuGameGenerator implements GameGenerator {

	
	

	@Override
	public Game generateGame(Constraint constraint) {

		
		// in this we have to do 2 things
		// 1. first of all if the user wants a very hard game
		//    just return him one from the set of games
		//	  already created by the solver . y make him wait eh ?
		
		// 2. define the range of the levels of difficulty
		//    and how to 'define' difficulty itself
		// 	  LEVEL : Extremely DIFFICULT : 17  // just give him one to solve 
		//    LEVEL : DIFFICULT 18-27     :  try 4000 sudokus per second !!
		//    LEVEL : MEDIUM  27-33 - to make the algo generate in this range the number of 
		//							  tries has to be greater than 3000 sudokus per second !!							
		//    LEVEL : EASY    33-45 -  the generation can be done with say 1000 sudokus per second
		
		
		SudokuAlgorithm sdkAlgo = new SudokuAlgorithm();
		//the number of indices
		int N= constraint.getGameVariant() == SudokuGameVariant.NINEcrossNINE ?
			9 : constraint.getGameVariant() == SudokuGameVariant.FOURcrossFOUR ?
			4 : constraint.getGameVariant() == SudokuGameVariant.SIXTEENcrossSIXTEEN ?
			16 : -1		;
		System.out.println("This is the value of N ----> " + N);
		if(N == -1) System.err.println("GAME VARIANT DOES NOT EXIST !!");
		
		//the number of givens by the user -> will only exist in self creation mode !
		int noOfGivens = constraint.getNoOfFilledCells();

		
        // if constraint's gameLevel is null => create action
		if( null == constraint.getGameLevelType())
			return createAGame(constraint, N);

		
			
		//the gameLevel type  -> based on this level and above ranges a sudoku will generated
		GameLevelType gameLevel = constraint.getGameLevelType();
		int[][] sudokuPuzzle = null;

		// generate the game using the constraints i.e. the dimension,the noOfGivens,and the level !
		// welcome to SudoWorld !
		//TODO to use the value of the userGivens.
		//This will only actually be used when a user wants to create a sudoku.
		
		if(N==9)
		sudokuPuzzle = (gameLevel == GameLevelType.EXTREME) ?
		  SudokuHardRFA.getAnExtremeSudoku() :
			 sdkAlgo.generateASudokuGame(N, noOfGivens, gameLevel);
		  else
			  sudokuPuzzle=sdkAlgo.generateASudokuGame(N, noOfGivens, gameLevel);

//		int[][] sudokuPuzzle = sdkAlgo.generateASudokuGame(N,noOfGivens, gameLevel);
		  //TODO change
//		SudokuGame xyz = new SudokuGame(constraint, new SudokuMatrix(N,sudokuPuzzle)); 
		return new SudokuGame(constraint, new SudokuMatrix(N,sudokuPuzzle));
	
	}
	
	
	public Game createAGame(Constraint constraint, int N)
	{
		//already checked if its a create calll
		//  i.e. the gamelevel is null 
		// now just fetch the givens and generate a randomized 
		
	
    	int[][] genSudoku = new int[N][N];
    	for(int i=0;i<N;i++)
    		for(int j=0;j<N;j++)
    			genSudoku[i][j]=0;
		SudokuRandomizer sudoku = new SudokuRandomizer(genSudoku);
		genSudoku = sudoku.createRandomPartialSudoku(constraint.getNoOfFilledCells());
		
		
		return new SudokuGame(constraint, new SudokuMatrix(N,genSudoku));
		
	}
			

	
	
	public static void main(String args[])
	{
		Constraint cons = new Constraint(GameLevelType.EASY,SudokuGameVariant.NINEcrossNINE,24);
		Constraint consEx = new Constraint(GameLevelType.EXTREME,SudokuGameVariant.NINEcrossNINE,24);
		SudokuGameGenerator sgg = new SudokuGameGenerator();
		Game sg = sgg.generateGame(consEx);
		System.out.println((SudokuGame)sg);
	}

}
