package com.masprop.cluster1.shared.controller;

import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameType;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


/**
 * This class handles storage of Game objects to XML files
 *
 * @author Adrien Daunou
 */
public class StorageManager {

    /**
     * Class constructor.
     */
    public StorageManager() {
    }

    /**
     * Save game to a XML file.
     * Serialize the object using XStream library
     *
     * @param game the game
     * @param file Filepath
     * @param gameType Type of Game
     */
    public void saveToFile(Game game, File file, GameType gameType) {
        XStream xs = new XStream();
        try {
            FileOutputStream fileoutputstream = new FileOutputStream(file);
            xs.toXML(game, fileoutputstream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
   
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
        
         try {
             if (gameType == GameType.SUDOKU) {
             
                 FileInputStream fileinputstream = new FileInputStream(file);
                 Game sudokugame = (Game)xs.fromXML(fileinputstream);
                 return (Game)sudokugame;
             }
             if (gameType == GameType.HIDATO) {
                 FileInputStream fileinputstream = new FileInputStream(file);
                 Game hidatogame = (Game) xs.fromXML(fileinputstream);
                 return (Game)hidatogame;
             }
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }
       return null;
     }
/*
     public static void main(String args[])
     {
         StorageManager stm = new StorageManager();
         File f = new File("C:\\test\\s1234");
         stm.loadFromFile(f, GameType.SUDOKU);
     }*/
}

