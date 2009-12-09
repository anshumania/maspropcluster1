package com.masprop.cluster1.sudoku.controller.dancingLinks;

import com.masprop.cluster1.shared.controller.Algorithm;
import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.sudoku.controller.SudokuAlgorithm;
import com.masprop.cluster1.sudoku.view.SudokuGUIManager;

import java.util.Observable;

/**
 * This class randomizes the generations
 * of any NxN sudoku
 * You can choose which algorithm this randomizer uses !
 * @author ANSHUMAN
 * 
 * TODO : add user interaction/input for generation tries
 * 
 *
 */

public class SudokuRandomizer extends Observable{

    
    
      public SudokuAlgorithm sdkAlgo;  
	
      /**
       * Sets the algo to use for this randomizer
       * @param sdkAlgo
       */
      public void setSdkAlgo(SudokuAlgorithm sdkAlgo) {
		this.sdkAlgo = sdkAlgo;
	}



	public static final int EMPTY_CELL = 0;
	  public GameLevelType gameLevel;
      public int N ; // dimension
      public int n;  // the size of the zone
      
      /**
       *  row[r][i] is true if and only the number i has been already placed in the
       *  row r.
       */
      private boolean [] [] row; //  = new boolean[N][N+1]; 
      
      /**
       *  column[c][i] is true if and only the number i has been already placed in the
       *  column c.
       */
      private boolean [] [] column; // = new boolean[N][N+1];
    
      /**
       *  zone[z][i] is true if and only if  the number i has been already placed 
       *  in zone z.
       *  For a row r and column c the corresponding zone number is  n * (r / n) + (c / n)
       */
      private boolean [] [] zone; // = new boolean[9][10];
       
      /**
       * the generated sudoku
       */
    
      private int [] [] sudoku;//  = new int[9][9];
    
      /**
       * The sudoku randomizer
       * initial state is empty for generation of a completely new random sudoku
       * initial state is set by the user for creation of a sudoku from his/her choices
       */
      private int [] [] partialSudoku ;
      
      /**
       * Creates a new Sudoku with the given partial Sudoku.
       */
      public SudokuRandomizer(int [][] partialSudoku) {
    	
    	this.N = partialSudoku.length;  
    	this.n = (int) Math.sqrt(N);
    	this.row = new boolean[N][N+1];
    	this.column = new boolean[N][N+1];
    	this.zone = new boolean[N][N+1];
    	this.sudoku = new int[N][N];
        this.partialSudoku = partialSudoku;
        initialize();
        setGUIObserver();
      }
      
      private void setGUIObserver() {
		
    	  if(!(null == ApplicationController.getUniqueInstance()))
    	  		addObserver((SudokuGUIManager)ApplicationController.getUniqueInstance().getGuiManager());
		
	}

	public SudokuRandomizer(int [] [] partialSudoku, GameLevelType level) {
    	this(partialSudoku);
      	this.gameLevel = level;
       }
    
      private void initialize() {
    	  // set false all the zones
              for (int boxNumber = 0; boxNumber < N; boxNumber++) {
                  for (int number = 1; number < N+1; number++) {
                    this.zone[boxNumber][number] = false;
                  }
          }
              //set false all the rows and columns
              // set the sudoku to empty state
              for (int row = 0; row < N; row++) {
                  for (int column = 0; column < N; column++) {
                    this.row[row][column + 1] = false;
                    this.column[row][column + 1] = false;
                    this.sudoku[row][column] = EMPTY_CELL;
                    // if user has given a partial sudoku to create from
                    if (! isEmptyField(partialSudoku[row][column])) {
                        this.sudoku[row][column] = partialSudoku[row][column];
                        this.row[row][partialSudoku[row][column]] = true;
                        this.column[column][partialSudoku[row][column]] = true;
                        this.zone[getZoneNumber(row, column)][partialSudoku[row][column]] = true;
                    }
                  }
                }
      }
    
      private boolean isEmptyField(int number) {
            return number <= 0 || number > N;
      }
    
    
    
      /**
       * Prints out the Sudoku
       */
      public void print() {
        for (int row = 0; row < N; row++) {
          for (int column = 0; column < N; column++) {
            System.out.print(sudoku[row][column]  + "\t");
          }
          System.out.println();
        }    
      }
    
    
     private int getZoneNumber(int row, int column) {
            return n * (row / n) + (column / n);
        }
    
    
    
      
      /**
       * Returns true if the given number is not yet placed in
       * the given row, column or the zone for this row and column.
       */
      private boolean numberCanBePlaced(int row, int column, int number) {
        return  (partialSudoku[row][column] == number || isEmptyField(partialSudoku[row][column])
                    && ! this.row[row][number]
                    && ! this.column[column][number]
                    && ! this.zone[getZoneNumber(row, column)][number]);
      }
      
        
      
      public int givensInPartial()
      {
    	  
      
      int noInSud=0;
      
      
	  for (int row = 0; row < N; row++) 
          for (int column = 0; column < N; column++) 
          	    if(partialSudoku[row][column] > 0) 
          	           	    	noInSud++;
        return noInSud;
      
	  }
      /**
       * Creates a new Sudoku with N random numbers (1-N).
            */
       public int[][] createSudoku(int givens) {
    	   int tries = 0;
    	   int userGivens  = givens;
    	   int totalTries = 0;
    	   initialize();
                    do {
                            for (int row = 0; row < N; row++) {
                                    for (int column = 0; column < N; column++) {
                                            partialSudoku[row][column] = EMPTY_CELL;
                                    }
                            }
                            initialize();
                            //Logic for handling Levels
                            
                            //  LEVEL : Extremely DIFFICULT : 17  // does not exist here 
                    		//    LEVEL : DIFFICULT 17-27     :  try 4000 sudokus per second !!
                    		//    LEVEL : MEDIUM  27-33 - to make the algo generate in this range the number of 
                    		//							  tries has to be greater than 3000 sudokus per second !!							
                    		//    LEVEL : EASY    33-45 -  the generation can be done 
                        
                            if(! (null == gameLevel))
                            {
                            	
                            switch (gameLevel) {
								case DIFFICULT :  	userGivens = (++tries == 4000) ? ++userGivens : userGivens;
													tries = (tries == 4000) ? 0 : tries;
							/*						String s = tries == 0 ? "increased givens to " + userGivens : null ;//" try " + tries;
													if(null != s)
														System.out.println(s);*/
													break;
								case MEDIUM	   :	userGivens = (++tries == 3000) ? ++userGivens : userGivens;	
													tries = (tries == 2500) ? 0 : tries;	
													break;
								case EASY	   :	userGivens = (++tries == 1500) ? ++userGivens : userGivens;	tries=0;
													tries = (tries == 1500) ? 0 : tries;
													break;
													
								default		   :	break;
							}	
                            }
                            
                            totalTries++;
                            setChanged();
                            notifyObservers(totalTries);
                  
                         /*   userGivens = (++tries == 4000) ? ++userGivens : userGivens;
                            tries = (tries == 4000) ? 0 : tries;*/
                            
                            for (int i = 0; i < userGivens; i++) {
                                    int row = (int) (Math.random() * N);
                                    int column = (int) (Math.random() * N);
                                    int number = 1 + (int) (Math.random() * N);
                                    if (numberCanBePlaced(row, column, number)) {
                                            this.row[row][number] = true;
                                            this.column[column][number] = true;
                                            this.zone[getZoneNumber(row, column)][number] = true;
                                            partialSudoku[row][column] = number;
                                    }
                            }
//                            print();
//                            System.out.println(givensInPartial());
                            initialize();
                    } while ( !sdkAlgo.validateASudokuGame(partialSudoku));
    
                    print();
                    System.out.println("final userGivens value =" + userGivens);
                    System.out.println("number of total tries = " + tries);
                    return sudoku;
            }
       
     
    /**
     * create a partial sudoku for the user to play around with when he wants to create a sudoku   
     */
	public int[][] createRandomPartialSudoku(int givens) {
		  initialize();
        
                          for (int row = 0; row < N; row++) {
                                  for (int column = 0; column < N; column++) {
                                          partialSudoku[row][column] = EMPTY_CELL;
                                  }
                          }
                                              
                        
                          
                          for (int i = 0; i < givens; i++) {
                                  int row = (int) (Math.random() * N);
                                  int column = (int) (Math.random() * N);
                                  int number = 1 + (int) (Math.random() * N);
                                  if (numberCanBePlaced(row, column, number)) {
                                          this.row[row][number] = true;
                                          this.column[column][number] = true;
                                          this.zone[getZoneNumber(row, column)][number] = true;
                                          partialSudoku[row][column] = number;
                                  }
                          }

            
                    return partialSudoku;
                  	
	}
    
    
      public static void main(String argv[]) {
        
/*      	SudokuAlgorithm sdka = new SudokuAlgorithm();
		
    	int givens = 34;
    	int range = 36;
    	int N = 9;
    	int[][] genSudoku = new int[N][N];
    	for(int i=0;i<N;i++)
    		for(int j=0;j<N;j++)
    			genSudoku[i][j]=0;
    	
    	SudokuRandomizer sudoku = new SudokuRandomizer(genSudoku,GameLevelType.EASY); 
    	sudoku.setSdkAlgo(sdka);
    	
    	
    	int tries = 0;
  		System.out.println("Creating with " + givens + " givens ") ;
        int[][] aSudoku = sudoku.createSudoku(givens++);
        
        for(int i=0;i<N;i++)
    		for(int j=0;j<N;j++)
    			if(aSudoku[i][j]>0) tries++;
    	
    	System.out.println("no. of givens finally " + tries);
    	System.out.println("done!");
*/
    	  //test minimize
    	  
    		int N = 9;
        	int[][] genSudoku = new int[N][N];
        	for(int i=0;i<N;i++)
        		for(int j=0;j<N;j++)
        			genSudoku[i][j]=0;
    		SudokuRandomizer sudoku = new SudokuRandomizer(genSudoku);
    		genSudoku = sudoku.createRandomPartialSudoku(34);
    		int tries=0;
            for(int i=0;i<N;i++)
            {
        		for(int j=0;j<N;j++)
        		{
        			if(genSudoku[i][j]>0) tries++;
        			System.out.print(genSudoku[i][j]);
        		}
        		System.out.println();
            }
        	
        	System.out.println("no. of givens finally " + tries);
    		
    	  
      }


    }






	

