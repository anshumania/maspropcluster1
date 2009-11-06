package com.masprop.cluster1.shared.controller;

import java.util.List;

import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;

// TODO: Auto-generated Javadoc
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.688451B6-74F9-0A7F-1CE3-18B04D11802E]
// </editor-fold> 
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
 * 
 * @version 1.0
 * @since 1.0
 */
public interface GameManager {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.61AA2A5F-7539-5F4E-0562-3E4A1356EC6A]
    // </editor-fold> 
    /**
     * Gets the game generator.
     *
     * @return the game generator
     */
    public GameGenerator getGameGenerator();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EFE06DD9-22B7-08F4-A074-278B691222C3]
    // </editor-fold> 
    /**
     * Gets the game solver.
     * 
     * @return the game solver
     */
    public GameSolver getGameSolver();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.49E36902-A6FD-F6E4-D8ED-83E0F083DB57]
    // </editor-fold> 
    /**
     * Gets the game validator.
     * 
     * @return the game validator
     */
    public GameValidator getGameValidator();

    /**
     * Gets the storage manager.
     *
     * @return the storage manager
     */
    public StorageManager getStorageManager();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.332EE15D-E0F3-E8CB-C86F-E9AC53717622]
    // </editor-fold> 
    /**
     * Gets the new game.
     * 
     * @param constraint the constraint
     * 
     * @return the new game
     */
    public Game getNewGame(Constraint constraint);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.28E1D2EC-9E15-5BD4-59BE-78D8E79D8A6B]
    // </editor-fold> 
    /**
     * Validate game.
     * 
     * @param game the game
     * 
     * @return true, if successful
     */
    public boolean validateGame(Game game);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.223FCFE8-721B-5A88-5B05-E43BDB0EE4DA]
    // </editor-fold> 
    /**
     * Solve game.
     * 
     * @param game the game
     * 
     * @return the game
     */
    public Game solveGame(Game game);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.67372566-AF1D-86C6-37A8-B83133198391]
    // </editor-fold> 
    /**
     * Save game.
     * 
     * @param game the game
     */
    public void saveGame(Game game);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CC2D028C-69E2-ACA8-A490-CE51B71F4BFE]
    // </editor-fold> 
    /**
     * Load game.
     * 
     * @return the list< game>
     */
    public List<Game> loadGame();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.033EE7D3-E0B9-968F-4D33-D5FD336430FB]
    // </editor-fold> 
    /**
     * Gets the statistics.
     * 
     * @return the statistics
     */
    public List<String> getStatistics();
}

