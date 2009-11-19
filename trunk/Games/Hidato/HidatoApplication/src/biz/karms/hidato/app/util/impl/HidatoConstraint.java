package biz.karms.hidato.app.util.impl;

import com.masprop.cluster1.shared.model.Constraint;

/**
 * Extending the default Constraint
 * @author Michal "Karm" Babacek
 */
public class HidatoConstraint extends Constraint {

    private int xDimension = 0;
    private int yDimension = 0;

    public HidatoConstraint() {
    }

    public int getxDimension() {
        return xDimension;
    }

    public void setxDimension(int xDimension) {
        this.xDimension = xDimension;
    }

    public int getyDimension() {
        return yDimension;
    }

    public void setyDimension(int yDimension) {
        this.yDimension = yDimension;
    }
}
