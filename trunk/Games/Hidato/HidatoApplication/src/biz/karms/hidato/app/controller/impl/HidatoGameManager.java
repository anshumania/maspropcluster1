package biz.karms.hidato.app.controller.impl;

import biz.karms.hidato.app.game.impl.HidatoStatisticManager;
import biz.karms.hidato.app.util.impl.HidatoGenerator;
import biz.karms.hidato.app.util.impl.HidatoSolver;
import biz.karms.hidato.app.util.impl.HidatoValidator;
import biz.karms.hidato.storage.manager.impl.HidatoStorageManager;
import com.masprop.cluster1.shared.controller.GameGenerator;
import com.masprop.cluster1.shared.controller.GameManager;
import com.masprop.cluster1.shared.controller.GameSolver;
import com.masprop.cluster1.shared.controller.GameValidator;
import com.masprop.cluster1.shared.controller.StatisticsManager;
import com.masprop.cluster1.shared.controller.StorageManager;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import java.util.List;

/**
 * 
 * @author
 */
public class HidatoGameManager implements GameManager {

    private Game game = null;
    private GameGenerator gameGenerator = new HidatoGenerator();
    private GameSolver gameSolver = new HidatoSolver();
    private GameValidator gameValidator = new HidatoValidator();
    private StatisticsManager statisticManager = new HidatoStatisticManager();
    private StorageManager storageManager = new HidatoStorageManager();

    /**
     * @return generator
     */
    public GameGenerator getGameGenerator() {
        return this.gameGenerator;
    }

    /**
     * @return solver
     */
    public GameSolver getGameSolver() {
        return this.gameSolver;
    }

    /**
     * @return validator
     */
    public GameValidator getGameValidator() {
        return this.gameValidator;
    }

    /**
     * @return sorageManager
     */
    public StorageManager getStorageManager() {
        return this.storageManager;
    }

    /**
     *
     * @param constraint
     * @return
     */
    public Game getNewGame(Constraint constraint) {
        this.game = this.gameGenerator.generateGame(constraint);
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Validate the current game.
     *
     * @param game
     * @return true if game is valid
     */
    public boolean validateGame(Game game) {
        return this.gameValidator.validateGame(this.game);
    }

    /**
     * Solve the current game.
     *
     * @param game
     * @return
     */
    public Game solveGame(Game game) {
        this.game = this.gameSolver.solveGame(this.game);
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void saveGame(Game game) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Game> loadGame() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return list which contains best scores
     */
    public List<String> getStatistics() {
        return this.statisticManager.getStatistics();
    }
}