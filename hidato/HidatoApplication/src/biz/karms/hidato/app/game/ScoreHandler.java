package biz.karms.hidato.app.game;

import java.util.TreeMap;

/**
 *
 * @author
 */
public interface ScoreHandler {

    /**
     *
     */
    void loadScoreList();

    /**
     *
     */
    void saveScoreList();

    /**
     * When we want to handle a new score record.
     *
     * @param name is a name of the player who finished the game.
     * @param difficulty is the finished game difficulty.
     * @param time id the time the game took.
     */
    void handleScore(String name, int difficulty, int time);

    /**
     * 
     * @return current score list
     */
    TreeMap<Integer, String> getScoreList();
}
