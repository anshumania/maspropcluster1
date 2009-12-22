package biz.karms.hidato.app.game.impl;

import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.Matrix;
import java.util.List;

/**
 * Describes hidato game with matrix, solutions and constraint.
 *
 * @author Matus Pleva
 */
public class HidatoGame extends Game {

    /**
     * List of all possible solutions.
     */
    private List<Matrix> solutions;

    /**
     *
     * @param constraint informations that describe game
     * @param gameMatrix game grid
     */
    public HidatoGame(Constraint constraint, Matrix gameMatrix) {
        super(constraint, gameMatrix);
    }

    /**
     *
     * @param constraint informations that describe game
     * @param gameMatrix game grid
     * @param time time spent on playing game
     * @param solutions list of all possible solutions
     */
    public HidatoGame(Constraint constraint, Matrix gameMatrix, long time, List<Matrix> solutions) {
        super(constraint, gameMatrix, time);
        this.solutions = solutions;
    }

    /**
     * @return List of possible solutions
     */
    public List<Matrix> getSolutions() {
        return this.solutions;
    }

    /**
     * @param solutions list of possible solutions
     */
    public void setSolutions(List<Matrix> solutions) {
        this.solutions = solutions;
    }
}
