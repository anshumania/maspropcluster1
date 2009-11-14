package biz.karms.hidato.app.controller;

import biz.karms.hidato.app.game.matrix.impl.HidatoMatrix;
import com.masprop.cluster1.shared.model.Game;
import java.util.TreeMap;

/**
 *
 * @author Michal Karm Babacek
 */
public interface Controller {



    /**
     * Generate a game according to the user's preferencies.
     *
     * @param cells number of cells in total
     * @param filledCells   number of cell filled with numbers
     * @param shape one of the possible gamematrix shapes
     * @param difficultyLevel difficulty level chosen by user
     * @return Game with game matrixes, available for player to play
     */
    Game generateGame(int cells, int filledCells, int shape, int difficultyLevel);

    /**
     *
     * @return Current score list (if there is no score list loaded in the ScoreHandler, load it from storage)
     */
    TreeMap<Integer, String> getScoreList();

    /**
     * Updates score list
     * @param scoreList
     */
    void updateScoreList(TreeMap<Integer, String> scoreList);

    /**
     * Validate solution
     * @param matrix player's work
     * @return true if the solution is valid, false othervise
     */
    boolean validateSolution(HidatoMatrix matrix);


}
