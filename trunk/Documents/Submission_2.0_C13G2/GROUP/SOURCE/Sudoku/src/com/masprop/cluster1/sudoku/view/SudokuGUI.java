package com.masprop.cluster1.sudoku.view;

import com.masprop.cluster1.shared.view.GUI;

/**
 *
 * @author Matteo De Martino
 */
public class SudokuGUI extends GUI {

    /** Creates new form HidatoGUI */
    public SudokuGUI() {
        setGuiManager(new SudokuGUIManager());
        getGuiManager().setGui(this);
    }
    @Override
    public void init()
    {
    	java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SudokuGUI().setVisible(true);
            }
        });
    }
    
}
