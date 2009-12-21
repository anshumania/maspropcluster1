package biz.karms.hidato.view.swing;

import biz.karms.hidato.app.controller.impl.HidatoGameManager;
import biz.karms.hidato.app.game.impl.HidatoGame;
import com.masprop.cluster1.shared.model.Cell;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Coordinates;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.Matrix;
import com.masprop.cluster1.shared.view.GUIManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Michal "Karm" Babacek
 */
public class HidatoGUIManager extends GUIManager {

    private HidatoGUIManager hidatoGUIManager = null;
    private HidatoGUI hidatoGUI = null;
    private JTextField[][] cellsEditedByUser = null;
    private int height = 0;
    private int width = 0;
    private JFrame statFrame = null;
    private JFrame winnerFrame = null;
    private long gameStartedTimestamp = 0;
    private boolean gameIsRunning = false;
    private boolean winner = false;
    private double score = .0;

    public HidatoGUIManager(HidatoGameManager hidatoGameManager) {
        hidatoGUIManager = this;
        init();
    }

    @Override
    public void init() {
        java.awt.EventQueue.invokeLater(
                new Runnable() {

                    public void run() {
                        hidatoGUI = new HidatoGUI(hidatoGUIManager);
                        hidatoGUI.setVisible(true);
                    }
                });
    }

    /**
     * Get a new game
     * @param constraint
     * @return
     */
    @Override
    public Game getNewGame(Constraint constraint) {
        setGame((HidatoGame) ((HidatoGameManager) getGameManager()).getNewGame(constraint));
        initializeCells();
        getGui().getStatusText().setForeground(Color.red);
        getGui().getStatusText().setBackground(Color.black);
        getGui().getStatusText().setFont(new Font("DejaVu Sans", 1, 18));
        getGui().getStatusText().validate();
        getGui().getStatusBar().validate();
        gameStartedTimestamp = System.currentTimeMillis();
        gameIsRunning = true;
        Thread timer = new Thread() {

            @Override
            public void run() {
                while (gameIsRunning) {
                    long diff = System.currentTimeMillis() - gameStartedTimestamp;
                    getGui().getStatusText().setText((diff / 1000 / 60) + ":" + ((diff / 1000) % 60));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(HidatoGUIManager.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        timer.start();
        return getGame();
    }

    @Override
    public void initializeCells() {
        super.initializeCells();
        ((HidatoGUI) getGui()).getGameBoard().removeAll();
        ((HidatoGUI) getGui()).getGameBoard().setVisible(false);
        ((HidatoGUI) getGui()).getGameBoard().validate();
        ((HidatoGUI) getGui()).getGameBoard().setVisible(true);

        this.height = getGame().getGameMatrix().getHeight();
        this.width = getGame().getGameMatrix().getWidth();

        cellsEditedByUser = new JTextField[width][height];
        Cell matrixCell = null;

        /**
         * This is very important setting where you set up the Grid layout.
         * If you don't set up the correct amount of rows and columns, you will
         * not see your matrix in proper shape. The Grid layout is being filled up from
         * the top-left corner line by line (row by row).
         */
        ((GridLayout) ((HidatoGUI) getGui()).getGameBoard().getLayout()).setColumns(width);
        ((GridLayout) ((HidatoGUI) getGui()).getGameBoard().getLayout()).setRows(height);


        /**
         * Find the maximum value
         */
        int maximumValue = 0;
        int currentValue = 0;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                currentValue = getGame().getGameMatrix().getCell(new Coordinates(x, y)).getCurrentValue();
                if (currentValue > maximumValue) {
                    maximumValue = currentValue;
                }
            }
        }
        setMaximalAllowedCellValue(maximumValue);
        /**
         * Iterate through all the rows and columns of the game matrix.
         */
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                /**
                 * Retrieve the cell from the matrix.
                 */
                matrixCell = getGame().getGameMatrix().getCell(new Coordinates(x, y));

                /**
                 * JTextField customization
                 */
                setCell(new JTextField());
                if (matrixCell.getCurrentValue() == maximumValue) {
                    getCell().setBackground(new Color(244, 174, 174));
                } else if (matrixCell.getCurrentValue() == 1) {
                    getCell().setBackground(new Color(191, 244, 147));
                } else {
                    getCell().setBackground(new Color(239, 227, 209));
                }
                getCell().setColumns(2);
                getCell().setDisabledTextColor(new Color(66, 39, 0));
                if (maximumValue > 99) {
                    getCell().setFont(new Font("DejaVu Sans", 1, 9));
                } else {
                    getCell().setFont(new Font("DejaVu Sans", 1, 31));
                }
                getCell().setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
                getCell().setMaximumSize(new Dimension(2, 2));
                getCell().setMinimumSize(new Dimension(2, 2));

                getCell().addActionListener(getCellActionListener());
                getCell().addFocusListener(getCellFocusListener());
                getCell().addKeyListener(getCellKeyListener());

                /**
                 * Fetch the maximum allowed cell value for the validation purposes
                 */
                if (matrixCell.getCurrentValue() != 0) {
                    /**
                     * Set the cell value
                     */
                    getCell().setText(String.valueOf(matrixCell.getCurrentValue()));
                }
                /**
                 * Determine whether the cell should be actually visible or not.
                 * This allows us to create various shapes on the game board.
                 * You can separate e.g. four 3x3 fields like
                 *
                 * 1 1 1 0 1 1 1
                 * 1 1 1 0 1 1 1
                 * 1 1 1 0 1 1 1
                 * 0 0 0 0 0 0 0
                 * 1 1 1 0 1 1 1
                 * 1 1 1 0 1 1 1
                 * 1 1 1 0 1 1 1
                 *
                 * and so on...
                 */
                if (matrixCell.isActive()) {
                    getCell().setVisible(true);
                } else {
                    getCell().setVisible(false);
                }

                /**
                 * Determine whether the cell will be editable by user.
                 * The cell that is not editable is visible, you can see
                 * the value but you can not modify it from GUI.
                 */
                if (matrixCell.isEditable()) {
                    getCell().setEnabled(true);
                } else {
                    getCell().setEnabled(false);
                }

                /**
                 * Add the cell to the GameBoard. Cells are being added to the
                 * grid layout from the top-left corner line by line.
                 * You have to set the correct amount of columns and rows in order
                 * to have the grid OK.
                 */
                ((HidatoGUI) getGui()).getGameBoard().add(getCell());

                /**
                 * Just a collection of cells for further use...
                 */
                cellsEditedByUser[x][y] = getCell();
            }
        }
        ((HidatoGUI) getGui()).getGameBoard().validate();
    }

    @Override
    public void gameOver() {
        long gameDuration = System.currentTimeMillis() - gameStartedTimestamp;
        gameIsRunning = false;
        winner = false;
        try {
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    cellsEditedByUser[x][y].setEditable(false);
                }
            }

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Coordinates coordinates = new Coordinates(x, y);
                    if (getGame().getGameMatrix().getCell(coordinates).getCurrentValue() == 0) {
                        getGame().getGameMatrix().getCell(coordinates).setCurrentValue(Integer.parseInt(cellsEditedByUser[x][y].getText()));
                    }
                }
            }
            winner = getGameManager().getGameValidator().validateGame(getGame());
        } catch (NumberFormatException ex) {
            winner = false;
        }

        winnerFrame = new JFrame("Winner or looser?");
        winnerFrame.setBounds(250, 250, 450, 225);
        winnerFrame.add(((HidatoGUI) getGui()).getWinnerPanel());

        if (winner) {
            getGame().setTime(gameDuration);
            score = getGameManager().getStatisticsManager().getScoreFor(getGame());
            ((HidatoGUI) getGui()).getWinnerText().setForeground(Color.GREEN);
            ((HidatoGUI) getGui()).getWinnerText().setText("Your solution is correct! Duration:" + (gameDuration / 1000 / 60) + ":" + ((gameDuration / 1000) % 60) + ", Score:" + Math.round(score));
            ((HidatoGUI) getGui()).getWinnersName().setText("Your name please...");
        } else {
            ((HidatoGUI) getGui()).getWinnerText().setForeground(Color.RED);
            ((HidatoGUI) getGui()).getWinnerText().setText("Your solution is not correct Duration:" + (gameDuration / 1000 / 60) + ":" + ((gameDuration / 1000) % 60));
            ((HidatoGUI) getGui()).getWinnersName().setEnabled(false);
        }
        winnerFrame.setVisible(true);
        winnerFrame.validate();
    }

    @Override
    public void getHelp() {
        ((HidatoGUI) getGui()).manualMenuItemActionPerformed();
    }

    @Override
    public Properties getStatistics() {
        statFrame = new JFrame("Scores");
        statFrame.add(((HidatoGUI) getGui()).getStatPanel());
        Properties properties = getGameManager().getStatistics();
        ((GridLayout) ((HidatoGUI) getGui()).getStatPanelContainer().getLayout()).setRows(properties.keySet().size());

        for (Object key : properties.keySet()) {
            ((HidatoGUI) getGui()).getStatPanelContainer().add(new JLabel((String) key));
            ((HidatoGUI) getGui()).getStatPanelContainer().add(new JLabel(properties.getProperty((String) key)));
        }
        ((HidatoGUI) getGui()).getStatPanelContainer().validate();
        statFrame.setBounds(200, 200, 300, 450);

        statFrame.setVisible(true);
        statFrame.validate();
        return properties;
    }

    public void closeStatisctic() {
        statFrame.setVisible(false);
        statFrame.validate();
    }

    public void closeWinnerFrame() {
        winnerFrame.setVisible(false);
        winnerFrame.validate();
        if (winner) {
            if (getGameManager().getStatisticsManager().isAHighScore(score)) {
                getGameManager().getStatisticsManager().addHighScore(score, ((HidatoGUI) getGui()).getWinnersName().getText());
                getStatistics();
            }
        }
    }

    @Override
    public void updateGameObject() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Coordinates coordinates = new Coordinates(x, y);
                if (getGame().getGameMatrix().getCell(coordinates).getCurrentValue() == 0) {
                    if (!cellsEditedByUser[x][y].getText().isEmpty()) {
                        getGame().getGameMatrix().getCell(coordinates).setCurrentValue(Integer.parseInt(cellsEditedByUser[x][y].getText()));
                    }
                }
            }
        }
    }
}
