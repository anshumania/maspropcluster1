package biz.karms.hidato.view.swing;

import biz.karms.hidato.app.controller.impl.HidatoGameManager;
import biz.karms.hidato.app.game.impl.HidatoGame;
import biz.karms.hidato.app.game.matrix.impl.Coordinates;
import biz.karms.hidato.app.game.matrix.impl.HidatoMatrix;
import com.masprop.cluster1.shared.controller.GameManager;
import com.masprop.cluster1.shared.model.Cell;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.view.GUIManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Michal "Karm" Babacek
 */
public class HidatoGUIManager extends GUIManager {

    private HidatoGame hidatoGame = null;
    private HidatoGUIManager hidatoGUIManager = null;
    private volatile HidatoGUI hidatoGUI = null;

    public HidatoGUIManager(HidatoGameManager hidatoGameManager) {
        setGameManager(hidatoGameManager);
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
        hidatoGame = (HidatoGame) ((HidatoGameManager) getGameManager()).getNewGame(null);
        showGameWizard();
        initializeCells();
        //((HidatoMatrix) hg.getGameMatrix()).write();
        //hg = (HidatoGame) hgm.solveGame(hg);
        //((HidatoMatrix) hg.getGameMatrix()).write();
        return hidatoGame;
    }

    @Override
    public void initializeCells() {
        super.initializeCells();

        int height = ((HidatoMatrix) hidatoGame.getGameMatrix()).getHeight();
        int width = ((HidatoMatrix) hidatoGame.getGameMatrix()).getWidth();
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
         * Iterate through all the rows and columns of the game matrix.
         */
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                /**
                 * Retrieve the cell from the matrix.
                 */
                matrixCell = ((HidatoMatrix) hidatoGame.getGameMatrix()).getCell(new Coordinates(x, y));

                /**
                 * JTextField customization
                 */
                setCell(new JTextField());
                getCell().setBackground(new Color(239, 227, 209));
                getCell().setColumns(2);
                getCell().setFont(new Font("DejaVu Sans", 1, 31));
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
                    if (matrixCell.getCurrentValue() > getMaximalAllowedCellValue()) {
                        setMaximalAllowedCellValue(matrixCell.getCurrentValue());
                    }
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
                getCells().add(getCell());
            }
        }
        ((HidatoGUI) getGui()).getGameBoard().validate();
    }

    private void showGameWizard() {
        //((HidatoGUI) getGui()).getWizardOptionsPanel().setSize(200,30);
        JLabel label1 = new JLabel("Dimension X");
        label1.setSize(100, 20);
        ((HidatoGUI) getGui()).getWizardOptionsPanel().add(label1);

        JTextField textField1 = new JTextField("6");
        textField1.setSize(100, 20);
        ((HidatoGUI) getGui()).getWizardOptionsPanel().add(textField1);
        ((HidatoGUI) getGui()).getWizardWindow().setSize(500, 400);
        ((HidatoGUI) getGui()).getWizardWindow().validate();

        ((HidatoGUI) getGui()).getWizardWindow().setVisible(true);
    }

    private void closeGameWizard() {
        throw new UnsupportedOperationException("Coming soon!");
    }
}
