package com.masprop.cluster1.shared.controller;
import java.util.List;

import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.688451B6-74F9-0A7F-1CE3-18B04D11802E]
// </editor-fold> 
public interface GameManager {

	
	// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.61AA2A5F-7539-5F4E-0562-3E4A1356EC6A]
    // </editor-fold> 
    public GameGenerator getGameGenerator ();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EFE06DD9-22B7-08F4-A074-278B691222C3]
    // </editor-fold> 
    public GameSolver getGameSolver ();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.49E36902-A6FD-F6E4-D8ED-83E0F083DB57]
    // </editor-fold> 
    public GameValidator getGameValidator ();
    
	public StorageManager getStrorageManager() ;
	
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.332EE15D-E0F3-E8CB-C86F-E9AC53717622]
    // </editor-fold> 
    public Game getNewGame (Constraint constraint);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.28E1D2EC-9E15-5BD4-59BE-78D8E79D8A6B]
    // </editor-fold> 
    public boolean validateGame (Game game);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.223FCFE8-721B-5A88-5B05-E43BDB0EE4DA]
    // </editor-fold> 
    public Game solveGame (Game game);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.67372566-AF1D-86C6-37A8-B83133198391]
    // </editor-fold> 
    public void saveGame (Game game);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CC2D028C-69E2-ACA8-A490-CE51B71F4BFE]
    // </editor-fold> 
    public List<Game> loadGame ();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.033EE7D3-E0B9-968F-4D33-D5FD336430FB]
    // </editor-fold> 
    public List<String> getStatistics ();

}

