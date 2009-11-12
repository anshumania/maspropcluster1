package biz.karms.hidato.app.game.impl;

import biz.karms.hidato.app.game.Game;
import biz.karms.hidato.app.game.matrix.impl.Matrix;
import java.util.List;

/**
 * describes hidato game with matrix, solutions, and constraint
 *
 * @author
 */
public class HidatoGame implements Game {

    private Matrix gameMatrix;
    private List<Matrix> solutions;
    private Constraint constraint;

    /**
     * class constructor
     *
     * @param constraint
     */
    public HidatoGame(Constraint constraint) {
        this.constraint = constraint;
    }

    public Matrix getGameMatrix() {
        return gameMatrix;
    }

    public void setGameMatrix(Matrix gameMatrix) {
        this.gameMatrix = gameMatrix;
    }

    public List<Matrix> getSolutions() {
        return solutions;
    }

    public void setSolutions(List<Matrix> solutions) {
        this.solutions = solutions;
    }

    public Constraint getConstraint() {
        return constraint;
    }

    public void setConstraint(Constraint constraint) {
        this.constraint = constraint;
    }
}
