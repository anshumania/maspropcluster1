@ECHO off
DIR  . 
java -cp ../SOURCE/junit-4.5.jar;../SOURCE/sudoku-export.jar org.junit.runner.JUnitCore com.masprop.cluster1.sudoku.controller.SudokuApplicationControllerTest
ECHO "The above exception is OKay ! It is because the GUI was terminated by the test case"
PAUSE