package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

import com.masprop.cluster1.sudoku.model.SudokuGame;

public class SudokuStatisticsManagerTest {

	@Test
	public void testGetScoreFor() {
		
		try {
			SudokuStatisticsManager ssm = new SudokuStatisticsManager();
			SudokuGame testGame =SudokuGame.getSampleSudokuGame();
			//Scores are calculated when the game is over
			testGame.setTime(1400);
			double score = 0.0;
			score =  ssm.getScoreFor(testGame);
			assertFalse(score == 0.0);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Test
	public void testGetStatistics() {
		
		SudokuStatisticsManager ssm = new SudokuStatisticsManager();
		Properties listOfHighScore  = null; 
		listOfHighScore = ssm.getStatistics();
		assertNotNull(listOfHighScore);
		
	}

	@Test
	public void testAddHighScore() {
		
		SudokuStatisticsManager ssm = new SudokuStatisticsManager();
			
		ssm.addHighScore(10000.00, "Android");
		Properties listHighScore = ssm.getStatistics();
		assertTrue(listHighScore.containsKey(new String("10000")));
		assertTrue("Android".equals((String)listHighScore.get(new String("10000"))));
		
	 	listHighScore.remove(new Double(10000));
		assertTrue(listHighScore.size() == 9);
		listHighScore.put("0", "MrX");
		assertTrue(listHighScore.size() == 10);
		
        try {
            FileOutputStream fos = new FileOutputStream(SudokuStatisticsManager.FILE_NAME);
            listHighScore.store(fos, null);
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(SudokuStatisticsManager.class.getName()).log(Level.SEVERE, null, ex);
        }

		
//		fail("Not yet implemented");
	}

	@Test
	public void testIsAHighScore() {
		
		SudokuStatisticsManager ssm = new SudokuStatisticsManager();
		assertTrue(ssm.isAHighScore(9999999.00));
		assertFalse(ssm.isAHighScore(-1.0));
		
	}

}
