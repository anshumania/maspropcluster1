package com.masprop.cluster1.shared.model;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.EF66D606-4125-03C0-B0FD-0FF040AD5616]
// </editor-fold> 
/**
 *
 * @author
 */
public interface Matrix {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.912EB343-E420-AC5F-DF70-FA177A255E50]
    // </editor-fold> 
    /**
     *
     * @param value
     */
    public void putValueInCell(int value);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.67B18909-72F0-4056-A28E-1BCF2768F854]
    // </editor-fold> 
    /**
     *
     * @param cell
     * @return
     */
    public int getValueInCell(Cell cell);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4DCED846-B2AB-2E4C-86DB-B77A9A1F1BD1]
    // </editor-fold> 
    /**
     *
     */
    public void getCells();
}
