package com.masprop.cluster1.shared.model;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.4DF688D0-B13E-4ADB-8310-8123FF985343]
// </editor-fold> 
/**
 *
 * @author
 */
public abstract class Game {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.47014C22-E4A9-E2C4-B6DF-D761169F757C]
    // </editor-fold> 
    private Constraint constraint;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2E2EEB0D-E314-FCEC-740B-99122E6FDA5C]
    // </editor-fold> 
    private GameMatrix gameMatrix;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C261F173-6B11-46E2-D9D7-A9FA8980BB19]
    // </editor-fold> 
    /**
     *
     */
    public Game() {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6947495D-8E10-B454-42EA-3D4D79485FF3]
    // </editor-fold> 
    /**
     *
     */
    public void solve() {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4AD647B2-A1CB-9D8B-961A-3F2270B329B9]
    // </editor-fold> 
    /**
     *
     */
    public void validate() {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CC8EB25D-D97E-B30C-B5EE-C36F3AF7E4B1]
    // </editor-fold> 
    /**
     *
     */
    public void generateNew() {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A6A4F96A-2592-CC5B-C4A6-927AD576645B]
    // </editor-fold> 
    /**
     *
     * @return
     */
    public Constraint getConstraint() {
        return constraint;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A46315FB-0618-102D-FDA9-79F890828FEF]
    // </editor-fold> 
    /**
     *
     * @param constraint
     */
    public void setConstraint(Constraint constraint) {
        this.constraint = constraint;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FF316FEC-12F8-D936-98BD-16F4A52A4484]
    // </editor-fold> 
    /**
     *
     * @return
     */
    public GameMatrix getGameMatrix() {
        return gameMatrix;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5E3A70C4-1B8C-FAB4-2D11-5297EC3F43FD]
    // </editor-fold> 
    /**
     *
     * @param val
     */
    public void setGameMatrix(GameMatrix val) {
        this.gameMatrix = val;
    }
}

