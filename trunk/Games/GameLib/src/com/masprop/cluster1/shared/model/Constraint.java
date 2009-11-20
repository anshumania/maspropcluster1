package com.masprop.cluster1.shared.model;

/**
 * Class handles game parameters such as difficulty level,
 * number of cells already filled and game variant.
 *
 * @author Matus Pleva
 */
public class Constraint {

    /**
     * Game type. Actually whether it is a Sudoku or an Hidato game.
     */
    private GameType gameType;
    /**
     * Game difficulty level.
     */
    private GameLevelType gameLevelType;
    /**
     * Game variant keeps information about board shape and size
     */
    private GameVariant gameVariant;
    /**
     * Number of cells already filled.
     */
    private int noOfFilledCells;

    /**
     * Class constructor.
     *
     * @param gameLevelType difficulty level
     * @param gameVariant information about board shape and size
     * @param noOfFilledCells number of cells already filled
     */
    public Constraint(GameLevelType gameLevelType, GameVariant gameVariant,
            int noOfFilledCells, GameType gameType) {
        this.gameLevelType = gameLevelType;
        this.gameVariant = gameVariant;
        this.noOfFilledCells = noOfFilledCells;
        this.gameType = gameType;
    }

    /**
     * An empty constructor for those, who doesn't know all the attributes
     * by the time
     * of creating the Constraint object.
     */
    public Constraint() {
    }

    /**
     * @return gameLevel level of the game
     */
    public GameLevelType getGameLevelType() {
        return this.gameLevelType;
    }

    /**
     * @param gameLevelType represents difficulty level of game
     */
    public void setGameLevelType(GameLevelType gameLevelType) {
        this.gameLevelType = gameLevelType;
    }

    /**
     * @return gameVariant information about board shape and size
     */
    public GameVariant getGameVariant() {
        return this.gameVariant;
    }

    /**
     * @param gameVariant information about board shape and size
     */
    public void setGameVariant(GameVariant gameVariant) {
        this.gameVariant = gameVariant;
    }

    /**
     * @return noOfFilledCells number of cells already filled
     */
    public int getNoOfFilledCells() {
        return noOfFilledCells;
    }

    /**
     * @param noOfFilledCells number of cells already filled
     */
    public void setNoOfFilledCells(int noOfFilledCells) {
        this.noOfFilledCells = noOfFilledCells;
    }

    /**
     * @return type of the game
     */
    public GameType getGameType() {
        return gameType;
    }

    /**
     * @param gameType type of the game
     */
    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Constraint)) {
            return false;
        }
        Constraint constraint = (Constraint) object;
        return (this.getGameType() == null
                ? constraint.getGameType() == null
                : this.getGameType().equals(constraint.getGameType()))
                    && (this.getGameLevelType() == null
                ? constraint.getGameLevelType() == null
                : this.getGameLevelType().equals(constraint.getGameLevelType()))
                    && (this.getGameVariant() == null
                ? constraint.getGameVariant() == null
                : this.getGameVariant().equals(constraint.getGameVariant()))
                    && this.getNoOfFilledCells() == constraint.getNoOfFilledCells();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.getGameType() == null 
                ? 0
                : this.getGameType().hashCode());
        hash = 31 * hash + (this.getGameLevelType() == null
                ? 0
                : this.getGameLevelType().hashCode());
        hash = 31 * hash + (this.getGameVariant() == null 
                ? 0
                : this.getGameVariant().hashCode());
        hash = 31 * hash + this.getNoOfFilledCells();
        return hash;
    }
}
