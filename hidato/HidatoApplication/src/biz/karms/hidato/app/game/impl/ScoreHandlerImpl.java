package biz.karms.hidato.app.game.impl;

import biz.karms.hidato.app.game.ScoreHandler;
import java.util.Map;
import java.util.TreeMap;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author
 */
public class ScoreHandlerImpl implements ScoreHandler {

    private Map<Integer, String> scoreList = null;

    public void loadScoreList() {
    }

    public void saveScoreList() {
    }

    public void handleScore(String name, int difficulty, int time) {
    }

    public int computeScore(String difficulty, int time) {
        throw new NotImplementedException();
    }

    public boolean compareScore(int score) {
        throw new NotImplementedException();
    }

    public TreeMap<Integer, String> getScoreList() {
        return new TreeMap(scoreList);
    }
}
