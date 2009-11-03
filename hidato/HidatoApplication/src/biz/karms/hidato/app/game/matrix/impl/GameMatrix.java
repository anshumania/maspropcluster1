package biz.karms.hidato.app.game.matrix.impl;

/**
 *
 * @author
 */
public class GameMatrix extends Matrix {

    public GameMatrix(int width, int height, int[] values) {
        super(width, height, values);
    }
    
    public void setCellValue(int x,int y, int value) {
        this.getMatrix()[x][y].setValue(value);
        
    }
}
