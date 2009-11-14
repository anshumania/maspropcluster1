package biz.karms.hidato.app.game;

import com.masprop.cluster1.shared.model.Game;
import java.util.TreeMap;

/**
 * handles score in finished game
 *
 * @author
 */
public interface ScoreHandler {

    /**
     * When we want to handle a new score record
     * 
     * @param game
     */
    public void handleScore(Game game);

    /**
     *
     * @param game a finished game
     * @return score based on constraint
     */
    public int computeScore(Game game);

    /**
     *
     * @param score
     * @return true if score is higher than last record in scoreList
     */
    public boolean compareScore(int score);

    /**
     *
     * @param name is a name of the player who finished the game
     * @param score
     */
    public void insertScore(int name, int score);

    /**
     * 
     * @return current score list
     */
    TreeMap<Integer, String> getScoreList();
}
