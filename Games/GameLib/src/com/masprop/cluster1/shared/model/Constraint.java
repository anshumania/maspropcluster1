package com.masprop.cluster1.shared.model;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.966D659F-2024-894A-C4F5-F584C3018F7D]
// </editor-fold> 
/**
 * 
 * @author
 * this class handle some game parameters such as level of difficulty, 
 * number of cells free/busy, game variant
 */
public class Constraint {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5837A26D-42DC-5707-A581-F86367A1E485]
    // </editor-fold> 
    private GameLevelType gameLevel;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.03DAA2BE-9B02-D402-4BF0-0923218BFF11]
    // </editor-fold> 
    private int noOfCellsFilled;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E246BBC1-17D8-54B5-7E3D-27C0E96524D5]
    // </editor-fold> 
    private GameVariant gameVariant;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A29CCD33-D1E8-1471-D44E-E7A5FB049121]
    // </editor-fold> 
    /**
     *
     */
    public Constraint() {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D6CEE28C-64D9-6EC6-BFEA-ADABE1E6DBE8]
    // </editor-fold> 
    /**
     *
     * @return
	 * this return the game level value
     */
    public GameLevelType getGameLevel() {
        return gameLevel;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.78239763-192F-6250-2870-A4E8C6228247]
    // </editor-fold> 
    /**
     *
     * @param val
     */
    public void setGameLevel(GameLevelType val) {
        this.gameLevel = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FA24E11D-B5C6-22D7-B5B1-73A793F3DE72]
    // </editor-fold> 
    /**
     *
     * @return
	 * this return the game variant value
     */
    public GameVariant getGameVariant() {
        return gameVariant;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CC569EF5-BF1A-AB44-711A-B889734666CC]
    // </editor-fold> 
    /**
     *
     * @param val
     */
    public void setGameVariant(GameVariant val) {
        this.gameVariant = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F49F66F2-7F54-D44F-C55E-9F4B581EE8D4]
    // </editor-fold> 
    /**
     *
     * @return
	 * this return the total amount of free cells
     */
    public int getNoOfCellsFilled() {
        return noOfCellsFilled;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B3BA2907-1794-78EB-2AC1-56CED5D03FCC]
    // </editor-fold> 
    /**
     *
     * @param val
     */
    public void setNoOfCellsFilled(int val) {
        this.noOfCellsFilled = val;
    }
}

