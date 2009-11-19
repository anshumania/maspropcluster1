package biz.karms.hidato.app.controller.impl;

import biz.karms.hidato.app.util.impl.HidatoGenerator;
import biz.karms.hidato.app.util.impl.HidatoSolver;
import biz.karms.hidato.app.util.impl.HidatoValidator;
import com.masprop.cluster1.shared.controller.GameManager;
import com.masprop.cluster1.shared.controller.StorageManager;
import com.masprop.cluster1.shared.model.Game;


/**
 * Provides the management operations on a <tt>Game</tt>.
 *
 * @see Game
 *
 * @author Matus Pleva
 */
public class HidatoGameManager extends GameManager {

    /**
     * Class constructor.
     */
    public HidatoGameManager() {
        super();
        this.gameGenerator = new HidatoGenerator();
        this.gameSolver = new HidatoSolver();
        this.gameValidator = new HidatoValidator();
        this.statisticsManager = new HidatoStatisticsManager();
        this.storageManager = new StorageManager();
    }
}