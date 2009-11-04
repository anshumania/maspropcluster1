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

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
}
