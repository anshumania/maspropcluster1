package biz.karms.hidato.app.game.matrix.impl;

/**
 * describes position at the axis
 * by pair of numbers, one for horizontal axis
 * and one for vertical axis
 *
 * @author
 */
public class Coordinates {

    private int x;  //value on the horizontal axis
    private int y;  //value on the vertical axis

    /**
     *
     * @param x
     * @param y
     */
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return value on the horizontal axis
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return value on the vertical axis
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
}
