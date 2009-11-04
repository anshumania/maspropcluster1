package biz.karms.hidato.app.game.impl;

import biz.karms.hidato.app.game.Game;
import biz.karms.hidato.app.game.ScoreHandler;
import java.util.Map;
import java.util.TreeMap;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author
 */
public class ScoreHandlerImpl implements ScoreHandler {

    private Map<Integer, String> scoreList;

    /**
     * class constructor
     *
     * @param scoreList list of high scores
     */
    public ScoreHandlerImpl(Map<Integer, String> scoreList) {
        this.scoreList = scoreList;
    }

    public void handleScore(Game game) {
    }

    public int computeScore(Game game) {
        throw new NotImplementedException();
    }

    public boolean compareScore(int score) {
        throw new NotImplementedException();
    }

    public void insertScore(int name, int score) {
        throw new NotImplementedException();
    }

    public TreeMap<Integer, String> getScoreList() {
        return new TreeMap(scoreList);
    }
}
