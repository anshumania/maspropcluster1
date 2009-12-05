package biz.karms.hidato.app.util.impl;

import biz.karms.hidato.app.game.impl.HidatoGame;
import com.masprop.cluster1.shared.controller.GameValidator;
import com.masprop.cluster1.shared.model.Coordinates;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.Matrix;
import java.util.HashMap;

/**
 * Provides method needed to check if a <tt>Game</tt> instance is
 * solvable.
 *
 * @author Matus Pleva
 */
public class HidatoValidator implements GameValidator {

    /**
     * Class constructor.
     */
    public HidatoValidator() {
    }

    /**
     * Validate instance of game.
     *
     * @param game game to be validated
     * @return true if game is valid
     */
    public boolean validateGame(Game game) {
        //game matrix
        Matrix matrix = game.getGameMatrix();

        //path with all filled cells and its coordinates
        HashMap<Integer, Coordinates> path = new HashMap<Integer, Coordinates>();

        //indicate if all cells are filled
        boolean filled = true;

        //number of non-active cells
        int nonActive = 0;

        //number of non-filled cells
        int nonFilled = 0;

        //initialize attributes
        for (int y = 0; y < matrix.getHeight(); y++) {
            for (int x = 0; x < matrix.getWidth(); x++) {
                //if not filled
                if (matrix.getCell(new Coordinates(x, y)).getCurrentValue() == 0) {
                    nonFilled++;
                    filled = false;
                } else {
                    //if non active
                    if (matrix.getCell(new Coordinates(x, y)).getCurrentValue() == -1) {
                        nonActive++;
                    } else {
                        path.put(matrix.getCell(new Coordinates(x, y)).getCurrentValue(), new Coordinates(x, y));
                    }
                }
            }
        }
        //if all cells filled
        if (filled) {
            //check if each number appears only once
            if (path.size() != (matrix.getHeight() * matrix.getWidth()) - nonActive) {
                return false;
            }
            for(int i=1;i<=path.size();i++) {
                //path should contain all numbers from 1 to max
                if (!path.containsKey(i)) {
                    return false;
                } else {
                    //if not last number
                    if (i != path.size()) {
                        //if exists next number
                        if (path.containsKey(i+1)) {
                            //check if is consecutive
                            if (!path.get(i).isConsecutive(path.get(i+1))) {
                                return false;
                            }
                        }
                    }
                }
            }
        } else {
            int max = (matrix.getHeight() * matrix.getWidth()) - nonActive;
            //check if each number appears only once
            if (path.size() != max - nonFilled) {
                return false;
            }
            //path contains 1 and max
            if (!path.containsKey(1) || !path.containsKey(max)) {
                return false;
            }
            //all numbers are between 1 and max
            for(int value: path.keySet()) {
                if (value < 1 || value > max) {
                    return false;
                }
            }
            //if two numbers consecutive, their cells should be consecutive
            for(int value: path.keySet()) {
                if (path.containsKey(value+1)) {
                    if (!path.get(value).isConsecutive(path.get(value+1))) {
                        return false;
                    }
                }
            }
            //try to solve matrix
            Game tempGame = new HidatoGame(game.getConstraint(), matrix);
            HidatoSolver solver = new HidatoSolver();
            try {
                tempGame = solver.solveGame(tempGame);
            } catch (RuntimeException re) {
                return false;
            }
        }
        return true;
    }
}