package biz.karms.hidato.app.game.matrix.impl;

import biz.karms.hidato.app.game.matrix.Cell;

/**
 * represents game matrix
 *
 * @author
 */
public class Matrix {

    private Cell[][] matrix;

    /**
     * class constructor
     * 
     * @param width
     * @param height
     * @param values
     */
    public Matrix(int width, int height, int[] values) {
        matrix = new Cell[width][height];
        //TODO set value in each cell
    }

    /**
     *
     * @return matrix
     */
    public Cell[][] getMatrix() {
        return this.matrix;
    }

    /**
     *
     * @param coordinates
     * @return cell at the given coordinates
     */
    public Cell getCell(Coordinates coordinates) {
        return this.getMatrix()[coordinates.getX()][coordinates.getY()];
    }

    /**
     *
     * @param coordinates
     * @param value
     */
    public void setCellValue(Coordinates coordinates, int value) {
        this.getMatrix()[coordinates.getX()][coordinates.getY()].setValue(value);
    }

    /**
     *
     * @return width of the matrix
     */
    public int getWidth() {
        return this.getMatrix().length;
    }
    /**
     *
     * @return height of the matrix
     */
    public int getHeight() {
        return this.getMatrix()[0].length;
    }
}