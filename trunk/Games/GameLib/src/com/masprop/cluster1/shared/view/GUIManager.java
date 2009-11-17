package com.masprop.cluster1.shared.view;

import java.util.List;

import com.masprop.cluster1.shared.controller.GameManager;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
 * @author
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
    private GameManager gameManager = null;

    /**
     * JFrame definitions, GUI elements, action listener
     */
    private GUI gui = null;

    /**
     * GUIManager handles all the GUI actions.
     * @param gui actual GUI
     */
    public GUIManager(GUI gui) {
        this.gui = gui;
    }

    public void initializeCells() {
        CellActionListener cellActionListener = new CellActionListener();
        CellFocusListener cellFocusListener = new CellFocusListener();
        CellKeyListener cellKeyListener = new CellKeyListener();
        JTextField cell = null;
        List<JTextField> cells = new ArrayList<JTextField>();

        for (int i = 0; i < 100; i++) {

            cell = new JTextField();
            cell.setBackground(new Color(239, 227, 209));
            cell.setColumns(2);
            cell.setFont(new Font("DejaVu Sans", 1, 31));
            cell.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
            cell.setMaximumSize(new Dimension(2, 2));
            cell.setMinimumSize(new Dimension(2, 2));

            cell.addActionListener(cellActionListener);
            cell.addFocusListener(cellFocusListener);
            cell.addKeyListener(cellKeyListener);
            //cell.setText(""+i);
            gui.getGameBoard().add(cell);
            cells.add(cell);
        }
        cells.get(13).setVisible(false);
        cells.get(14).setVisible(false);
        cells.get(15).setVisible(false);
        cells.get(16).setVisible(false);

        cells.get(22).setVisible(false);
        cells.get(27).setVisible(false);
        cells.get(32).setVisible(false);
        cells.get(43).setVisible(false);

        cells.get(97).setVisible(false);
        cells.get(88).setVisible(false);
        cells.get(79).setVisible(false);
    }

    class CellKeyListener implements KeyListener {

        public void keyTyped(KeyEvent e) {
            //Nothing
        }

        public void keyPressed(KeyEvent e) {
            //Nothing
        }

        /**
         * Validator for user imput in cells.
         * @param e enent
         */
        public void keyReleased(KeyEvent e) {
            if (e.getSource() instanceof JTextField) {
                try {
                    if (!((JTextField) e.getSource()).getText().isEmpty()) {
                        if (Integer.parseInt(((JTextField) e.getSource()).getText()) > 100) {
                            ((JTextField) e.getSource()).setBorder(new LineBorder(Color.RED, 1, true));
                            ((JTextField) e.getSource()).setText("");
                            gui.getStatusText().setText("Max allowed number you can fill in is 100...");
                        } else {
                            gui.getStatusText().setText("");
                            ((JTextField) e.getSource()).setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
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
     * GameManager.
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

    private void updateGameObject() {
//TODO: DO :-)
    }

    /**
     * Asks the GameManager to persist the current Game object.
     * @param game to be saved
     */
    public void saveGame() {
        updateGameObject();
        gameManager.saveGame(game);
    }

    /**
     * Load a game or a collection of instances of the Game.
     *
     * @return
     */
    public Game loadGame(File file) {
        return gameManager.loadGame(file);
    }

    /**
     * Sets all the JForm elements and all proper variables in order to
     * display the correct UI for the player.
     */
    public void displayGame() {
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

    /**
     * Notify the controller that the user wishes to exit the application.
     * Exit then...
     */
    public void exit() {

    }
}

