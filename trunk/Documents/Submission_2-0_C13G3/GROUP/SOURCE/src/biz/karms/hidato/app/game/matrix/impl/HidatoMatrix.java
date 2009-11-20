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
    private Cell[][] matrix = null;
    private int width = 0;
    private int height = 0;

    /**
     * Class constructor.
     * 
     * @param width width of the game matrix
     * @param height height of the game metrix
     * @param values array of cell values
     */
    public HidatoMatrix(int width, int height, int[] values) {
        this.width = width;
        this.height = height;

        matrix = new Cell[width][height];

        int positionInArray = 0;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                boolean editable;
                boolean active;
                if (values[positionInArray] == 0) {
                    editable = true;
                } else {
                    editable = false;
                }
                if (values[positionInArray] == -1) {
                    active = false;
                } else {
                    active = true;
                }
                matrix[x][y] = new Cell(values[positionInArray], editable,
                        active);
                positionInArray++;
            }
        }
    }

    /**
     * @param coordinates which indicate cell position
     * @return cell at the given coordinates
     */
    public Cell getCell(Coordinates coordinates) {
        return matrix[coordinates.getX()][coordinates.getY()];
    }

    /**
     * Set value to cell identified by coordinates.
     *
     * @param coordinates which indicate cell position
     * @param value value of cell
     */
    public void setCellValue(Coordinates coordinates, int value) {
        matrix[coordinates.getX()][coordinates.getY()].setCurrentValue(value);
    }

    /**
     * @return width of the matrix
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return height of the matrix
     */
    public int getHeight() {
        return height;
    }
}
