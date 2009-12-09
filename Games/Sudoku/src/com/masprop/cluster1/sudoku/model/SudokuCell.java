package com.masprop.cluster1.sudoku.model;

import java.util.List;

import com.masprop.cluster1.shared.model.Cell;

public class SudokuCell extends Cell {

        //the unique id for identify the cell
	private int sudokuId;

    public int getSudokuId() {
        return sudokuId;
    }

    public void setSudokuId(int sudokuId) {
        this.sudokuId = sudokuId;
    }

	private List<Integer> possibleValues;
	
	private Coordinates coordinates;
	
	public SudokuCell(int currentValue, boolean editable, boolean active, Coordinates coords) {
		super(currentValue, editable, active);
		setGivenValue(getCurrentValue() > 0 ? getCurrentValue() : 0);
		setCoordinates(coords);
		// TODO Auto-generated constructor stub
	}
	
	private int givenValue;
	
	public int getGivenValue() {
		return givenValue;
	}

	public void setGivenValue(int givenValue) {
		this.givenValue = givenValue;
	}

	public List<Integer> getPossibleValues() {
		return possibleValues;
	}

	public void setPossibleValues(List<Integer> possibleValues) {
		this.possibleValues = possibleValues;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}


	
	
	
	

}
