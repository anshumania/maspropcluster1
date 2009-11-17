package biz.karms.hidato.app.util.impl;

import biz.karms.hidato.app.game.impl.HidatoGame;
import biz.karms.hidato.app.game.matrix.impl.HidatoMatrix;
import com.masprop.cluster1.shared.controller.GameGenerator;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;


/**
 *
 * @author
 */
public class HidatoGenerator implements GameGenerator {

    /**
     * Generate game.
     * 
     * @param constraint informations that describe game
     * @return instance of game with generated matrix
     */
    public Game generateGame(Constraint constraint) {
        int[] array = {0,0,20,21,16,17,0,24,0,0,0,0,0,28,0,5,14,0,0,0,0,0,12,10,2,0,7,8,0,35,1,0,0,0,0,36};
        HidatoMatrix matrix = new HidatoMatrix(6, 6, array);
        HidatoGame game = new HidatoGame(constraint, matrix);
        return game;
    }
}
