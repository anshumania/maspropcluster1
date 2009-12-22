package biz.karms.hidato.app.controller.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import com.masprop.cluster1.shared.controller.StatisticsManager;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameLevelType;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Adrien Daunou
 */


public class HidatoStatisticsManager implements StatisticsManager {

    //public static String FILE_NAME;
    //public static File RESOURCE_LOCATION = new File(System.getProperty("user.dir").toString()+"/HidatoHighScores.properties");
    private SortedProperties highScores = null;

    public HidatoStatisticsManager() {
        loadHighScores();
    }

    //static {
        //FILE_NAME = HidatoStatisticsManager.class.getResource(RESOURCE_LOCATION).getFile();

  
    
    
    //}

    @Override
    public double getScoreFor(Game game) {

        // a score is a function of the time taken and the difficulty

        double gLfact = .33; // the weightage to the gamelevel
        double tTaken = .52; // the weightage to the time taken to solve the game
        double nGivens = .15; // the number of the n givens in the hidato


        double gameL = game.getConstraint().getGameLevelType() == GameLevelType.EXTREME ? 750 : game.getConstraint().getGameLevelType() == GameLevelType.DIFFICULT ? 500 : game.getConstraint().getGameLevelType() == GameLevelType.MEDIUM ? 350 : 250;

        int noOfGivens = game.getConstraint().getNoOfFilledCells();
        long time = game.getTime();

        double score = gLfact * gameL * 40 - (tTaken * time) / 36 - nGivens * noOfGivens * 24;
        return score;
    }

    private void loadHighScores() {
        highScores = new SortedProperties();
        try {
            FileInputStream fs = new FileInputStream(System.getProperty("user.dir").toString()+"/HidatoHighScores.properties");
            highScores.load(fs);
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
        if (!(null == scoreToRemove)) { //this score is greater than at least one
            highScores.remove(scoreToRemove);
        }

        highScores.put(String.valueOf(score.intValue()), name);

        try {
            FileOutputStream fos = new FileOutputStream(new File(System.getProperty("user.dir").toString()+"/HidatoHighScores.properties"));
            highScores.store(fos, null);
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(HidatoStatisticsManager.class.getName()).log(Level.SEVERE, null, ex);
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

}
class SortedProperties extends Properties {

    @Override
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

