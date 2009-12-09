package com.masprop.cluster1.sudoku.model;

import com.masprop.cluster1.shared.model.Cell;
import com.masprop.cluster1.shared.model.Matrix;

/**
 * 
 * @author Andrea Gritti
 *
 */
public class SudokuMatrix extends Matrix {

   // private SudokuCell[][] sdkCells = null;
    public SudokuCell[][] getSdkCells() {
		return (SudokuCell[][]) matrix;
	}

	private int[][] sdkPuzzle;
   
    private int dim;

    
    public int getDim() {
		return dim;
	}


    
    public SudokuMatrix(int dimension, int[][] sudokuPuzzle)
    {
    	
    	this.dim = dimension;
    	this.sdkPuzzle = new int[dim][dim];
    	setSdkPuzzle(sudokuPuzzle);
    	this.matrix = new SudokuCell[dim][dim];
    	createSdkCells();
    
    	
    	
    }
    
    public void createSdkCells()
    {
    	int n = (int) Math.sqrt(dim);
    	
    	for(int r=0 ; r<dim ; r++)
    		for(int c=0; c<dim ; c++)
    			matrix[r][c] = new SudokuCell(sdkPuzzle[r][c],sdkPuzzle[r][c] > 0,true,new Coordinates(r,c, n * (r/n) + (c/n)));
    		
    }
    
    /**
     * Class constructor.
     * 
     * @param width width of the game matrix
     * @param height height of the game metrix
     * @param values array of cell values
     */
/*    public SudokuMatrix(int width, int height, int[] values) {
        this.dim = width;
        

        sdkCells = new Cell[width][height];

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
                sdkCells[x][y] = new Cell(values[positionInArray], editable, active);
                positionInArray++;
            }
        }
    }*/


    /**
     * @param coordinates which indicate cell position
     * @return cell at the given coordinates
     */
    public Cell getCell(int x, int y) {
        //System.out.println("Coord X: "+coordinates.getX());
        //System.out.println("Coord Y: "+coordinates.getY());
        //System.out.println("Matrix dim X: "+width);
        //System.out.println("Matrix dim Y: "+height);
        return matrix[x][y];
    }
    



  
  
  

	public void setSdkPuzzle(int[][] puzzle) {
		for(int r=0 ; r < puzzle.length ; r++)
			for(int c=0 ; c < puzzle.length ; c++)
				sdkPuzzle[r][c] = puzzle[r][c];
	}

	public int[][] getSdkPuzzle() {
		return sdkPuzzle;
	}
	
	public String toStringz()
	{
		StringBuffer str = new StringBuffer();
		for(int r=0 ; r<dim ; r++)
		{
			for(int c=0 ; c<dim ; c++)
				str.append(sdkPuzzle[r][c]+",");
			str.append("\n");
		}
		return str.toString();
	}
	public String toString()
	{
		System.out.println("sdkCells !!!");
		StringBuffer str = new StringBuffer();
		for(int r=0 ; r<dim ; r++)
		{
			for(int c=0 ; c<dim ; c++)
				str.append(matrix[r][c].getCurrentValue()+",");
			str.append("\n");
		}
		return str.toString();
	}
}
