package com.masprop.cluster1.shared.controller;


import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import com.thoughtworks.xstream.*;
import com.thoughtworks.xstream.io.xml.DomDriver;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.878F01D5-7373-FE1B-BF53-79E3DCE4A0A7]
// </editor-fold> 
/**
 * This class handles storage of Game objects to XML files
 * @author
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
     *
     * @param game the game
     */
    public void saveToFile(Game game, File file, GameType gameType) {
        // Serialize the object using XStream library
        XStream xs = new XStream();
        // Write to a XML file
        // TODO: Replace "file.xml" by a variable made of Game's attributs
        try {
            FileOutputStream fileoutputstream = new FileOutputStream("file.xml");
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
     */
     public Game loadFromFile(File file, GameType gameType) {
          //XStream xs = new XStream(new DomDriver());
          //Game game = new Game();
          //Open XML File and Deserialize from XML to a game object
          try {
              FileInputStream fileinputstream = new FileInputStream(file);
              //game = (Game)xs.fromXML(fileinputstream, game);
              //return game;
          } catch (FileNotFoundException e) {
              e.printStackTrace();
          }
          return null;
    }

}

