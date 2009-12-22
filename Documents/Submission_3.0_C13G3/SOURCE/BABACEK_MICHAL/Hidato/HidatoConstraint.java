package biz.karms.hidato.app.util.impl;

import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.shared.model.GameType;
import com.masprop.cluster1.shared.model.GameVariant;

/**
 * Extending the default Constraint
 * @see Constraint
 * @author Michal "Karm" Babacek
 */
public class HidatoConstraint extends Constraint {

    private int xDimension = 0;
    private int yDimension = 0;

    /**
     * Empty class constructor.
     */
    public HidatoConstraint() {
    }

    /**
     * Class constructor.
     */
    public HidatoConstraint(GameLevelType gameLevelType, GameVariant gameVariant, int noOfFilledCells, GameType gameType, int xDimension, int yDimension) {
        super(gameLevelType, gameVariant, noOfFilledCells);
        this.xDimension = xDimension;
        this.yDimension = yDimension;
    }

    /**
     * @return dimension x
     */
    public int getXDimension() {
        return xDimension;
    }

    /**
     * @param xDimension dimension x
     */
    public void setXDimension(int xDimension) {
        this.xDimension = xDimension;
    }

    /**
     * @return dimension y
     */
    public int getYDimension() {
        return yDimension;
    }

    /**
     * @param yDimension dimension y
     */
    public void setYDimension(int yDimension) {
        this.yDimension = yDimension;
    }
}
