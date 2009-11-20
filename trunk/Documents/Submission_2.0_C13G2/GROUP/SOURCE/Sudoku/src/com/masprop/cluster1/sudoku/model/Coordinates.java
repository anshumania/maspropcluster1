package com.masprop.cluster1.sudoku.model;

/**
 * Not sure if this class is required as of now.
 * But we use it because of our GUI dependence
 * and also because our algorithm is not yet complete.
 * 
 * @author Andrea Gritti
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
        return (diffX>=-1) && (diffX<=1) && (diffY>=-1) && (diffY<=1);
    }

//    /**
//     * Set new coordinates according direction of the movement.
//     *
//     * @param direction direction of the movement
//     */
//    public void setCoordinates(Direction direction) {
//        if (direction.equals(Direction.BOTTOM)) {
//            this.setY(this.getY()-1);
//        }
//        if (direction.equals(Direction.BOTTOM.LEFTBOTTOM)) {
//            this.setX(this.getX()-1);
//            this.setY(this.getY()-1);
//        }
//        if (direction.equals(Direction.LEFT)) {
//            this.setX(this.getX()-1);
//        }
//        if (direction.equals(Direction.LEFTTOP)) {
//            this.setX(this.getX()-1);
//            this.setY(this.getY()+1);
//        }
//        if (direction.equals(Direction.TOP)) {
//            this.setY(this.getY()+1);
//        }
//        if (direction.equals(Direction.RIGHTTOP)) {
//            this.setX(this.getX()+1);
//            this.setY(this.getY()+1);
//        }
//        if (direction.equals(Direction.RIGHT)) {
//            this.setX(this.getX()+1);
//        }
//        if (direction.equals(Direction.RIGHTBOTTOM)) {
//            this.setX(this.getX()+1);
//            this.setY(this.getY()-1);
//        }
//    }

    @Override
    public String toString() {
        return this.getX() + "," + this.getY();
    }

    @Override
    public boolean equals(Object object) {
        if ( this == object ) return true;
        if ( !(object instanceof Coordinates) ) return false;
        Coordinates coordinates = (Coordinates) object;
        return (this.getX()==coordinates.getX()) && (this.getY()==coordinates.getY());
    }

    @Override
    public int hashCode() {
        return this.getX()^this.getY();
    }
}
