package com.masprop.cluster1.sudoku.model;

import com.masprop.cluster1.shared.model.Cell;
import com.masprop.cluster1.shared.model.Matrix;

/**
 * 
 * @author Matteo de Martino
 *
 */
public class SudokuMatrix implements Matrix {

    private Cell[][] matrix = null;
    private int width = 0;
    private int height = 0;

    
    public SudokuMatrix()
    {
    	
    }
    
    /**
     * Class constructor.
     * 
     * @param width width of the game matrix
     * @param height height of the game metrix
     * @param values array of cell values
     */
    public SudokuMatrix(int width, int height, int[] values) {
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
                matrix[x][y] = new Cell(values[positionInArray], editable, active);
                positionInArray++;
            }
        }
    }

    /**
     * @param coordinates which indicate cell position
     * @return cell at the given coordinates
     */
    public Cell getCell(Coordinates coordinates) {
        //System.out.println("Coord X: "+coordinates.getX());
        //System.out.println("Coord Y: "+coordinates.getY());
        //System.out.println("Matrix dim X: "+width);
        //System.out.println("Matrix dim Y: "+height);
        return matrix[coordinates.getX()][coordinates.getY()];
    }

    /**
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

    /**
     * Only for testing.
     */
    public void write() {
        for (int i = 0; i < this.getHeight(); i++) {
            for (int j = 0; j < this.getWidth(); j++) {
                if ((matrix[i][j].getCurrentValue() < 10) && (matrix[i][j].getCurrentValue() > -1)) {
                    System.out.print(" " + matrix[i][j].getCurrentValue() + " ");
                } else {
                    System.out.print(matrix[i][j].getCurrentValue() + " ");
                }
            }
            System.out.println();
        }
    }
}
