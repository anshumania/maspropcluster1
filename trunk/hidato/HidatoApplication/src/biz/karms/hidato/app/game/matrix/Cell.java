package biz.karms.hidato.app.game.matrix;

/**
 *
 * @author
 */
public interface Cell {

    /**
     * 
     * @return
     */
    boolean isPredefined();

    /**
     * 
     * @param predefined
     */
    void setPredefined(boolean predefined);

    /**
     * 
     * @return
     */
    int getValue();

    /**
     * 
     * @param value
     */
    void setValue(int value);

    /**
     * 
     * @return
     */
    boolean isActive();

    /**
     *
     * @param active
     */
    void setActive(boolean active);
}
