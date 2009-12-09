package com.masprop.cluster1.sudoku.controller;

import java.util.ArrayList;
import java.util.List;

import com.masprop.cluster1.shared.controller.StatisticsManager;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameLevelType;
/**
 * 
 * @author Andrea Gritti
 *
 */
public class SudokuStatisticsManager implements StatisticsManager {

	@Override
	public double getScoreFor(Game game) {

		// a score is a function of the time taken and the difficulty
		
		double gLfact = .33; // the weightage to the gamelevel
		double tTaken=  .52; // the weightage to the time taken to solve the game
		double nGivens= .15; // the number of the givens in teh sudoku
		
		//time = 3600+60
	
		
		double gameL = game.getConstraint().getGameLevelType() == GameLevelType.EXTREME ?
				750 : game.getConstraint().getGameLevelType() == GameLevelType.DIFFICULT ?
				500 : game.getConstraint().getGameLevelType() == GameLevelType.MEDIUM ?
				350 : 250;
		
		int noOfGivens = game.getConstraint().getNoOfFilledCells();
		long time = game.getTime();
		
		double score = gLfact*gameL*40 - (tTaken*time)/36 - nGivens*noOfGivens*24;
		return score;
	}

	@Override
	public List<String> getStatistics() {
		// TODO Auto-generated method stub
		return new ArrayList<String>();
	}

	@Override
	public List<Game> loadGame() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveGame(Game game) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScoreFor(Game game) {
		// TODO Auto-generated method stub

	}

}
