package biz.karms.hidato.app.game.matrix.impl;

import biz.karms.hidato.app.game.matrix.Cell;

/**
 * represents cell with value and others attributes which describe it
 * 
 * @author
 */
public class CellImpl implements Cell{

    private int value;
    private boolean active;
    private boolean editable;

    /**
     *
     * @param value
     * @param active
     * @param editable
     */
    public CellImpl(int value, boolean active, boolean editable) {
        this.value = value;
        this.active = active;   //describes if cell is active or not
        this.editable = editable;   //if true, it is not allowed to modify value
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

    public boolean isPredefined() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setPredefined(boolean predefined) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     *
     * @return
     */
    public boolean isEditable() {
        return editable;
    }

    /**
     *
     * @param editable
     */
    public void setEditable(boolean editable) {
        this.editable = editable;
    }
}
