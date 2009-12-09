package com.masprop.cluster1.shared.view;

import com.masprop.cluster1.shared.controller.ApplicationController;
import java.util.List;

import com.masprop.cluster1.shared.controller.GameManager;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 * GUIManager is imlementing the action logic, swing workers and other
 * operations invoked from the GUI. GUIManager calls operations on the
 * GameManager in order to carry out the desired user demands.
 * 
 * @author Michal Karm Babacek
 */
public abstract class GUIManager {

    /**
     * The actual game (includes matrix and constraints)
     */
    private Game game = null;
    /**
     * Various setings.
     */
    private Constraint constraint = null;
    /**
     * GameManager - game business logic handler.
     */
//    private GameManager gameManager = null;
    /**
     * JFrame definitions, GUI elements, action listener
     */
    private GUI gui = null;
    /**
     * The maximal allowed cell value.
     * This is game dependent and should be set in either Sudoku or Hidato implementation.
     */
    private int maximalAllowedCellValue = 0;
    /**
     * The collection of cells
     */
    List<JTextField> cells = null;
    CellActionListener cellActionListener = null;
    CellFocusListener cellFocusListener = null;
    CellKeyListener cellKeyListener = null;
    JTextField cell = null;

    /**
     * GUIManager handles all the GUI actions.
     * @param gui actual GUI
     */
    public GUIManager() {
    }

    /**
     * This is more or less for testing purposes and as a demonstration of the
     * game board concept and abilities.
     */
    public void initializeCells() {
        cellActionListener = new CellActionListener();
        cellFocusListener = new CellFocusListener();
        cellKeyListener = new CellKeyListener();
        cell = null;
        cells = new ArrayList<JTextField>();
    }

    /**
     * Cell Key Listener listens to the key strokes :-)
     */
    class CellKeyListener implements KeyListener {

        public void keyTyped(KeyEvent e) {
            //Nothing
        }

        public void keyPressed(KeyEvent e) {
            //Nothing
        }

        /**
         * Validator for user imput in cells.
         *
         * - Only numbers are allowed.
         * - String in the field can not begin with 0
         * - Number must be less than maximalAllowedValue
         *
         * @param e enent
         */
        public void keyReleased(KeyEvent e) {
            if (e.getSource() instanceof JTextField) {
                try {
                    if (!((JTextField) e.getSource()).getText().isEmpty()) {
                        if (!((JTextField) e.getSource()).getText().startsWith("0")) {
                            if (Integer.parseInt(((JTextField) e.getSource()).getText()) > maximalAllowedCellValue) {
                                ((JTextField) e.getSource()).setBorder(new LineBorder(Color.RED, 1, true));
                                ((JTextField) e.getSource()).setText("");
                                gui.getStatusText().setText("Max allowed number you can fill in is " + maximalAllowedCellValue + "...");
                            } else {
                                gui.getStatusText().setText("");
                                ((JTextField) e.getSource()).setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
                            }
                        } else {
                            ((JTextField) e.getSource()).setBorder(new LineBorder(Color.RED, 1, true));
                            ((JTextField) e.getSource()).setText("");
                            gui.getStatusText().setText("Zero is not allowed here.");
                        }
                    }
                } catch (NumberFormatException ex) {
                    ((JTextField) e.getSource()).setBorder(new LineBorder(Color.RED, 1, true));
                    ((JTextField) e.getSource()).setText("");
                    gui.getStatusText().setText("Only numbers are allowed in cells...");
                }
            }
        }
    }

    /**
     * Listens to the actions on cell. (Might not be necessary)
     */
    class CellActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    /**
     * Just fancy color changing so as we can determine whether the particular cell is focused on or not.
     */
    class CellFocusListener implements FocusListener {

        /**
         * Change the color
         * @param e event
         */
        public void focusGained(FocusEvent e) {
            if (e.getSource() instanceof JTextField) {
                ((JTextField) e.getSource()).setBackground(new Color(236, 184, 21));
            }
        }

        /**
         * Change the color
         * @param e event
         */
        public void focusLost(FocusEvent e) {
            if (e.getSource() instanceof JTextField) {
                ((JTextField) e.getSource()).setBackground(new Color(239, 227, 209));
                if (((JTextField) e.getSource()).getText().isEmpty()) {
                    gui.getStatusText().setText("");
                    ((JTextField) e.getSource()).setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
                }
            }
        }
    }

    /**
     * Retrieves a new game object from the
     * GameManager
     *
     * @param constraint
     * @return a new game instance
     */
    public Game getNewGame(Constraint constraint) {
        return null;
    }

    /**
     * Asks the GameManager to validate the Game.
     *
     * @param game
     * @return true/false, valid game/invalid game
     */
    public boolean validateGame(Game game) {
        return true;
    }

    /**
     * Asks the GameManager for providing the solution for the Game.
     *
     * @param game
     * @return solved game
     */
    public Game solveGame(Game game) {
        return null;
    }

    /**
     * This method should iterate over all cells in the GUI and update
     * actual cells in the Game object matrix.
     *
     * Maybe it would be best to overwrite this method, because it is Hidato/Sudoku dependent.
     */
    private void updateGameObject() {
        //TODO: DO :-)
    }

    /**
     * Asks the GameManager to persist the current Game object.
     * @param game to be saved
     */
    public void saveGame(File file) {
        updateGameObject();
        ApplicationController.getUniqueInstance().getGameManager().saveGame(game, file);
    }

    /**
     * Load a game or a collection of instances of the Game.
     *
     * @return
     */
    public Game loadGame(File file) {
        return ApplicationController.getUniqueInstance().getGameManager().loadGame(file);
    }

    /**
     * Sets all the JForm elements and all proper variables in order to
     * display the correct UI for the player.
     */
    public void displayGame() {
        //TODO: Implement or remove and replace with initializeCells()
    }

    /**
     * Settings provider.
     * @return current settings.
     */
    public Constraint getConstraint() {
        return constraint;
    }

    /**
     * Sets the setting.
     * @param new settings to be set
     */
    public void setConstraint(Constraint val) {
        this.constraint = val;
    }

    /**
     * Provide the current Game object instance.
     * @return game to be returned
     */
    public Game getGame() {
        return game;
    }

    /**
     * Sets the current Game instance.
     * @param game to be set
     */
    public void setGame(Game val) {
        this.game = val;
    }

    /**
     * Retrieve the statistics.
     * @return statistics
     */
    public List<String> getStatistics() {
        return null;
    }

    public List<JTextField> getCells() {
        return cells;
    }

    public void setCells(List<JTextField> cells) {
        this.cells = cells;
    }

    public GameManager getGameManager() {
        return ApplicationController.getUniqueInstance().getGameManager();
    }

    

    public GUI getGui() {
        return gui;
    }

    public void setGui(GUI gui) {
        this.gui = gui;
    }

    public JTextField getCell() {
        return cell;
    }

    public void setCell(JTextField cell) {
        this.cell = cell;
    }

    public int getMaximalAllowedCellValue() {
        return maximalAllowedCellValue;
    }

    public void setMaximalAllowedCellValue(int maximalAllowedCellValue) {
        this.maximalAllowedCellValue = maximalAllowedCellValue;
    }

    public CellActionListener getCellActionListener() {
        return cellActionListener;
    }

    public void setCellActionListener(CellActionListener cellActionListener) {
        this.cellActionListener = cellActionListener;
    }
    public CellFocusListener getCellFocusListener() {
        return cellFocusListener;
    }

    public void setCellFocusListener(CellFocusListener cellFocusListener) {
        this.cellFocusListener = cellFocusListener;
    }

    public CellKeyListener getCellKeyListener() {
        return cellKeyListener;
    }

    public void setCellKeyListener(CellKeyListener cellKeyListener) {
        this.cellKeyListener = cellKeyListener;
    }

    /**
     * Notify to initialize itself !
     */
    public void init()
    {
    	getGui().init();
    }
    
    /**
     * Notify the controller that the user wishes to exit the application.
     * Exit then...
     */
    public void exit() {
        //TODO Save the score lists etc...
    }
}

