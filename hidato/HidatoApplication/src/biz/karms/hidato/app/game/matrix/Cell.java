package biz.karms.hidato.app.game.matrix;

/**
 * represents cell with value and others attributes which describe it
 *
 * @author
 */
public interface Cell {

    /**
     *
     * @return value of the cell
     */
    int getValue();

    /**
     *
     * @param value
     */
    void setValue(int value);

    /**
     *
     * @return true if cell is active
     */
    boolean isActive();

    /**
     *
     * @param active
     */
    void setActive(boolean active);

    /**
     *
     * @return true if cell is editable
     */
    boolean isEditable();

    /**
     *
     * @param editable
     */
    void setEditable(boolean editable);
}
