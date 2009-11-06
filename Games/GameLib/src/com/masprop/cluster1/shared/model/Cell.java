package com.masprop.cluster1.shared.model;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.2EF6D954-197B-64BE-C423-66C653AE39C6]
// </editor-fold> 
/**
 * This class represents single element of the game grid
 * with current value of cell and other settings.
 */
public class Cell {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C09F1D13-E3E0-984C-9DCF-848CD545786B]
    // </editor-fold>
    /**
     * current value of the cell
     */
    private int currentValue;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3EE78E72-050A-AA7E-977B-E44CD647254D]
    // </editor-fold>
    /**
     * indicates if user is allowed to edit this cell
     */
    private boolean editable;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D35670E4-A1EC-8695-2935-8DBE4D83B8B2]
    // </editor-fold>
    /**
     * indicates if cell is active,
     * inactive cells are used in case of
     * game shapes which are not rectangle
     */
    private boolean active;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2BCEE42B-E1F5-8765-D116-A6CE6FB9CD2C]
    // </editor-fold> 
    /**
     * Class constructor.
     */
    public Cell() {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8A38545D-EF8F-54B0-80BE-18632381DC88]
    // </editor-fold> 
    /**
     *
     * @return true if cell is active
     */
    public boolean isActive() {
        return this.active;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1D9D623D-13D8-3BA8-B9B1-5AFD683D4F29]
    // </editor-fold> 
    /**
     *
     * @param active indicates if cell is active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C134DF42-EDDB-D867-A445-E909FFB0D413]
    // </editor-fold> 
    /**
     *
     * @return current value of cell
     */
    public int getCurrentValue() {
        return this.currentValue;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.837D0613-1E2F-B8C6-5982-84F2BC06EF98]
    // </editor-fold> 
    /**
     *
     * @param currentValue value of the cell
     */
    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3197F8F8-DDB4-971B-7E67-6B9F18E601AD]
    // </editor-fold> 
    /**
     *
     * @return true if cell is editable
     */
    public boolean isEditable() {
        return this.editable;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.283E6543-A8FE-2E0C-4B63-DFE221840846]
    // </editor-fold> 
    /**
     *
     * @param editable indicates if cell is editable by user
     */
    public void setEditable(boolean editable) {
        this.editable = editable;
    }
}

