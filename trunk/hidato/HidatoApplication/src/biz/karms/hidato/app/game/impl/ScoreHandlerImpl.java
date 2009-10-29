package biz.karms.hidato.app.game.impl;

import biz.karms.hidato.app.game.ScoreHandler;
import java.util.SortedMap;

/**
 *
 * @author
 */
public class ScoreHandlerImpl implements ScoreHandler {

    private SortedMap<Integer,String> scoreList;

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
    }

    public boolean compareScore(int score) {
    }

    public void deleteLastRecord() {
    }

    public void insertRecord(String name, int score) {
    }

    public SortedMap<Integer, String> getScoreList() {
        return scoreList;
    }
}
