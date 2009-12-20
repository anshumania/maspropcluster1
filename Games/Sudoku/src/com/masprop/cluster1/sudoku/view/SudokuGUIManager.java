package com.masprop.cluster1.sudoku.view;
//import biz.karms.hidato.app.controller.impl.HidatoGameManager;
//import biz.karms.hidato.app.game.impl.
//import biz.karms.hidato.app.game.matrix.impl.Coordinates;
//import biz.karms.hidato.app.game.matrix.impl.HidatoMatrix;
import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.model.Cell;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.shared.view.GUI;
import com.masprop.cluster1.shared.view.GUIManager;
import com.masprop.cluster1.sudoku.model.Coordinates;
import com.masprop.cluster1.sudoku.model.SudokuCell;
import com.masprop.cluster1.sudoku.model.SudokuGame;
import com.masprop.cluster1.sudoku.model.SudokuGameVariant;
import com.masprop.cluster1.sudoku.model.SudokuMatrix;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.util.Observable;
import javax.sound.midi.Soundbank;
import javax.sound.midi.SysexMessage;
import javax.swing.JFrame;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Matteo De Martino
 */
public class SudokuGUIManager extends GUIManager implements Observer {

    Game sudokuGame = null;
    List<SudokuCell> activeCells = new ArrayList<SudokuCell>();
    boolean threadRunner = false; //for the timer
    boolean sdkGenerated = false;
    boolean updaterThrdCreated = false; //for the gameGeneration
    static Integer generatedSudokus = 0;

    public Integer getGeneratedSudokus() {
        return generatedSudokus;
    }

    public void setGeneratedSudokus(Integer generatedSudokus) {
        this.generatedSudokus = generatedSudokus;
    }

    public SudokuGUIManager() {
//        super(gui);
        // this.setGameManager(new SudokuGUIManager());
    }

    public void initGuiManager() {
        ((SudokuGUI) getGui()).init();
    }

    public void updateTime(long startTime) {
        
        try {
            if (threadRunner) {
                threadRunner = false;
                Thread.currentThread().sleep(1001);
            }
            threadRunner = true;

            //set it to true for this thread
            //if threadRunner is true wait for 1.1 sec


            while (threadRunner) {
                // geting Time in desire format
                getGui().getTimerForGame().setText(getTimeElapsed(startTime));
                // Thread sleeping for 1 sec
                Thread.currentThread().sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception in Thread Sleep : " + e);
        }
    }

    public String getTimeElapsed(long startTime) {

        long elapsedTime = System.currentTimeMillis() - startTime;
        
        elapsedTime = elapsedTime / 1000;

        String seconds = Integer.toString((int) (elapsedTime % 60));
        String minutes = Integer.toString((int) ((elapsedTime % 3600) / 60));
        String hours = Integer.toString((int) (elapsedTime / 3600));

        if (seconds.length() < 2) {
            seconds = "0" + seconds;
        }

        if (minutes.length() < 2) {
            minutes = "0" + minutes;
        }

        if (hours.length() < 2) {
            hours = "0" + hours;
        }

        return hours + ":" + minutes + ":" + seconds;
    }

    /**
     * Get a new game
     * @param constraint
     * @return
     */
    @Override
    public Game getNewGame(Constraint constraint) {

        //there is no constraint -> implies game generation mode
        // and the user has not chosen his options.
        // give him is options
        if (null == constraint) {
            return showSudokuGameWizard();
        }

          sudokuGame = getGameManager().getNewGame(constraint);
          
          displayGame();

        return sudokuGame;
    }

    @Override
    public void displayGame()
    {
 //reset teh sdkGeneratedVariable
        sdkGenerated = false;
        updaterThrdCreated = false;
        //getGui().getGameGenerationText().setText(getGeneratedSudokus() + " invalid sudokus discarded ");


        System.out.println(getGeneratedSudokus() + " invalid sudokus discarded ");
        setGeneratedSudokus(0);
         


        initializeCells();

        // starting new Thread which will update time
        new Thread(new Runnable() {

            public void run() {
                try {
               
                    updateTime(System.currentTimeMillis()- sudokuGame.getTime());
                } catch (Exception ie) {
                }
            }
        }).start();

        //flip the sudokugenerated
        sdkGenerated = true;
    }

    /**
     * Asks the GameManager to validate the Game.
     *
     * @param game
     * @return true/false, valid game/invalid game
     */
    @Override
    public boolean validateGame(Game game) {

        boolean valid = ApplicationController.getUniqueInstance().getGameManager().validateGame(sudokuGame);

        if (valid) {
            JOptionPane.showMessageDialog(null, "This SudokuGame is valid", "SudokuGame", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "This SudokuGame is invalid", "Not a Sudoku", JOptionPane.ERROR_MESSAGE);
        }



        System.out.println("The game is ??" + valid);
        return valid;
    }

    /**
     * Asks the GameManager for providing the solution for the Game.
     *
     * @param game
     * @return solved game
     */
    public Game solveGame(Game game) {
        //NOTE: The above game attribute is never used ! we use the game object
        // set in the guiManager

        boolean valid = ApplicationController.getUniqueInstance().getGameManager().validateGame(sudokuGame);
        if (!valid) {
            JOptionPane.showMessageDialog(null, "Invalid Sudoku: Perhaps has more than one unique solution or is in violation of the" +
                    "Sudoku game rules.", "Not a Sudoku", JOptionPane.ERROR_MESSAGE);
        }
        Game previousSudoku = sudokuGame;
        sudokuGame = ApplicationController.getUniqueInstance().getGameManager().solveGame(sudokuGame);

        if (null == sudokuGame) {
            JOptionPane.showMessageDialog(null, "There are no solutions", "Sudoku", JOptionPane.ERROR_MESSAGE);
            sudokuGame = previousSudoku;
        } else {
            initializeCells();
        }

        return sudokuGame;
    }

    @Override
    public void initializeCells() {
        super.initializeCells();

        getGui().getGameBoard().removeAll();

        int N = ((SudokuMatrix) sudokuGame.getGameMatrix()).getDim(); //the dimension
        int n = (int) Math.sqrt(N); // the square root of the dimension

        //beginning of customization for sudoku
        this.getGui().getGameBoard().setLayout(new GridLayout(n, n, 5, 5));
        //TODO add buttons to GUI - as a member variable
        JButton buttons[][] = new JButton[N][N];
        //TODO add zonePanel to GUI - as a member variable
        JPanel zonePanel[] = new JPanel[N];

        for (int i = 0; i < N; i++) {
            zonePanel[i] = new JPanel();
            zonePanel[i].setLayout(new GridLayout(n, n));
            zonePanel[i].setBorder(null);
        }

        //create teh puzzle from the cells
//        int[][] puzzle = ((SudokuMatrix)sudokuGame.getGameMatrix()).getSdkPuzzle(); //get the sudoku puzzle


        activeCells.clear();


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                SudokuCell cell = (SudokuCell) ((SudokuMatrix) sudokuGame.getGameMatrix()).getCell(i, j);


//                	System.out.println("value should be set " + cell.getGivenValue());
                buttons[i][j] = new JButton(cell.getGivenValue() > 0 ? String.valueOf(cell.getGivenValue()) : "");
//                buttons[i][j] = new JButton(puzzle[i][j] > 0 ? String.valueOf(puzzle[i][j]) : "");


                buttons[i][j].setName(String.valueOf((i * N) + j));
                cell.setSudokuId((i * N + j));
                activeCells.add(cell);


                buttons[i][j].addMouseListener(new MouseAdapter() {

                    public void mouseClicked(MouseEvent event) {
                        JButton jb = (JButton) event.getSource();
                        System.out.println(jb.getText());
                    }
                });

                buttons[i][j].addKeyListener(new KeyAdapter() {

                    public void keyPressed(KeyEvent event) {
                        handleValueEntered(event);
                    }
                });

                zonePanel[cell.getCoordinates().getZ()].add(buttons[i][j]);


            }

        }

        this.getGui().getGameBoard().setBackground(Color.black);
        for (int i = 0; i < N; i++) {
            this.getGui().getGameBoard().add(zonePanel[i]);
        }
        this.getGui().getGameBoard().validate();
        this.getGui().getGameBoard().repaint();

    }

    private void handleValueEntered(KeyEvent event) {
        JButton jb = (JButton) event.getSource(); // get the source
        //handle the delete cases first
        // backspace , space , delete
        int kVal = event.getKeyCode();
        System.out.println("kvVal " + kVal);
        if (kVal == 8 || kVal == 127 || kVal == 32) {
            jb.setText(jb.getText()+"0");
            
            System.out.println("setting 0 in cell");
            //get the cell for which this has happened
            SudokuCell cell = activeCells.get(Integer.parseInt(jb.getName()));
            //set its current value to the new value
            cell.setCurrentValue(Integer.parseInt(String.valueOf("0")));
            //set the value input by the user into the sdkpuzzle (the 2d representation of the actual sdkdlxpuzzle)
            ((SudokuGame) sudokuGame).getGameMatrix().getSdkPuzzle()[cell.getCoordinates().getX()][cell.getCoordinates().getY()] = cell.getCurrentValue();
            
            jb.validate();
            jb.repaint();
        } else {
            char val = event.getKeyChar(); // get the value

//        System.out.println(" del - " + event.getKeyChar() + " code "  + event.getKeyCode());
            //handle non valid inputs

            int N = ((SudokuMatrix) sudokuGame.getGameMatrix()).getDim();
            int value = 0;
            try {

                value = Integer.parseInt(String.valueOf(val));
                if (value < 0 || value > N) {
                    throw new Exception("Not in allowed range");
                }

                if (!("".equals(jb.getText()))) {
                    //forward checking for value appending
                    String temp = jb.getText() + val;
                    value = Integer.parseInt(String.valueOf(temp));
                    if (value > N) {
                        throw new Exception("Not in allowed range");
                    }
                }



                //get the cell for which this has happened
                SudokuCell cell = activeCells.get(Integer.parseInt(jb.getName()));
                //set its current value to the new value
                cell.setCurrentValue(Integer.parseInt(String.valueOf(val)));
                //set the value input by the user into the sdkpuzzle (the 2d representation of the actual sdkdlxpuzzle)
                ((SudokuGame) sudokuGame).getGameMatrix().getSdkPuzzle()[cell.getCoordinates().getX()][cell.getCoordinates().getY()] = cell.getCurrentValue();

                if (getGui().getSudokuHints().isSelected()) {
                    jb.setForeground(checkValueIsAllowedInCell(cell));
                }
                jb.setText(jb.getText() + String.valueOf(val)); // set the value
                jb.validate();
                jb.repaint();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, val + " is not in the allowed range from 1 to " + N, "Invalid Input", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, value + " is not in the allowed range from 1 to " + N, "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    private Color checkValueIsAllowedInCell(SudokuCell sdkCell) {
        for (SudokuCell iCell : activeCells) {
            //check only for givenCells or which have a value
            //and obviously excluding this cell itself!!
            if (!(iCell.equals(sdkCell)) && !(iCell.getCurrentValue() == 0)) {
                //check row
                if (iCell.getCoordinates().getX() == sdkCell.getCoordinates().getX() &&
                        iCell.getCurrentValue() == sdkCell.getCurrentValue()) {
                    System.out.println("CheckingX " + iCell.getSudokuId() + "icellx " + iCell.getCoordinates().getX() + " sdkcellx " + sdkCell.getCoordinates().getY());
                    System.out.println("CheckingV " + iCell.getSudokuId() + "icellV " + iCell.getCurrentValue() + " sdkcellV " + sdkCell.getCurrentValue());
                    return Color.RED;
                }

                //check col
                if (iCell.getCoordinates().getY() == sdkCell.getCoordinates().getY() &&
                        iCell.getCurrentValue() == sdkCell.getCurrentValue()) {
                    return Color.RED;
                }

                //check zone

                if (iCell.getCoordinates().getZ() == sdkCell.getCoordinates().getZ() && iCell.getCurrentValue() == sdkCell.getCurrentValue()) {
                    return Color.RED;
                }
            }
        }
        return Color.GREEN;
    }

    private void showGameWizard() {

        getGui().getSudokuGameWizard().setVisible(true);
    }

    private void closeGameWizard() {
        throw new UnsupportedOperationException("Coming soon!");
    }

    @Override
    public void update(Observable o, Object arg) {

        setGeneratedSudokus((Integer) arg);
//        this.generatedSudokus = (Integer)arg;
     //   System.out.println("arg " + arg + " :  gensdks " + getGeneratedSudokus());

         // starting new Thread which will update time

        if(!updaterThrdCreated)
        {

        new Thread(new Runnable() {

            public void run() {
                try {

                    updateGameGenerationText();
                } catch (Exception ie) {
                }
            }
        }).start();

        }


    }

    public void updateGameGenerationText()
    {
     try {
           
        
               
         
         
          {
                updaterThrdCreated = true;
            //set it to true for this thread
            //if threadRunner is true wait for 1.1 sec

            
            while (!sdkGenerated) {

                System.out.println("awoke at " + System.currentTimeMillis());

                // geting Time in desire format
//                 getGui().getGameGenerationText().setText(getGeneratedSudokus() + " invalid sudokus discarded ");
                getGui().getTimerForGame().setText(getGeneratedSudokus() + " invalid sudokus discarded ");
                // Thread sleeping for 1 sec
                Thread.currentThread().sleep(1000);
            }
        }
     }catch (Exception e) {
            System.out.println("Exception in Thread Sleep : " + e);
        }

    }



    @Override
    public Game getGame() {
        //call only when 'game over'
        threadRunner = false; //hack to stop the timer
        return sudokuGame;
    }

    @Override
    public void saveGame(File file) {
        //super.updateGameObject();
        sudokuGame.setTime(getTimeSpentInGame());
        getGameManager().saveGame(sudokuGame, file);
    }

    @Override
    public Game loadGame(File file) {
        //super.updateGameObject();
        Game previousGame = sudokuGame;
        sudokuGame = getGameManager().loadGame(file);
        if(!(null==sudokuGame))
            displayGame();
        else
            sudokuGame=previousGame;
        
        return sudokuGame;
    }

    @Override
    public SudokuGUI getGui() {
        return (SudokuGUI) super.getGui();
    }

    private Game showSudokuGameWizard() {

        /*since the constraints are null
         *thus u have to get the user to perform
         * some action . This action is done via
         * the sudokuGameWizard.
         * just invoke the handling in the GUI and
         * return null ; nothing else to do
         */



        getGui().newGameMenuItemActionPerformed(null);


        return null;
    }


    public long getTimeSpentInGame()
    {
        String time = getGui().getTimerForGame().getText();
        String[] timeparts = time.split(":");
        long hrs = Long.valueOf(timeparts[0])*3600;
        long min = Long.valueOf(timeparts[1])*60;
        long sec = Long.valueOf(timeparts[2]);
        long totalTime = hrs+min+sec;
        
        return totalTime*1000;
    }


   public void gameOver()
   {

       if( ! ((SudokuMatrix) sudokuGame.getGameMatrix()).isFinished() )

       {
               JOptionPane.showMessageDialog(null, " You have not finished the game. Use the SudokuMenu to Solve or enable hints ", "Game Not Over", JOptionPane.ERROR_MESSAGE);
       }
       else
       {
        getGame().setTime(getTimeSpentInGame());

        double score = getGameManager().getStatisticsManager().getScoreFor(getGame());

        boolean highScore = getGameManager().getStatisticsManager().isAHighScore(score);

        if(highScore)
        {
            String name = JOptionPane.showInputDialog("You are in the Sudoku Hall of Fame. Your Name : ");
            getGameManager().getStatisticsManager().addHighScore(score, name);
            getStatistics();
        }
        

        System.out.println("score for the game = " + score);
       }
   }

   @Override
   public Properties getStatistics()
   {
       Properties score = super.getStatistics();

       score.list(System.out);

       getGui().scoresMenuItemActionPerformed(score);
       return score;

   }

   public void getHelp()
   {
       
   }

}
