package biz.karms.hidato.view.swing;

import com.masprop.cluster1.shared.view.GUI;

/**
 *
 * @author Michal "Karm" Babacek
 */
public class HidatoGUI extends GUI {

    /** Creates new form HidatoGUI */
    public HidatoGUI() {
        setGuiManager(new HidatoGUIManager(this));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new HidatoGUI().setVisible(true);
            }
        });

        //TODO:remove
        /*HidatoGameManager hgm = new HidatoGameManager();
        HidatoGame hg = (HidatoGame) hgm.getNewGame(null);
        ((HidatoMatrix) hg.getGameMatrix()).write();
        hg = (HidatoGame) hgm.solveGame(hg);
        ((HidatoMatrix) hg.getGameMatrix()).write();*/
    }
}
