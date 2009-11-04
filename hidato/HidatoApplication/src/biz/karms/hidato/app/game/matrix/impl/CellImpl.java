package biz.karms.hidato.app.game.matrix.impl;

/**
 *
 * @author
 */
public class CellImpl {

    private int value;
    private boolean predefined;
    private boolean active;

    public CellImpl(int value, boolean predefined, boolean active) {
        this.value = value;
        this.predefined = predefined;
        this.active = active;
    }

    public boolean isPredefined() {
        return predefined;
    }

    public void setPredefined(boolean predefined) {
        this.predefined = predefined;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
