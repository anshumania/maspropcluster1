package biz.karms.hidato.view.swing;

import com.masprop.cluster1.shared.view.GUI;
import com.masprop.cluster1.shared.view.GUIManager;

/**
 *
 * @author Michal "Karm" Babacek
 */
public class HidatoGUI extends GUI {

    public HidatoGUI(GUIManager guiManager) {
        setGuiManager(guiManager);
        guiManager.setGui(this);
    }
}

