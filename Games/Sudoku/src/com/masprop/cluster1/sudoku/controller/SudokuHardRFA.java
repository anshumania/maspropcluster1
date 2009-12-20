package com.masprop.cluster1.sudoku.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;




public class SudokuHardRFA {

	
	//TODO : CHANGE !!!
	public static String FILE_NAME;
	public static String RESOURCE_LOCATION="resources/ExtremeSudokus17.sdk";
	
	public static int FILE_SIZE= 48825;
	
	public static int NINE = 9;
	public static int LINE_LENGTH=81;
	public static int OFFSET_FOR_EOF=2; 
	
	//load at fileresource at startup
	static
	{
		SudokuHardRFA.FILE_NAME = SudokuHardRFA.class.getResource(RESOURCE_LOCATION).getFile();
	}
	
	private static int[][]convertToSudokuNinePuzzle(String sudoku)
	{
		System.out.println(sudoku);
		int[][] sdkPuzzle = null;
		if(sudoku!=null)
		{
		
			sdkPuzzle = new int[NINE][NINE];
			int sdkC = 0;
			for(int i=0;i<NINE;i++)
				for(int j=0;j<NINE;j++)
					sdkPuzzle[i][j] = Integer.parseInt(String.valueOf(sudoku.charAt(sdkC++)));
		}
		return sdkPuzzle;
	}
	
	private static void printSdkPuzzle(int[][] sdkPuzzle)
	{
		for(int i=0;i<NINE;i++)
		{
			for(int j=0;j<NINE;j++)
			{
				System.out.print(sdkPuzzle[i][j]);
			}
			System.out.println();
		}
	
	}
	
	public static int[][] getAnExtremeSudoku()
	{
	
		return SudokuHardRFA.convertToSudokuNinePuzzle(SudokuHardRFA.readA17RandomSudoku());
		
	}
	
	
	private static String readA17RandomSudoku()
	{
		
				String sudoku = null;
		        
		        RandomAccessFile randomAccessFile = null;
		        try {
		            
		           	
		            //Create RandomAccessFile instance with read / write permissions
		            randomAccessFile = new RandomAccessFile(FILE_NAME, "r");
		            
//		            System.out.println(randomAccessFile.getFilePointer());
		            //Fetch a random index into the file consisting of FILE_SIZE records 
		            int index = (int)Math.abs((Math.random()*FILE_SIZE));
		            System.out.println("Reading sudoku no " + (index+1));
		            //Read the next index
		            //increment by LINE_LENGTH+OFFSET_FOR_EOF - the size of each record
		            int fp=index*(LINE_LENGTH+OFFSET_FOR_EOF);
//		            System.out.println("increasing to end of current sudoku" + index);
		            //Place the file pointer at required record
		            randomAccessFile.seek(fp);
		            
		            //Declare a buffer with the same length as the record
		            byte[] buffer = new byte[LINE_LENGTH+OFFSET_FOR_EOF];
		            
		            //Read the record from the file
		            randomAccessFile.read(buffer);
		            
//		            System.out.println("length of buffer" + buffer.length);
		            //Print out the buffer contents
		            sudoku = new String(buffer);
		            System.out.println(sudoku);
		            
		        } catch (FileNotFoundException ex) {
		            ex.printStackTrace();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        } finally {
		            try {
		          
		                if (randomAccessFile != null)
		                    randomAccessFile.close();
		            
		                
		            } catch (IOException ex) {
		                ex.printStackTrace();
		            }
		        }
		        
		        //Replace the EOF chars
		        
				return sudoku.replace("\r\n","");
	}
	
	public static void main(String args[])
	{
	/*	Random random = new Random(10);
		for(int i=1;i<10;i++)
		{
			int j = (int) Math.abs(Math.random()*10);
			System.out.println(j);
		}*/
		
//		String sudoku = new SudokuHardRFA().readA17RandomSudoku();
//		System.out.println("did i get the right string " + sudoku);
//		System.out.println("b4 " +sudoku.length());
		//replace
//		sudoku = sudoku.replace("\r\n","");
//		System.out.println("after" +sudoku.length());
//		int[][] sdkPuzzle = SudokuHardRFA.convertToSudokuNinePuzzle(sudoku);
		
//		int[][] sdkPuzzle = SudokuHardRFA.getAnExtremeSudoku();
//		SudokuHardRFA.printSdkPuzzle(sdkPuzzle);
		
	/*	String RESOURCE_LOCATION = "resources/17Sud.txt";

		InputStream  instream = SudokuHardRFA.class.getResourceAsStream(RESOURCE_LOCATION);
		
		Scanner in = new Scanner(instream);
		String initial_board = in.nextLine();
		System.out.println(initial_board);
		in.close();
		
		URL url = SudokuHardRFA.class.getResource(RESOURCE_LOCATION);
		
		System.out.println(url.getFile());
		System.out.println(url.getPath());
		
		SudokuHardRFA.FILE_NAME = url.getFile();
*/		int[][] sdkPuzzle = SudokuHardRFA.getAnExtremeSudoku();
		SudokuHardRFA.printSdkPuzzle(sdkPuzzle);
		
	}
}
