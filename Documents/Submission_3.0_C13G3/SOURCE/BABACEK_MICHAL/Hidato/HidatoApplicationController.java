package biz.karms.hidato.app.controller.impl;

import biz.karms.hidato.app.util.impl.HidatoSolver;
import biz.karms.hidato.app.util.impl.HidatoValidator;
import biz.karms.hidato.app.util.impl.KarmHidatoGenerator;
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

        getGameManager().setGameGenerator(new KarmHidatoGenerator());
        getGameManager().setGameSolver(new HidatoSolver());
        getGameManager().setGameValidator(new HidatoValidator());
        getGameManager().setStorageManager(new StorageManager());
        getGameManager().setStatisticsManager(new HidatoStatisticsManager());

        /**
         * Tell the GameManager which game we gonna play...
         */
        ApplicationController.setGameToPlay(GameType.HIDATO);
        setGuiManager(new HidatoGUIManager((HidatoGameManager)getGameManager()));
    }


    	public static void main(String args[])
	{
		ApplicationController.setGameToPlay(GameType.HIDATO);
		ApplicationController sac = ApplicationController.getInstance(GameType.HIDATO);
		//Initialize the components
		//Have to typeCast to get access to the protected method in the same package
		if(sac instanceof HidatoApplicationController)
			((HidatoApplicationController)sac).initalizeComponents();

	}

    @Override
    protected void generateGUI() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
