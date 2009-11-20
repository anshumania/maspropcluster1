package com.masprop.cluster1.shared.controller;


import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameType;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.logging.Level;
import java.util.logging.Logger;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.878F01D5-7373-FE1B-BF53-79E3DCE4A0A7]
// </editor-fold> 
/**
 * This class handles storage of Game objects to XML files
 *
 * @author Adrien Daunou
 */
public class StorageManager {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A2118DC1-83B3-370A-CEA1-FD9A7FCCB486]
    // </editor-fold> 
    /**
     * Class constructor.
     */
    public StorageManager() {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.49ACEC12-CEF8-0A0E-0C32-26CCB71B08C1]
    // </editor-fold>
    /**
     * Save game to a XML file.
     * Serialize the object using XStream library
     * 
     * @param game the game
     * @param file Filepath
     * @param gameType Type of Game
     */
    public void saveToFile(Game game, File file, GameType gameType) {
        // Game gameTest = ApplicationController.getUniqueInstance().getGameManager().getNewGame(null);
        XStream xs = new XStream();
        try {
            FileOutputStream fileoutputstream = new FileOutputStream(file);
            xs.toXML(game, fileoutputstream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C2D22A47-457D-70F9-F7A6-49A2F1FAB7C9]
    // </editor-fold>
    /**
     * Load game from a XML file.
     * Unserialize the object using XStream library
     *
     * @param game the game
     * @param file Filepath
     * @param gameType Type of Game
     */
     public Game loadFromFile(File file, GameType gameType) {
        XStream xs = new XStream(new DomDriver());
         Class game = null; //= new Game();
         try {
             if (gameType == GameType.SUDOKU) {
                 game = Class.forName("com.masprop.cluster1.sudoku.model.SudokuGame");
                 FileInputStream fileinputstream = new FileInputStream(file);
                 Game y = (Game)game.cast(xs.fromXML(fileinputstream, game));
                 return y;
             }
             if (gameType == GameType.HIDATO) {
                 game = Class.forName("biz.karms.hidato.app.game.impl.HidatoGame");
                 FileInputStream fileinputstream = new FileInputStream(file);
                 Object y = (xs.fromXML(fileinputstream, game));
                 Game z = (Game)game.cast(xs.fromXML(fileinputstream, game));
                 return z;
             }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(StorageManager.class.getName()).log(Level.SEVERE, null, ex);
         }catch (FileNotFoundException e) {
             e.printStackTrace();
         }
       return null;

    }

}

