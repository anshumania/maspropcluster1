package com.masprop.cluster1.shared.controller;

import com.masprop.cluster1.shared.model.GameType;
import com.masprop.cluster1.shared.view.GUIManager;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.9D1AFF78-BC75-2E5A-5E47-7D10B2FFAA03]
// </editor-fold> 
public class ApplicationController {

	
	
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.05C4EBBA-3261-0712-221C-8BDD1F4181B3]
    // </editor-fold> 
    private static ApplicationController uniqueInstance;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EBEDD426-2108-9E5A-BA72-C7BD32B42E42]
    // </editor-fold> 
    private GameManager gameManager;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.37A2FE41-3628-426D-E501-99CBDF3AEEBB]
    // </editor-fold> 
    private GameType gameToPlay;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.775789EA-C180-630C-E34C-566606AA2FE0]
    // </editor-fold> 
    private GUIManager guiManager;

     // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D4E4A3CB-93C2-52A8-1B01-ABFEA5A2C50D]
    // </editor-fold> 
    public static ApplicationController getInstance (GameType gameType) {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4DBB5166-AC78-D23E-C88E-D1D954EA3C84]
    // </editor-fold> 
    public GameManager getGameManager () {
        return gameManager;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B741481D-B38A-98F4-7281-4ACD4E8C3A62]
    // </editor-fold> 
    public void setGameManager (GameManager val) {
        this.gameManager = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2473F04C-B383-8D5F-FD8C-181D000E661B]
    // </editor-fold> 
    public GameType getGameToPlay () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9D010244-799C-08BA-567D-B25AA0CC859E]
    // </editor-fold> 
    public GUIManager getGuiManager () {
        return guiManager;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2995C7AF-ADD3-D61C-2609-C0007A9E46A9]
    // </editor-fold> 
    protected void generateGUI () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FB19771D-6487-CCCD-AA58-123F0B375882]
    // </editor-fold> 
    protected void initalizeComponents () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2E00A703-8FBE-EA88-B128-861827C9F51C]
    // </editor-fold> 
    void setGuiManager (GUIManager l) {
        this.guiManager = l;
    }



}

