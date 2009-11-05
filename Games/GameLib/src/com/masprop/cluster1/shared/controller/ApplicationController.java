package com.masprop.cluster1.shared.controller;

import com.masprop.cluster1.shared.model.GameType;
import com.masprop.cluster1.shared.view.GUIManager;


// TODO: Auto-generated Javadoc
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.9D1AFF78-BC75-2E5A-5E47-7D10B2FFAA03]
// </editor-fold> 
/**
 * This class provides the skeleton implementation for any 
 * <tt>Game</tt> Application Controller.
 * <p>It provides a singleton handle reference to itself based on a 
 * <tt>GameType</tt> for any client application to get access to the 
 * different controllers for a <tt>Game</tt></p>
 * <p>It is composed of a <tt>GUIManager</tt> and a <tt>GameManager</tt>
 * and it has an application level scope. It serves as the necessary
 * delegation layer between the <tt>GUIManager</tt> and <tt>GameManager</tt></p>
 * 
 * @see GUIManager
 * @see GameManager
 * @see Game
 * @see GameType
 * @since 1.0
 * @version 1.0
 */
public abstract class ApplicationController {

	
	
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.05C4EBBA-3261-0712-221C-8BDD1F4181B3]
    // </editor-fold> 
    /** The singleton handler for the Game Application. 
     * 
     */
    private static ApplicationController uniqueInstance;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EBEDD426-2108-9E5A-BA72-C7BD32B42E42]
    // </editor-fold> 
    /** The reference to the GameManager. 
     * */
    private GameManager gameManager;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.37A2FE41-3628-426D-E501-99CBDF3AEEBB]
    // </editor-fold> 
    /** The GameType for which the singleton instance would be returned.
     * To be read from a system file, system property or constant file.
     *  */
    private GameType gameToPlay;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.775789EA-C180-630C-E34C-566606AA2FE0]
    // </editor-fold> 
    /** The reference to the GUIManager for the Game Application. */
    private GUIManager guiManager;

     // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D4E4A3CB-93C2-52A8-1B01-ABFEA5A2C50D]
    // </editor-fold> 
    /**
      * Gets the single instance of ApplicationController.
      * 
      * @param gameType the game type
      * 
      * @return single instance of ApplicationController
      */
     public static ApplicationController getInstance (GameType gameType) {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4DBB5166-AC78-D23E-C88E-D1D954EA3C84]
    // </editor-fold> 
    /**
     * Gets the game manager.
     * 
     * @return the game manager
     */
    public GameManager getGameManager () {
        return gameManager;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B741481D-B38A-98F4-7281-4ACD4E8C3A62]
    // </editor-fold> 
    /**
     * Sets the game manager.
     * 
     * @param val the new game manager
     */
    public void setGameManager (GameManager val) {
        this.gameManager = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2473F04C-B383-8D5F-FD8C-181D000E661B]
    // </editor-fold> 
    /**
     * Gets the game to play.
     * 
     * @return the game to play
     */
    public GameType getGameToPlay () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9D010244-799C-08BA-567D-B25AA0CC859E]
    // </editor-fold> 
    /**
     * Gets the gui manager.
     * 
     * @return the gui manager
     */
    public GUIManager getGuiManager () {
        return guiManager;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2995C7AF-ADD3-D61C-2609-C0007A9E46A9]
    // </editor-fold> 
    /**
     * This is an internal delegation operation which signal the GUIManager
     * to create the necessary components for the view.
     */
    protected void generateGUI () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FB19771D-6487-CCCD-AA58-123F0B375882]
    // </editor-fold> 
    /**
     * This is an internal delegation operation to initialize all the components
     * related to start a Game Application.
     */
    protected void initalizeComponents () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2E00A703-8FBE-EA88-B128-861827C9F51C]
    // </editor-fold> 
    /**
     * Sets the gui manager.
     * 
     * @param guiManager the new gui manager
     */
    void setGuiManager (GUIManager guiManager) {
        this.guiManager = guiManager;
    }



}

