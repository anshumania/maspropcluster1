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

    public Constraint(int difficultyLevel, int noFilledCells, int shape, int width, int height) {
        this.difficultyLevel = difficultyLevel;
        this.noFilledCells = noFilledCells;
        this.shape = shape;
        this.width = width;
        this.height = height;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNoFilledCells() {
        return noFilledCells;
    }

    public void setNoFilledCells(int noFilledCells) {
        this.noFilledCells = noFilledCells;
    }

    public int getShape() {
        return shape;
    }

    public void setShape(int shape) {
        this.shape = shape;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
