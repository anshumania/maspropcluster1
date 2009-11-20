package biz.karms.hidato.app.controller.impl;

import biz.karms.hidato.app.util.impl.HidatoGenerator;
import biz.karms.hidato.app.util.impl.HidatoSolver;
import biz.karms.hidato.app.util.impl.HidatoValidator;
import biz.karms.hidato.view.swing.HidatoGUIManager;
import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.controller.StorageManager;
import com.masprop.cluster1.shared.model.GameType;

/**
 *
 * @author Michal "Karm" Babacek
 */
public class HidatoApplicationController extends ApplicationController {

    

    /**
     * Construct the application controller
     */
    private HidatoApplicationController() {
        setUniqueInstance(this);
    }

    /**
     * Instantiate the HidatoApplicationController
     * @return HidatoApplicationController
     */
    public static ApplicationController getHidatoApplicationController() {
        if (getGameToPlay() == null) {
            throw new IllegalArgumentException("Cannot create a Controller for " + getGameToPlay());
        } else {
            return getUniqueInstance() == null ? new HidatoApplicationController() : getUniqueInstance();
        }
    }

    @Override
    public void initalizeComponents() {
        setGameManager(new HidatoGameManager());

        assert getGameManager() != null;

        getGameManager().setGameGenerator(new HidatoGenerator());
        getGameManager().setGameSolver(new HidatoSolver());
        getGameManager().setGameValidator(new HidatoValidator());
        getGameManager().setStorageManager(new StorageManager());
        getGameManager().setStatisticsManager(new HidatoStatisticsManager());

        /**
         * Tell the GameManager which game we gonna play...
         */
        getGameManager().setGameType(GameType.HIDATO);

        setGuiManager(new HidatoGUIManager((HidatoGameManager)getGameManager()));
    }
}
