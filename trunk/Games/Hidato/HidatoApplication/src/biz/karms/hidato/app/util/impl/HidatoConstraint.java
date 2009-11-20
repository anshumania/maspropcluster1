package biz.karms.hidato.app.util.impl;

import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.shared.model.GameVariant;

/**
 * Extending the default Constraint
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
    public HidatoConstraint(GameLevelType gameLevelType, GameVariant gameVariant,
            int noOfFilledCells, int xDimension, int yDimension) {
        super(gameLevelType, gameVariant, noOfFilledCells);
        this.xDimension = xDimension;
        this.yDimension = yDimension;
    }

    /**
     * @return dimension x
     */
    public int getxDimension() {
        return xDimension;
    }

    /**
     * @param xDimension dimension x
     */
    public void setxDimension(int xDimension) {
        this.xDimension = xDimension;
    }

    /**
     * @return dimension y
     */
    public int getyDimension() {
        return yDimension;
    }

    /**
     * @param yDimension dimension y
     */
    public void setyDimension(int yDimension) {
        this.yDimension = yDimension;
    }
}
