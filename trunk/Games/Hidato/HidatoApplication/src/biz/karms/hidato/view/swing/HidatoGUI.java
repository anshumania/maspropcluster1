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
    }
}
