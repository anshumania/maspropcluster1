package biz.karms.hidato.app.game.matrix.impl;

/**
 *
 * @author
 */
public class Matrix {

    private Cell[][] matrix;

    public Matrix(int width, int height, int[] values) {
        matrix = new Cell[width][height];
    }

    public Cell[][] getMatrix() {
        return this.matrix;
    }

    public Cell getCell(int x,int y) {
        return this.getMatrix()[x][y];
    }

    public int getWidth() {
        return this.getMatrix().length;
    }
    public int getHeight() {
        return this.getMatrix()[0].length;
    }

}
