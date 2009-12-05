package biz.karms.hidato.app.util.impl;

import biz.karms.hidato.app.game.impl.HidatoGame;
import com.masprop.cluster1.shared.controller.GameSolver;
import com.masprop.cluster1.shared.model.Coordinates;
import com.masprop.cluster1.shared.model.Direction;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.Matrix;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Provides methods needed to solve a <tt>game</tt>.
 *
 * @see Game
 * @author Matus Pleva
 */
public class HidatoSolver implements GameSolver {

    /**
     * Current coordinates.
     */
    private Coordinates currentCoo;
    /**
     * Current value.
     */
    private int currentVal;
    /**
     * Current matrix.
     */
    private Matrix matrix;
    /**
     * Collection contains predefined values and non-active cells.
     */
    private Map<Integer, Coordinates> predefined
            = new HashMap<Integer, Coordinates>();
    /**
     * Collection contains coordinates of non-active cells.
     */
    private List<Coordinates> nonActive = new ArrayList<Coordinates>();
    /**
     * Contains each value already in matrix (not predefined)
     * with his last movement from previous value.
     */
    private Map<Integer, Direction> lastDir
            = new HashMap<Integer, Direction>();
    /**
     * Contains already filled values and their coordinates.
     */
    private Map<Integer, Coordinates> path
            = new HashMap<Integer, Coordinates>();

    public HidatoSolver() {
    }

    /**
     * Solve given game.
     *
     * @param game game which will be solved
     * @return game with solved matrix
     */
    public Game solveGame(Game game) {
        HidatoGame hidatoGame = (HidatoGame) game;
        this.matrix = hidatoGame.getGameMatrix();
        //set current value to 1
        this.currentVal = 1;
        //inicialize collections
        this.predefined.clear();
        this.nonActive.clear();
        this.lastDir.clear();
        this.path.clear();
        for (int i = this.matrix.getHeight() - 1; i >= 0; i--) {
            for (int j = 0; j < this.matrix.getWidth(); j++) {
                //fill collections predefined and path widh predefined values
                if (!this.matrix.getCell(new Coordinates(j, i)).isEditable()) {
                    this.predefined.put(this.matrix.getCell(
                            new Coordinates(j, i)).getCurrentValue(),
                            new Coordinates(j, i));
                    this.path.put(this.matrix.getCell(
                            new Coordinates(j, i)).getCurrentValue(),
                            new Coordinates(j, i));
                }
                //fill collection nonActive with non-active cells
                if (!this.matrix.getCell(new Coordinates(j, i)).isActive()) {
                    this.nonActive.add(new Coordinates(j, i));
                }
            }
        }
        //set currentCoo to coordinates of first number
        this.currentCoo = new Coordinates(predefined.get(currentVal).getX(),
                predefined.get(currentVal).getY());

        while (!this.putNext()) {
        }
        return hidatoGame;
    }

    /**
     * Put next value into matrix.
     *
     * @return true if matrix is already solved
     */
    public boolean putNext() {
        currentVal++;
        //check if solution is finished
        if (currentVal < ((matrix.getHeight() * matrix.getWidth())
                - nonActive.size() + 1)) {
            //check if value is in predefined
            if (predefined.containsKey(currentVal)) {
                //check if currentCoo is consecutive with coordinates
                //of predefined value
                if (currentCoo.isConsecutive(predefined.get(currentVal))) {
                    //set new value to currentCoo
                    currentCoo.setX(predefined.get(currentVal).getX());
                    currentCoo.setY(predefined.get(currentVal).getY());
                } else {
                    //remove value from matrix and path
                    if (predefined.containsKey(currentVal - 1)) {
                        throw new IllegalArgumentException("given matrix" +
                                " is not valid");
                    } else {
                        matrix.getCell(currentCoo).setCurrentValue(0);
                        if (path.containsKey(currentVal - 1)) {
                            path.remove(currentVal - 1);
                        }
                    }
                    //set currentVal to previous value
                    currentVal = currentVal - 2;
                    //set currentCoo to previous value
                    currentCoo.setX(path.get(currentVal).getX());
                    currentCoo.setY(path.get(currentVal).getY());
                }
            } else {
                //compute next direction and coordinates
                Direction nextDir;
                nextDir = nextDir(lastDir.get(currentVal));
                //check if it is possible to place value
                if (nextDir != null) {
                    //put new value to lastDir
                    lastDir.put(currentVal, nextDir);
                    //update currentCoo according to nextDir
                    currentCoo.setCoordinates(nextDir);
                    //put new value to matrix and path
                    matrix.setCellValue(currentCoo, currentVal);
                    path.put(currentVal, new Coordinates(currentCoo.getX(),
                            currentCoo.getY()));
                } else {
                    //how deep we must go to be able to remove some value
                    //(check if vales are predefined)
                    int i = 0;
                    while (predefined.containsKey(currentVal - (i + 1))) {
                        i++;
                    }
                    //if there is no other possibility to replace number
                    //and we need to replace starting value then exit
                    if (currentVal - (i + 1) < 1) {
                        throw new IllegalArgumentException("game is not solvable");
                    }
                    //remove value from lastDir
                    lastDir.remove(currentVal);
                    //remove from matrix and path
                    matrix.setCellValue(path.get(currentVal - (1 + i)), 0);
                    path.remove(currentVal - (1 + i));
                    //set currentVal to previous value
                    currentVal = currentVal - (2 + i);
                    //set currentCoo to previous value
                    currentCoo.setX(path.get(currentVal).getX());
                    currentCoo.setY(path.get(currentVal).getY());
                }
            }
            return false;
        } else {
            return true;
        }
    }

    /**
     * Decide which will be the next direction of movement.
     *
     * @param lastDir last direction of this number
     * @return identifier of next direction
     */
    public Direction nextDir(Direction lastDir) {
        Direction nextDir = null;
        Coordinates temp = null;
        int width = this.matrix.getWidth() - 1;
        int height = this.matrix.getHeight() - 1;
        if (lastDir == null) {
            temp = new Coordinates(currentCoo.getX(), currentCoo.getY() + 1);
            if (currentCoo.getY() < height
                    && matrix.getCell(temp).getCurrentValue() == 0) {
                nextDir = Direction.BOTTOM;
            } else {
                lastDir = Direction.BOTTOM;
            }
        }
        if (lastDir != null) {
            if (lastDir.equals(Direction.BOTTOM)) {
                temp = new Coordinates(currentCoo.getX() - 1,
                        currentCoo.getY() + 1);
                if (currentCoo.getX() > 0 && currentCoo.getY() < height
                        && matrix.getCell(temp).getCurrentValue() == 0) {
                    nextDir = Direction.LEFTBOTTOM;
                } else {
                    lastDir = Direction.LEFTBOTTOM;
                }
            }
            if (lastDir.equals(Direction.LEFTBOTTOM)) {
                temp = new Coordinates(currentCoo.getX() - 1,
                        currentCoo.getY());
                if (currentCoo.getX() > 0
                        && matrix.getCell(temp).getCurrentValue() == 0) {
                    nextDir = Direction.LEFT;
                } else {
                    lastDir = Direction.LEFT;
                }
            }
            if (lastDir.equals(Direction.LEFT)) {
                temp = new Coordinates(currentCoo.getX() - 1,
                        currentCoo.getY() - 1);
                if (currentCoo.getX() > 0 && currentCoo.getY() > 0
                        && matrix.getCell(temp).getCurrentValue() == 0) {
                    nextDir = Direction.LEFTTOP;
                } else {
                    lastDir = Direction.LEFTTOP;
                }
            }
            if (lastDir.equals(Direction.LEFTTOP)) {
                temp = new Coordinates(currentCoo.getX(),
                        currentCoo.getY() - 1);
                if (currentCoo.getY() > 0
                        && matrix.getCell(temp).getCurrentValue() == 0) {
                    nextDir = Direction.TOP;
                } else {
                    lastDir = Direction.TOP;
                }
            }
            if (lastDir.equals(Direction.TOP)) {
                temp = new Coordinates(currentCoo.getX() + 1,
                        currentCoo.getY() - 1);
                if (currentCoo.getX() < width 
                        && currentCoo.getY() > 0
                        && matrix.getCell(temp).getCurrentValue() == 0) {
                    nextDir = Direction.RIGHTTOP;
                } else {
                    lastDir = Direction.RIGHTTOP;
                }
            }
            if (lastDir.equals(Direction.RIGHTTOP)) {
                temp = new Coordinates(currentCoo.getX() + 1,
                        currentCoo.getY());
                if (currentCoo.getX() < width
                        && matrix.getCell(temp).getCurrentValue() == 0) {
                    nextDir = Direction.RIGHT;
                } else {
                    lastDir = Direction.RIGHT;
                }
            }
            if (lastDir.equals(Direction.RIGHT)) {
                temp = new Coordinates(currentCoo.getX() + 1,
                        currentCoo.getY() + 1);
                if (currentCoo.getX() < width && currentCoo.getY() < height
                        && matrix.getCell(temp).getCurrentValue() == 0) {
                    nextDir = Direction.RIGHTBOTTOM;
                } else {
                    lastDir = Direction.RIGHTBOTTOM;
                }
            }
        }
        return nextDir;
    }

    /**
     * @return current coordinates
     */
    public Coordinates getCurrentCoo() {
        return currentCoo;
    }

    /**
     * @param currentCoo curent coordinates
     */
    public void setCurrentCoo(Coordinates currentCoo) {
        this.currentCoo = currentCoo;
    }

    /**
     * @return value which are we trying to put to next cell
     */
    public int getCurrentVal() {
        return currentVal;
    }

    /**
     * @param currentVal value
     * which are we trying to put to next cell
     */
    public void setCurrentVal(int currentVal) {
        this.currentVal = currentVal;
    }

    /**
     * @return current matrix
     */
    public Matrix getMatrix() {
        return matrix;
    }

    /**
     * @param matrix current matrix
     */
    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }
}
