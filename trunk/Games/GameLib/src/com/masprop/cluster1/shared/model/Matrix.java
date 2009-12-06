package com.masprop.cluster1.shared.model;

/**
 * Class defines a game grid which contains <tt>cells</tt>s.
 *
 * @see Cell
 * @author Matus Pleva
 */
public class Matrix {

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
    public Matrix(int width, int height, int[] values) {
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
     * Set value to cell identified by coordinates,
     * if cell is active. Set editable to true if new value is 0,
     * else set editable to false.
     *
     * @param coordinates which indicate cell position
     * @param value value of cell
     */
    public void setCellValue(Coordinates coordinates, int value) {
        if (matrix[coordinates.getX()][coordinates.getY()].isActive()) {
            matrix[coordinates.getX()][coordinates.getY()].setCurrentValue(value);
            if (value == 0) {
                matrix[coordinates.getX()][coordinates.getY()].setEditable(true);
            } else {
                matrix[coordinates.getX()][coordinates.getY()].setEditable(false);
            }
        }
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

    /**
     * Only for testing.
     */
    public void write() {
        for (int y = 0; y < this.getHeight(); y++) {
            for (int x = 0; x < this.getWidth(); x++) {
                if ((matrix[x][y].getCurrentValue() < 10)
                        && (matrix[x][y].getCurrentValue() > -1)) {
                    System.out.print(" " + matrix[x][y].getCurrentValue()
                            + " ");
                } else {
                    System.out.print(matrix[x][y].getCurrentValue() + " ");
                }
            }
            System.out.println();
        }
    }
}