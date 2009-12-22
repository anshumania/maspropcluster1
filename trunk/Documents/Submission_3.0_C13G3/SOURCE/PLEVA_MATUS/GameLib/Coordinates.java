package com.masprop.cluster1.shared.model;

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

    /**
     * Checks if cells defined with coordintes are consecutive.
     *
     * @param coordinates coordinates
     * @return true if is consecutive
     */
    public boolean isConsecutive(Coordinates coordinates) {
        int diffX = this.getX() - coordinates.getX();
        int diffY = this.getY() - coordinates.getY();
        return (diffX >= -1) && (diffX <= 1) && (diffY >= -1) && (diffY <= 1);
    }

    /**
     * Checks if cells defined with coordintes are consecutive
     * through 2 cells.
     *
     * @param coordinates coordinates
     * @return true if is consecutive
     */
    public boolean isConsecutive2(Coordinates coordinates) {
        int diffX = this.getX() - coordinates.getX();
        int diffY = this.getY() - coordinates.getY();
        return (diffX >= -2) && (diffX <= 2) && (diffY >= -2) && (diffY <= 2);
    }

    /**
     * Checks if cells defined with coordintes are consecutive
     * through 3 cells.
     *
     * @param coordinates coordinates
     * @return true if is consecutive
     */
    public boolean isConsecutive3(Coordinates coordinates) {
        int diffX = this.getX() - coordinates.getX();
        int diffY = this.getY() - coordinates.getY();
        return (diffX >= -3) && (diffX <= 3) && (diffY >= -3) && (diffY <= 3);
    }

    /**
     * Get new coordinates according direction of the movement.
     *
     * @param direction direction of the movement
     * @return coordinates coordinates after move
     */
    public Coordinates getNewCoordinates(Direction direction) {
        int tmpX = this.getX();
        int tmpY = this.getY();
        if (direction.equals(Direction.BOTTOM)) {
            tmpY++;
        }
        if (direction.equals(Direction.LEFTBOTTOM)) {
            tmpX--;
            tmpY++;
        }
        if (direction.equals(Direction.LEFT)) {
            tmpX--;
        }
        if (direction.equals(Direction.LEFTTOP)) {
            tmpX--;
            tmpY--;
        }
        if (direction.equals(Direction.TOP)) {
            tmpY--;
        }
        if (direction.equals(Direction.RIGHTTOP)) {
            tmpX++;
            tmpY--;
        }
        if (direction.equals(Direction.RIGHT)) {
            tmpX++;
        }
        if (direction.equals(Direction.RIGHTBOTTOM)) {
            tmpX++;
            tmpY++;
        }
        return new Coordinates(tmpX, tmpY);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Coordinates)) {
            return false;
        }
        Coordinates coordinates = (Coordinates) object;
        return (this.getX() == coordinates.getX())
                && (this.getY() == coordinates.getY());
    }

    @Override
    public int hashCode() {
        return this.getX() ^ this.getY();
    }
}
