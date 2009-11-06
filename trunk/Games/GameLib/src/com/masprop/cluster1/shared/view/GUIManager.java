package com.masprop.cluster1.shared.view;

import java.util.List;

import com.masprop.cluster1.shared.controller.GameManager;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.646B58CC-9C3F-ED34-36E0-E4AC8FE9BAEE]
// </editor-fold> 
/**
 *
 * @author Michal Karm Babacek
 */
public abstract class GUIManager {

    /**
     * The actual game (includes matrix and constraints)
     */
    private Game game = null;
    /**
     * Various setings.
     */
    private Constraint constraint = null;
    /**
     * GameManager - game business logic handler.
     */
    private GameManager mGameManager = null;

    /**
     * JFrame definitions, GUI elements
     */
    private GUI gui = null;

    /**
     * GUIManager handles all the GUI actions.
     * @param gui actual GUI
     */
    public GUIManager(GUI gui) {
        this.gui = gui;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DC5B8585-060E-B865-6289-7E8BCF91453F]
    // </editor-fold> 
    /**
     *
     * @param constraint
     * @return
     */
    public Game getNewGame(Constraint constraint) {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5CE99A0E-FBE3-7EFE-4ECE-51F64FC2C161]
    // </editor-fold> 
    /**
     *
     * @param game
     * @return
     */
    public boolean validateGame(Game game) {
        return true;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0EE6AC7C-C6E0-5AE1-44B2-4814D13D16D8]
    // </editor-fold> 
    /**
     *
     * @param game
     * @return
     */
    public Game solveGame(Game game) {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BDE12BF8-A08F-0A88-8C2E-A17E10BBF758]
    // </editor-fold> 
    /**
     *
     * @param game
     */
    public void saveGame(Game game) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8CE538E4-FA50-75DF-D9A5-CBA159226F51]
    // </editor-fold> 
    /**
     *
     * @return
     */
    public List<Game> loadGame() {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2E7EF1ED-5941-27D3-6876-3D95527F5F7D]
    // </editor-fold> 
    /**
     *
     */
    public void displayGame() {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E4BA316F-BA19-9386-2048-7D2765E589BE]
    // </editor-fold> 
    /**
     *
     * @return
     */
    public Constraint getConstraint() {
        return constraint;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9706EA69-A1A7-90F1-660F-D3044C756D3E]
    // </editor-fold> 
    /**
     *
     * @param val
     */
    public void setConstraint(Constraint val) {
        this.constraint = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EAF3E87C-DC7A-AC46-61B4-1C147EA82E51]
    // </editor-fold> 
    /**
     *
     * @return
     */
    public Game getGame() {
        return game;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3CADEA8E-F53F-8CF8-1AB0-9FF19ACB5167]
    // </editor-fold> 
    /**
     *
     * @param val
     */
    public void setGame(Game val) {
        this.game = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7A680B94-D457-D278-66E2-9B32ABEDEC50]
    // </editor-fold> 
    /**
     *
     * @return
     */
    public List<String> getStatistics() {
        return null;
    }

    /**
     * Exit the application.
     */
    public void exit() {

    }
}

