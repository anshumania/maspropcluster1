package biz.karms.hidato.app.util.impl;

import com.masprop.cluster1.shared.model.Direction;

/**
 *
 * @author Michal Karm Babacek
 */
public class KarmCoordinates {

    /**
     * Horizontal axis.
     */
    private int currentX = 0;
    private int nextX = 0;
    /**
     * Vertical axis.
     */
    private int currentY = 0;
    private int nextY = 0;

    public KarmCoordinates(int currentX, int currentY) {
        this.currentX = currentX;
        this.currentY = currentY;
    }

    public KarmCoordinates() {
    }

    public void setNextCoordinates(Direction direction) {
        nextX = currentX;
        nextY = currentY;
        if (direction.equals(Direction.BOTTOM)) {
            nextY++;
        }
        if (direction.equals(Direction.LEFTBOTTOM)) {
            nextX--;
            nextY++;
        }
        if (direction.equals(Direction.LEFT)) {
            nextX--;
        }
        if (direction.equals(Direction.LEFTTOP)) {
            nextX--;
            nextY--;
        }
        if (direction.equals(Direction.TOP)) {
            nextY--;
        }
        if (direction.equals(Direction.RIGHTTOP)) {
            nextX++;
            nextY--;
        }
        if (direction.equals(Direction.RIGHT)) {
            nextX++;
        }
        if (direction.equals(Direction.RIGHTBOTTOM)) {
            nextX++;
            nextY++;
        }
    }

    public int getCurrentX() {
        return currentX;
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }

    public int getNextX() {
        return nextX;
    }

    public void setNextX(int nextX) {
        this.nextX = nextX;
    }

    public int getNextY() {
        return nextY;
    }

    public void setNextY(int nextY) {
        this.nextY = nextY;
    }
}
