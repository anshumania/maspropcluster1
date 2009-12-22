package com.masprop.cluster1.shared.model;

/**
 * Class represents game with a current game <tt>matrix</tt>
 * and all necessary information for generating, solving, validating
 * or for handling the score of this game.
 *
 * @see Matrix
 * @see Constraint
 * @author Matus Pleva
 */
public abstract class Game {

    /**
     * Constraint that describes the game level,
     * number of already filled cells, shape.
     */
    private Constraint constraint;
    /**
     * Game grid as a set of cells.
     */
    private Matrix gameMatrix;
    /**
     * Time spent on playing game.
     */
    private long time = 0L;

    /**
     * Class constructor.
     *
     * @param constraint informations that describe game
     * @param gameMatrix game grid
     */
    public Game(Constraint constraint, Matrix gameMatrix) {
        this.constraint = constraint;
        this.gameMatrix = gameMatrix;
    }

    /**
     *
     * @param constraint informations that describe game
     * @param gameMatrix game grid
     * @param time time spent on playing game
     */
    public Game(Constraint constraint, Matrix gameMatrix, long time) {
        this.constraint = constraint;
        this.gameMatrix = gameMatrix;
        this.time = time;
    }

    /**
     * @return constraint that describes game
     */
    public Constraint getConstraint() {
        return constraint;
    }

    /**
     * @param constraint describes the game
     */
    public void setConstraint(Constraint constraint) {
        this.constraint = constraint;
    }

    /**
     * @return game matrix
     */
    public Matrix getGameMatrix() {
        return gameMatrix;
    }

    /**
     * @param matrix represents the game grid as a set of cells
     */
    public void setGameMatrix(Matrix matrix) {
        this.gameMatrix = matrix;
    }

    /**
     * @return time spent on playing game
     */
    public long getTime() {
        return time;
    }

    /**
     * @param time time spent on playing game
     */
    public void setTime(long time) {
        this.time = time;
    }
}

