package com.masprop.cluster1.shared.model;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.4DF688D0-B13E-4ADB-8310-8123FF985343]
// </editor-fold> 
/**
 * Class represents game with a current game <tt>matrix</tt> and all necessary
 * information for generating, solving, validating
 * or for handling the score of this game.
 *
 * @see Matrix
 * @see Constraint
 */
public abstract class Game {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.47014C22-E4A9-E2C4-B6DF-D761169F757C]
    // </editor-fold>
    /**
     * constraint that describes the game level,
     * number of already filled cells, shape
     */
    private Constraint constraint;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2E2EEB0D-E314-FCEC-740B-99122E6FDA5C]
    // </editor-fold>
    /**
     * game grid as a set of cells
     */
    private Matrix gameMatrix;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C261F173-6B11-46E2-D9D7-A9FA8980BB19]
    // </editor-fold> 
    /**
     * Class constructor.
     */
    public Game() {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A6A4F96A-2592-CC5B-C4A6-927AD576645B]
    // </editor-fold> 
    /**
     *
     * @return constraint that describes game
     */
    public Constraint getConstraint() {
        return constraint;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A46315FB-0618-102D-FDA9-79F890828FEF]
    // </editor-fold> 
    /**
     *
     * @param constraint describes the game
     */
    public void setConstraint(Constraint constraint) {
        this.constraint = constraint;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FF316FEC-12F8-D936-98BD-16F4A52A4484]
    // </editor-fold> 
    /**
     *
     * @return game matrix
     */
    public Matrix getGameMatrix() {
        return gameMatrix;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5E3A70C4-1B8C-FAB4-2D11-5297EC3F43FD]
    // </editor-fold> 
    /**
     *
     * @param matrix represents the game grid as a set of cells
     */
    public void setGameMatrix(Matrix matrix) {
        this.gameMatrix = matrix;
    }
}

