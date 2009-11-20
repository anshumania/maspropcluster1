package com.masprop.cluster1.shared.controller;

import java.util.List;


import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameType;
import java.io.File;

/**
 * This Interface provides the management operations on a <tt>Game</tt>
 * 
 * <p>All classes which need to manage operations on <tt>Game</tt> 
 * should implement this interface. Ideally there should be one GameManager
 * per instance of a game application. However the decision is left up
 * to the developer.</p>
 * 
 * <p>The interface provides for retrieving the specific Controllers of
 * a game, the <tt>GameGenerator</tt>, the <tt>GameValidator</tt> and
 * the <tt>GameSolver</tt> and delegating the client's requests to them</p>
 *
 * <p>Also this interface provides the handle for the <tt>StorageManager</tt><p>
 * 
 * 
 * @see Game
 * @see GameGenerator
 * @see GameSolver
 * @see GameValidator
 * @see StorageManager
 * @author Anshuman Mehta
 * @version 1.0
 * @since 1.0
 */
public abstract class GameManager {

    protected GameGenerator gameGenerator;
    protected GameSolver gameSolver;
    protected GameValidator gameValidator;
    protected StorageManager storageManager;
    protected StatisticsManager statisticsManager;

    /**
     * Gets the game generator.
     *
     * @return the game generator
     */
    public GameGenerator getGameGenerator() {
        return gameGenerator;
    }

    /**
     * Gets the game solver.
     * 
     * @return the game solver
     */
    public GameSolver getGameSolver() {
        return gameSolver;
    }

    /**
     * Gets the game validator.
     * 
     * @return the game validator
     */
    public GameValidator getGameValidator() {
        return gameValidator;
    }

    /**
     * Gets the storage manager.
     *
     * @return the storage manager
     */
    public StorageManager getStorageManager() {
        return storageManager;
    }

    /**
     * Gets the new game.
     * 
     * @param constraint the constraint
     * 
     * @return the new game
     */
    public Game getNewGame(Constraint constraint) {
        return getGameGenerator().generateGame(constraint);
    }

    /**
     * Validate game.
     * 
     * @param game the game
     * 
     * @return true, if successful
     */
    public boolean validateGame(Game game) {
        return getGameValidator().validateGame(game);
    }

    /**
     * Solve game.
     * 
     * @param game the game
     * 
     * @return the game
     */
    public Game solveGame(Game game) {
        return getGameSolver().solveGame(game);
    }

    /**
     * Save game.
     * 
     * @param game the game
     */
    public void saveGame(Game game, File file) {
        getStorageManager().saveToFile(game, file, ApplicationController.getGameToPlay());
    }

    /**
     * Load game.
     * 
     * @return the game
     */
    public Game loadGame(File file) {
        return getStorageManager().loadFromFile(file, ApplicationController.getGameToPlay());
    }

    /**
     * Gets the statistics.
     * 
     * @return the statistics
     */
    public List<String> getStatistics() {
        return new java.util.ArrayList<String>();
    }

    public void setGameGenerator(GameGenerator gameGenerator) {
        this.gameGenerator = gameGenerator;
    }

    public void setGameSolver(GameSolver gameSolver) {
        this.gameSolver = gameSolver;
    }

    public void setGameValidator(GameValidator gameValidator) {
        this.gameValidator = gameValidator;
    }

    public void setStorageManager(StorageManager storageManager) {
        this.storageManager = storageManager;
    }

    public void setStatisticsManager(StatisticsManager statisticsManager) {
        this.statisticsManager = statisticsManager;
    }

    public StatisticsManager getStatisticsManager() {
        return statisticsManager;
    }

  }

