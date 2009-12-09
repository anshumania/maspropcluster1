package com.masprop.cluster1.sudoku.model;

import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.shared.model.GameVariant;
import com.masprop.cluster1.shared.model.Matrix;

import com.masprop.cluster1.sudoku.controller.dancingLinks.SudokuDancingLinks;

/**
 * 
 * @author Andrea Gritti
 *
 */
public class SudokuGame extends Game {
	

		
	public SudokuGame(Constraint constraint, Matrix matrix)
	{
		super(constraint, matrix);
	}
	
	public static SudokuGame getSampleSudokuGame() throws Exception
	{
		Constraint cons = new Constraint(GameLevelType.EASY,SudokuGameVariant.NINEcrossNINE,14);
		//int puzzle[][] = SudokuDancingLinks.getSamplePuzzles(4);
	
		
		int puzzle[][] =  new int[][]
    		{
				{0,	0,	0,	3,	0,	1,	7,	0,	0},	
				{0,	0,	3,	0,	8,	0,	4,	0,	9},	
				{8,	0,	0,	2,	0,	0,	0,	0,	0},	
				{0,	8,	0,	9,	4,	0,	0,	0,	0},	
				{0,	0,	2,	0,	0,	0,	0,	0,	0},	
				{5,	0,	6,	0,	1,	0,	0,	2,	0},	
				{1,	0,	0,	0,	0,	0,	0,	0,	8},	
				{0,	0,	0,	0,	0,	0,	6,	7,	0},	
				{0,	0,	0,	5,	0,	3,	9,	0,	0}
    		};
		
		
		SudokuMatrix smx = new SudokuMatrix(9,puzzle);
		SudokuGame sgm = new SudokuGame(cons,smx);
		
		return sgm;
		
	}
	
	@Override
	public SudokuMatrix getGameMatrix()
	{
		return (SudokuMatrix)super.getGameMatrix();
	}
	
	public String toString()
	{
		return "[SudokuGame={Constraint="+ getConstraint() + ",Matrix="+getGameMatrix()+"}]";
	}

}
