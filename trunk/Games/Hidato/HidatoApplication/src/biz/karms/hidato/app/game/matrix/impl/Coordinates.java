package biz.karms.hidato.app.game.matrix.impl;

/**
 * Describes position at the axis
 * by pair of numbers, one for horizontal axis
 * and one for vertical.
 *
 * @author Matus Pleva
 */
public class Coordinates {

    /**
     * Value on the horizontal axis.
     */
    private int x;
    /**
     * Value on the vertical axis.
     */
    private int y;

    /**
     * Class constructor.
     * @param x value on the horizontal axis
     * @param y value on the vertical axis
     */
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return value on the horizontal axis
     */
    public int getX() {
        return x;
    }

    /**
     * @param x value on the horizontal axis
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return value on the vertical axis
     */
    public int getY() {
        return y;
    }

    /**
     * @param y value on the vertical axis
     */
    public void setY(int y) {
        this.y = y;
    }
}
