package com.masprop.cluster1.sudoku.controller.dancingLinks;

public class Node {
	
	int id;
	Node left = this ;
	Node right = this; 
	Node up = this;
	Node down = this;
	ColumnHeader columnHeader;
	int value;
	int rowIndex;
	
	Node()
	{
		
	}
	Node(int row)
	{
		this.rowIndex=row;
	}
	public String toString()
	{
		return "<N{row="+rowIndex+"}>";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node getUp() {
		return up;
	}
	public void setUp(Node up) {
		this.up = up;
	}
	public Node getDown() {
		return down;
	}
	public void setDown(Node down) {
		this.down = down;
	}
	public ColumnHeader getColumnHeader() {
		return columnHeader;
	}
	public void setColumnHeader(ColumnHeader columnHeader) {
		this.columnHeader = columnHeader;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getRowIndex() {
		return rowIndex;
	}
	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	
}
