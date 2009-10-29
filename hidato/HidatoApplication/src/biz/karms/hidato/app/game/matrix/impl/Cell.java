package biz.karms.hidato.app.game.matrix.impl;

/**
 *
 * @author
 */
public class Cell {

    private int value;
    private boolean predefined;
    private boolean active;

    public Cell(int value, boolean predefined, boolean active) {
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
}
