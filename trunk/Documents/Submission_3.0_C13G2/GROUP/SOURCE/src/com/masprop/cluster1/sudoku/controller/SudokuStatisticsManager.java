package com.masprop.cluster1.sudoku.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import com.masprop.cluster1.shared.controller.StatisticsManager;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.sudoku.model.SudokuGame;

import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 * 
 * Maintains the statistics for the game
 * 
 * @author Andrea Gritti
 *
 */
public class SudokuStatisticsManager implements StatisticsManager {

	public static String HIGH_SCORE_FILE_NAME;
    public static String RESOURCE_LOCATION = "/com/masprop/cluster1/sudoku/controller/resources/HighScores.datum";
    private static SortedProperties highScores;

    static {
    	
//        FILE_NAME =  SudokuStatisticsManager.class.getResource(RESOURCE_LOCATION).getFile();
    	 loadHighScores();	
    	createHighScoreFile();
    	
     
    }
    
    private static void createHighScoreFile()
    {
    	/* boolean exists = (new File("filename")).exists();
    	    if (exists) {
    	        // File or directory exists
    	    } else {
    	        // File or directory does not exist
    	    }*/
    	
    	File file = new File("HighScores.datum");
        
    	
    	OutputStream fos = null;
    	
        // Create file if it does not exist
        boolean success = false;
		try {
			success = file.createNewFile();
		
			// TODO Auto-generated catch block
		
		
		
        if (success) {
            // File did not exist and was created
        	HIGH_SCORE_FILE_NAME = file.getAbsolutePath();
        	
            	fos = new FileOutputStream(HIGH_SCORE_FILE_NAME);
                
                highScores.store(fos, null);
//                fos.close();
            }
        else {
            // File already exists
        	HIGH_SCORE_FILE_NAME = file.getAbsolutePath();
        //	System.out.println("File Exists : " + file.getAbsolutePath());
		}
		}
		catch (IOException ex) {
				System.out.println("No permissions to store HighScores on this system");
                Logger.getLogger(SudokuStatisticsManager.class.getName()).log(Level.SEVERE, null, ex);
            }
		finally
		{
			file  = null;
			
		}
        	        	
       
        } 
       
        
        
    

    @Override
    public double getScoreFor(Game game) {

        // a score is a function of the time taken and the difficulty

        double gLfact = .25; // the weightage to the gamelevel
        double tTaken = .85; // the weightage to the time taken to solve the game
        double nGivens = .10; // the number of the givens in teh sudoku

        //time = 3600+60


        double gameL = game.getConstraint().getGameLevelType() == GameLevelType.EXTREME ? 750 : game.getConstraint().getGameLevelType() == GameLevelType.DIFFICULT ? 500 : game.getConstraint().getGameLevelType() == GameLevelType.MEDIUM ? 350 : 250;

        int noOfGivens = game.getConstraint().getNoOfFilledCells();
        long time = game.getTime();

        double score = gLfact * gameL * 40 - (tTaken * time) / 36 - nGivens * noOfGivens * 24;
        return score;
    }

    private static void loadHighScores() {
        highScores = new SortedProperties();
        try {
            InputStream fs =  SudokuStatisticsManager.class.getResourceAsStream(RESOURCE_LOCATION);//new FileInputStream(FILE_NAME);
            highScores.load(fs);//new FileInputStream(FILE_NAME));

            fs.close();


        } catch (IOException ie) {
            ie.printStackTrace();
        }

    }

    @Override
    public Properties getStatistics() {

        return highScores;

    }

    @Override
    public void addHighScore(Double score, String name) {


        Object scoreToRemove = null;
        double temp = score;
        //remove only if size is greater than 10
        if (highScores.size() == 10) {
            for (Object key : highScores.keySet()) {
                
                double oscore = Double.valueOf((String) key);
                if (temp > oscore) {
                    temp = oscore;
                    scoreToRemove = key;
                }

            }
        }
        if (!(null == scoreToRemove)) { //this score is greater than atleast one
            highScores.remove(scoreToRemove);
        }

        highScores.put(String.valueOf(score.intValue()), name);


//         outside the jar file to work
        if(null != HIGH_SCORE_FILE_NAME)  // check for no permissions
        {
        try {
        	OutputStream fos = new FileOutputStream(HIGH_SCORE_FILE_NAME);
            
            highScores.store(fos, null);
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(SudokuStatisticsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    }

    @Override
    public boolean isAHighScore(double score) {

        for (Object key : highScores.keySet()) {
            double oscore = Double.valueOf((String) key);
            if (score > oscore) {
                return true;
            }

        }
        return false;
    }

    @Override
    public void setScoreFor(Game game) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Game> loadGame() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void main(String args[]) {

//        SudokuStatisticsManager ssm = new SudokuStatisticsManager();
//        ssm.highScores.list(System.out);
//        if (ssm.isAHighScore(100)) {
//            ssm.addHighScore(13.0, "mmm");
//        }
//        try {
//            FileOutputStream fos = new FileOutputStream(FILE_NAME);
//            ssm.highScores.store(fos, null);
//            fos.close();
//        } catch (IOException ex) {
//            Logger.getLogger(SudokuStatisticsManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
     	try
    	{
    	SudokuStatisticsManager ssm = new SudokuStatisticsManager();
    	SudokuGame test = SudokuGame.getSampleSudokuGame();
    	test.getConstraint().setGameLevelType(GameLevelType.EASY);
//    	test.getConstraint().setGameLevelType(GameLevelType.EXTREME);
//    	test.getConstraint().setGameLevelType(GameLevelType.DIFFICULT);
//    	test.getConstraint().setGameLevelType(GameLevelType.MEDIUM);
    	test.setTime(15+36*60+1*60*60);
    	System.out.println(ssm.getScoreFor(test));
    	}
    	catch(Exception e)
    	{
    		
    	}
        
        
        
        

    }
}
/**
 * 
 * Overridden the Properties class to fetch
 * and store Sorted properties
 * 
 * @author Anshuman Mehta
 *
 */
class SortedProperties extends Properties {

    public Enumeration keys() {
        Enumeration keysEnum = super.keys();
        Vector<Integer> keyList = new Vector<Integer>();
        while (keysEnum.hasMoreElements()) {
            keyList.add(Integer.parseInt((String) keysEnum.nextElement()));
        }
        Collections.sort(keyList);
        Collections.reverse(keyList);
        Vector<String> keySList = new Vector<String>();
        for (Integer k : keyList) {
            keySList.add(k.toString());
        }
        return keySList.elements();
    }
    

    
}

