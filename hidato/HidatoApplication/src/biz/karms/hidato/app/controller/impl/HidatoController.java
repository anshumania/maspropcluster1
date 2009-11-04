package biz.karms.hidato.app.controller.impl;

import biz.karms.hidato.app.controller.Controller;
import biz.karms.hidato.app.game.Game;
import biz.karms.hidato.app.game.matrix.impl.Matrix;
import java.util.TreeMap;

/**
 *
 * @author Michal Karm Babacek
 */
public class HidatoController implements Controller {

    public Game generateGame(int cells, int filledCells, int shape, int difficultyLevel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public TreeMap<Integer, String> getScoreList() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateScoreList(TreeMap<Integer, String> scoreList) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean validateSolution(Matrix matrix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
