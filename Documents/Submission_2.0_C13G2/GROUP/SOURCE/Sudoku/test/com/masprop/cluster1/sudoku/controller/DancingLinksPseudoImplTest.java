package com.masprop.cluster1.sudoku.controller;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Anshuman Mehta
 * 
 */
public class DancingLinksPseudoImplTest {

	// int [][] matrixRow = { {1,0,1,0}, {1,1,0,1} , {0,1,0,0} , { 0,0,1,0} };
	/*
	 * Test a 2d dlx that has no solution
	 */
	@Test
	public void testCreateDlxAndSolve2dNoSolution() {

		int[][] matrixRow = { { 1, 0 }, { 1, 0 } };
		DancingLinksPseudoImpl.createDlxAndSolve(matrixRow);
		assertEquals(0, DancingLinksPseudoImpl.numberOfSolutions);
	}

	/*
	 * Test a 2d dlx that has 1 solution
	 */
	@Test
	public void testCreateDlxAndSolve2dSolution() {

		int[][] matrixRow = { { 1, 0 }, { 0, 1 } };
		DancingLinksPseudoImpl.createDlxAndSolve(matrixRow);
		assertEquals(1, DancingLinksPseudoImpl.numberOfSolutions);

		int[][] matrixRow2 = { { 0, 1 }, { 1, 0 } };

		DancingLinksPseudoImpl.numberOfSolutions = 0;
		DancingLinksPseudoImpl.createDlxAndSolve(matrixRow2);
		assertEquals(1, DancingLinksPseudoImpl.numberOfSolutions);
	}

	/*
	 * Test a 3d dlx that has 0 solution
	 */
	@Test
	public void testCreateDlxAndSolve3dNoSolution() {

		int[][] matrixRow = { 
				{ 1, 0, 0 }, 
				{ 1, 0, 1 }, 
				{ 1, 1, 0 } };
		DancingLinksPseudoImpl.numberOfSolutions = 0;
		DancingLinksPseudoImpl.createDlxAndSolve(matrixRow);
		assertEquals(0, DancingLinksPseudoImpl.numberOfSolutions);
	}

	/*
	 * Test a 3d dlx that has solutions test for 1 solution 
	 * 
	 */
	@Test
	public void testCreateDlxAndSolve3dSolutions() {

		// test for 1 solution
		int[][] matrixRow = { 
				{ 1, 0, 0 }, 
				{ 0, 0, 1 }, 
				{ 0, 1, 0 } };
		DancingLinksPseudoImpl.createDlxAndSolve(matrixRow);
		assertEquals(1, DancingLinksPseudoImpl.numberOfSolutions);
		
		// test for 2 solutions
		int[][] matrixRow2 = { 
				{ 0, 0, 1 }, 
				{ 1, 1, 0 }, 
				{ 0, 0, 1 } };
		
		DancingLinksPseudoImpl.numberOfSolutions = 0;
		DancingLinksPseudoImpl.createDlxAndSolve(matrixRow2);
		assertEquals(2, DancingLinksPseudoImpl.numberOfSolutions);

	}
	
	/*
	 * Test a 4d dlx that has more than 1 solution ! 
	 * 
	 */
	@Test
	public void testCreateDlxAndSolve4dSolutions() {

//		 test for 2 solutions
		int [][] matrixRow = { 
				{1,0,1,0}, 
				{1,1,0,1} , 
				{0,1,0,1} , 
				{ 0,0,1,0} };
		
		DancingLinksPseudoImpl.numberOfSolutions=0;
		DancingLinksPseudoImpl.createDlxAndSolve(matrixRow);
		assertEquals(2, DancingLinksPseudoImpl.numberOfSolutions);
		
		int [][] matrixRow2 = { 
				{1,1,1,0}, 
				{0,0,0,1} , 
				{0,0,0,1} , 
				{ 0,0,0,1} };
		
		DancingLinksPseudoImpl.numberOfSolutions=0;
		DancingLinksPseudoImpl.createDlxAndSolve(matrixRow2);
		assertEquals(3, DancingLinksPseudoImpl.numberOfSolutions);

	}
	
	/*
	 * Stress test dlx matrix for a 
	 * 9x9 sudoku implies 729 rows 
	 * and 324 columns.
	 * 
	 *  for simplicity sake
	 *  assume the matrix to be of the form 
	 *  "1,1,0,0,0,...... 
	 *   0,0,1,0,0,......
	 *   0,0,0,1,0,......
	 *   0,0,0,0,1,......
	 *   ..
	 *   ...
	 *   0,0,0,0,0,.....1
	 *   
	 *   For such a matrix there will exist only 1 solution
	 *   i.e one solution to the exact cover problem
	 */
	
	@Test
	public void testCreateDlxAndSolve9x9SudokuSparseMatrix()
	{
		
		int cols = 9*9*9; // NxNx4
		int rows = 9*9*9; // NxNxN
		
		int[][] matrixRow = new int[rows][cols];
		//first flush the whole matrix
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				matrixRow[i][j]=0;
					
		matrixRow[0][0]=1;
		for(int i=0;i<rows-1;i++)
			matrixRow[i][i+1]=1;
		
		DancingLinksPseudoImpl.numberOfSolutions=0;
		DancingLinksPseudoImpl.createDlxAndSolve(matrixRow);
		assertEquals(1, DancingLinksPseudoImpl.numberOfSolutions);
			
	}
}
