package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

import com.masprop.cluster1.sudoku.model.SudokuGame;

// TODO: Auto-generated Javadoc
/**
 * The Class SudokuStatisticsManagerTest.
 */
public class SudokuStatisticsManagerTest {

	/**
	 * Tests calculation of a score for a game.
	 */
	@Test
	public void testGetScoreFor() {
		System.out.println("--------testGetScoreFor---------");

		
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
		System.out.println("--------test ended---------");

	}

	/**
	 * Test get statistics for the Sudoku Application.
	 */
	@Test
	public void testGetStatistics() {
		System.out.println("--------testGetStatistics---------");
		
		SudokuStatisticsManager ssm = new SudokuStatisticsManager();
		Properties listOfHighScore  = null; 
		listOfHighScore = ssm.getStatistics();
		assertNotNull(listOfHighScore);
		System.out.println("--------test ended---------");
	}

	/**
	 * Test that high score is addded to the high score file.
	 */
	@Test
	public void testAddHighScore() {
		System.out.println("--------testAddHighScore---------");
		
		SudokuStatisticsManager ssm = new SudokuStatisticsManager();
			
		ssm.addHighScore(10000.00, "Android");
		Properties listHighScore = ssm.getStatistics();
		assertTrue(listHighScore.containsKey(new String("10000")));
		assertTrue("Android".equals((String)listHighScore.get(new String("10000"))));
		
	 	listHighScore.remove("10000");
		assertTrue(listHighScore.size() == 9);
		listHighScore.put("0", "MrX");
		assertTrue(listHighScore.size() == 10);
		
		
        try {
            FileOutputStream fos = new FileOutputStream(SudokuStatisticsManager.HIGH_SCORE_FILE_NAME);
            listHighScore.store(fos, null);
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(SudokuStatisticsManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("--------test ended---------");
//		fail("Not yet implemented");
	}

	/**
	 * Tests whether a score is a high score.
	 */
	@Test
	public void testIsAHighScore() {
		System.out.println("--------testIsAHighScore---------");
		
		SudokuStatisticsManager ssm = new SudokuStatisticsManager();
		assertTrue(ssm.isAHighScore(9999999.00));
		assertFalse(ssm.isAHighScore(-1.0));
		System.out.println("--------test ended---------");
		
	}

}
