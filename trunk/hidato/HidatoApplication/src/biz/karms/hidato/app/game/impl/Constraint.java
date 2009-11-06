package biz.karms.hidato.app.game.impl;

/**
 *
 * @author
 */
public class Constraint {

    private int difficultyLevel;
    private int noFilledCells;
    private int shape;
    private int width;
    private int height;

    /**
     *
     * @param difficultyLevel
     * @param noFilledCells
     * @param shape
     * @param width
     * @param height
     */
    public Constraint(int difficultyLevel, int noFilledCells, int shape, int width, int height) {
        this.difficultyLevel = difficultyLevel;
        this.noFilledCells = noFilledCells;
        this.shape = shape;
        this.width = width;
        this.height = height;
    }

    /**
     *
     * @return
     */
    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    /**
     *
     * @param difficultyLevel
     */
    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    /**
     *
     * @return
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     *
     * @return
     */
    public int getNoFilledCells() {
        return noFilledCells;
    }

    /**
     *
     * @param noFilledCells
     */
    public void setNoFilledCells(int noFilledCells) {
        this.noFilledCells = noFilledCells;
    }

    /**
     *
     * @return
     */
    public int getShape() {
        return shape;
    }

    /**
     *
     * @param shape
     */
    public void setShape(int shape) {
        this.shape = shape;
    }

    /**
     *
     * @return
     */
    public int getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }
}
