package biz.karms.hidato.app.game.impl;

import biz.karms.hidato.app.game.ScoreHandler;
import java.util.SortedMap;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author
 */
public class ScoreHandlerImpl implements ScoreHandler {

    private SortedMap<Integer, String> scoreList;

    public ScoreHandlerImpl() {
        this.loadScoreList();
    }

    public void loadScoreList() {
    }

    public void saveScoreList() {
    }

    public void handleScore(String difficulty, int time) {
    }

    public int computeScore(String difficulty, int time) {
        throw new NotImplementedException();
    }

    public boolean compareScore(int score) {
        throw new NotImplementedException();
    }

    public void deleteLastRecord() {
    }

    public void insertRecord(String name, int score) {
    }

    public SortedMap<Integer, String> getScoreList() {
        return scoreList;
    }
}
