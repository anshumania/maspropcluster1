@ECHO off
DIR  . 
java -cp ../SOURCE/junit-4.5.jar;../SOURCE/sudoku-export.jar org.junit.runner.JUnitCore com.masprop.cluster1.sudoku.controller.SudokuGameManagerTest

PAUSE