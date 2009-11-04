package biz.karms.hidato.app.game;

import biz.karms.hidato.app.game.impl.Constraint;
import biz.karms.hidato.app.game.matrix.impl.Matrix;
import java.util.List;

/**
 * describes game with matrix, solutions, and constraint
 *
 * @author
 */
public interface Game {

    /**
     *
     * @return matrix
     */
    Matrix getGameMatrix();

    /**
     *
     * @param gameMatrix
     */
    void setGameMatrix(Matrix gameMatrix);

    /**
     *
     * @return collection of solutions
     */
    List<Matrix> getSolutions();

    /**
     *
     * @param solutions
     */
    void setSolutions(List<Matrix> solutions);

    /**
     *
     * @return constraint of the game
     */
    Constraint getConstraint();

    /**
     *
     * @param constraint
     */
    void setConstraint(Constraint constraint);
}
