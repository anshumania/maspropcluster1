package biz.karms.hidato.app.game.matrix.impl;


import com.masprop.cluster1.shared.model.Cell;
import com.masprop.cluster1.shared.model.Matrix;

/**
 * Class defines a game grid which contains <tt>cells</tt>.
 *
 * @see Cell
 * @author Matus Pleva
 */
public class HidatoMatrix implements Matrix {

    /**
     * Represents game grid.
     */
    private Cell[][] matrix;

    /**
     * Class constructor.
     * 
     * @param width width of the game matrix
     * @param height height of the game metrix
     * @param values array of cell values
     */
    public HidatoMatrix(int width, int height, int[] values) {
        matrix = new Cell[width][height];
        //TODO set value in each cell
    }

    /**
     * @param coordinates which indicate cell position
     * @return cell at the given coordinates
     */
    public Cell getCell(Coordinates coordinates) {
        return this.matrix[coordinates.getX()][coordinates.getY()];
    }

    /**
     *
     * @param coordinates which indicate cell position
     * @param value value of cell
     */
    public void setCellValue(Coordinates coordinates, int value) {
        this.matrix[coordinates.getX()][coordinates.getY()].setCurrentValue(value);
    }

    /**
     * @return width of the matrix
     */
    public int getWidth() {
        return this.matrix.length;
    }
    /**
     * @return height of the matrix
     */
    public int getHeight() {
        return this.matrix[0].length;
    }
}