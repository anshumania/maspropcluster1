package biz.karms.hidato.view.swing;

import biz.karms.hidato.app.controller.impl.HidatoGameManager;
import biz.karms.hidato.app.game.impl.HidatoGame;
import biz.karms.hidato.app.game.matrix.impl.Coordinates;
import biz.karms.hidato.app.game.matrix.impl.HidatoMatrix;
import com.masprop.cluster1.shared.model.Cell;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.view.GUI;
import com.masprop.cluster1.shared.view.GUIManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Michal "Karm" Babacek
 */
public class HidatoGUIManager extends GUIManager {
    /**
    * JUST TESTING
    */
   
    HidatoGame hidatoGame = null;

    public HidatoGUIManager(GUI gui) {
       super(gui);
       this.setGameManager(new HidatoGameManager());
    }

    /**
     * JUST TESTING
     * @param constraint
     * @return
     */
    @Override
    public Game getNewGame(Constraint constraint) {
        hidatoGame = (HidatoGame) getGameManager().getNewGame(null);
        initializeCells();
        //((HidatoMatrix) hg.getGameMatrix()).write();
        //hg = (HidatoGame) hgm.solveGame(hg);
        //((HidatoMatrix) hg.getGameMatrix()).write();
        return hidatoGame;
    }

    @Override
    public void initializeCells() {
        super.initializeCells();
                System.out.println("Hidato game"+hidatoGame.toString());

        int height = ((HidatoMatrix) hidatoGame.getGameMatrix()).getHeight();
        int width = ((HidatoMatrix) hidatoGame.getGameMatrix()).getWidth();
        Cell matrixCell = null;
                System.out.println("initializing cells");

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < height; x++) {
                matrixCell = ((HidatoMatrix) hidatoGame.getGameMatrix()).getCell(new Coordinates(x, y));

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

                if(matrixCell.getCurrentValue() != 0) {
                    getCell().setText(String.valueOf(matrixCell.getCurrentValue()));
                }
                if(matrixCell.isActive()) {
                    getCell().setVisible(true);
                } else {
                    getCell().setVisible(false);
                }

                if(matrixCell.isEditable()) {
                    getCell().setEnabled(true);
                } else {
                    getCell().setEnabled(false);
                }
                ((HidatoGUI)getGui()).getGameBoard().add(getCell());
                getCells().add(getCell());
            }
        }
                ((HidatoGUI)getGui()).getGameBoard().validate();
    }
}
