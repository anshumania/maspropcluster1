package biz.karms.hidato.app.util.impl;

import biz.karms.hidato.app.game.impl.HidatoGame;
import com.masprop.cluster1.shared.controller.GameGenerator;
import com.masprop.cluster1.shared.controller.GameValidator;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Direction;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.shared.model.Matrix;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 *
 * @author Michal Karm Babacek
 */
public class KarmHidatoGenerator implements GameGenerator {

    /**
     * Generating random numbers.
     */
    private Random randomGenerator;
    /**
     * Navigating in the matrix, coordinates.
     */
    private final KarmCoordinates coordinates = new KarmCoordinates();
    /**
     * Pool of available directions.
     */
    private final List<Direction> randomDirectionChooser = new ArrayList<Direction>();
    //Matrix
    private int[][] matrix;
    private int width;
    private int height;
    //Cell value in the matrix
    private int maxValue;
    private int currentValue;
    /**
     * This algorithm is (in most cases) not able to fill the whole matrix,
     * thus we set this to the 3/4 of the matrix scale or more...
     */
    private int desiredNumberOfFilledCells;
    /**
     * Next proposed move.
     */
    private Direction nextMove;
    /**
     * Rollbacks  - should be initialized according the scale of the matrix
     */
    private int howDeepRollback;
    private int maxAllowedNumberOfRollbacks;
    private int rollBackCounter;
    /**
     * We want to refresh the seed sometimes, so we have to
     * keep track of the randomGenerator.  
     */
    private int randomGeneratorCounter;
    /**
     * Keep track of the movements in order to be able to perform the rollback.
     */
    private final LinkedList<KarmCoordinates> coordinatesTracker = new LinkedList<KarmCoordinates>();
    /**
     * Statistic, monitoring.
     */
    private int iterationsCounter = 0;
    //Directions
    //Possible not blocked/blocked directions.
    private boolean freeBOTTOM;
    private boolean freeLEFT;
    private boolean freeLEFTBOTTOM;
    private boolean freeLEFTTOP;
    private boolean freeRIGHT;
    private boolean freeRIGHTBOTTOM;
    private boolean freeRIGHTTOP;
    private boolean freeTOP;
    //Logging
    private final LogManager logManager = LogManager.getLogManager();
    private final Logger logger = Logger.getLogger("biz.karms.hidato.app.util.impl.KarmHidatoGenerator");

    public Game generateGame(Constraint constraint) {

        /**
         * Setup the logger.
         */
        logManager.addLogger(logger);
        logger.setLevel(Level.OFF);
        logger.log(Level.FINEST, "Entering generateGame() method.");

        if (!(constraint instanceof HidatoConstraint)) {
            throw new IllegalArgumentException("Constraint is not instance" + "of HidatoConstraint.");
        }

        HidatoConstraint hidatoConstraint = (HidatoConstraint) constraint;

        /**
         * INITIALIZATION
         */
        randomGenerator = new Random(System.currentTimeMillis());
        randomDirectionChooser.clear();
        currentValue = 1;
        rollBackCounter = 0;
        randomGeneratorCounter = 0;
        coordinatesTracker.clear();
        iterationsCounter = 0;
        //At the start, all directions are set as free
        freeBOTTOM = true;
        freeLEFT = true;
        freeLEFTBOTTOM = true;
        freeLEFTTOP = true;
        freeRIGHT = true;
        freeRIGHTBOTTOM = true;
        freeRIGHTTOP = true;
        freeTOP = true;
        width = hidatoConstraint.getXDimension();
        height = hidatoConstraint.getYDimension();
        matrix = new int[width][height];
        maxValue = width * height;
        //How many cells we really want to have filled?
        desiredNumberOfFilledCells = maxValue - ((width + height) / 2) + 1;
        maxAllowedNumberOfRollbacks = 1500;
        howDeepRollback = (width + height) - 1;
        //System.out.println("Rollback settings: width:" + width + ", height:" + height + ", maxValue:" + maxValue + ", desiredNumberOfFilledCells:" + desiredNumberOfFilledCells + ", maxAllowedNumberOfRollbacks:" + maxAllowedNumberOfRollbacks + ", howDeepRollback:" + howDeepRollback);
        logger.log(Level.SEVERE, "Rollback settings: width:" + width + ", height:" + height + ", maxValue:" + maxValue + ", desiredNumberOfFilledCells:" + desiredNumberOfFilledCells + ", maxAllowedNumberOfRollbacks:" + maxAllowedNumberOfRollbacks + ", howDeepRollback:" + howDeepRollback);


        if (hidatoConstraint.getGameVariant() == GameVariantImpl.DONUT_SHAPE) {
            throw new UnsupportedOperationException("Sorry...");
        } else if (hidatoConstraint.getGameVariant() == GameVariantImpl.OVAL_SHAPE) {
            throw new UnsupportedOperationException("Sorry...");
        } else if (hidatoConstraint.getGameVariant() == GameVariantImpl.RECTANGULAR_SHAPE) {
            /**
             * Fill the matrix with 0, default value;
             */
            for (int iY = 0; iY < height; iY++) {
                for (int iX = 0; iX < width; iX++) {
                    matrix[iX][iY] = 0;
                }
            }
            /**
             * Lets start somewhere in the matrix
             */
            coordinates.setCurrentX(randomGenerator.nextInt(width));
            //coordinates.setCurrentX(0);

            coordinates.setCurrentY(randomGenerator.nextInt(height));
            //coordinates.setCurrentY(0);
            /**
             * And write there starting current value (should be 1)
             */
            matrix[coordinates.getCurrentX()][coordinates.getCurrentY()] = currentValue;

            //TRACKER
            coordinatesTracker.push(new KarmCoordinates(coordinates.getCurrentX(), coordinates.getCurrentY()));

            /**
             * Indicates that there is no way to continue.
             */
            boolean noWayOut = false;

            logger.log(Level.FINEST, "Everything is setUp (starting point is [" + coordinates.getCurrentX() + "][" + coordinates.getCurrentY() + "]), we are entering the loop...");

            /**
             * MAIN LOOP
             */
            while (!noWayOut && currentValue < desiredNumberOfFilledCells) {
                iterationsCounter++;
                //Check whether we have somewhere to go...
                if (!freeBOTTOM && !freeLEFT && !freeLEFTBOTTOM && !freeLEFTTOP && !freeRIGHT && !freeRIGHTBOTTOM && !freeRIGHTTOP && !freeTOP) {
                    //This is a dead end. Can we perform another rollback?
                    if (rollBackCounter < maxAllowedNumberOfRollbacks) {
                        rollback();
                        rollBackCounter++;
                    } else {
                        logger.log(Level.FINEST, "No way out and we have enough cells, so I'm breaking the loop.");
                        noWayOut = true;
                    }
                } else {

                    nextMove = nextMove();
                    coordinates.setNextCoordinates(nextMove);
                    if (!isThereAnything()) {

                        /**
                         * We cant go back wehere we've just came from...
                         */
                        if (nextMove == Direction.BOTTOM) {
                            freeTOP = false;
                        } else {
                            freeTOP = true;
                        }
                        if (nextMove == Direction.LEFT) {
                            freeRIGHT = false;
                        } else {
                            freeRIGHT = true;
                        }
                        if (nextMove == Direction.LEFTBOTTOM) {
                            freeRIGHTTOP = false;
                        } else {
                            freeRIGHTTOP = true;
                        }
                        if (nextMove == Direction.LEFTTOP) {
                            freeRIGHTBOTTOM = false;
                        } else {
                            freeRIGHTBOTTOM = true;
                        }
                        if (nextMove == Direction.RIGHT) {
                            freeLEFT = false;
                        } else {
                            freeLEFT = true;
                        }
                        if (nextMove == Direction.RIGHTBOTTOM) {
                            freeLEFTTOP = false;
                        } else {
                            freeLEFTTOP = false;
                        }
                        if (nextMove == Direction.RIGHTTOP) {
                            freeLEFTBOTTOM = false;
                        } else {
                            freeLEFTBOTTOM = true;
                        }
                        if (nextMove == Direction.TOP) {
                            freeBOTTOM = false;
                        } else {
                            freeBOTTOM = true;
                        }
                        currentValue++;
                        coordinates.setCurrentX(coordinates.getNextX());
                        coordinates.setCurrentY(coordinates.getNextY());
                        matrix[coordinates.getCurrentX()][coordinates.getCurrentY()] = currentValue;
                        //TRACKER
                        coordinatesTracker.push(new KarmCoordinates(coordinates.getCurrentX(), coordinates.getCurrentY()));
                    } else {
                        if (nextMove == Direction.BOTTOM) {
                            freeBOTTOM = false;
                        }
                        if (nextMove == Direction.LEFT) {
                            freeLEFT = false;
                        }
                        if (nextMove == Direction.LEFTBOTTOM) {
                            freeLEFTBOTTOM = false;
                        }
                        if (nextMove == Direction.LEFTTOP) {
                            freeLEFTTOP = false;
                        }
                        if (nextMove == Direction.RIGHT) {
                            freeRIGHT = false;
                        }
                        if (nextMove == Direction.RIGHTBOTTOM) {
                            freeRIGHTBOTTOM = false;
                        }
                        if (nextMove == Direction.RIGHTTOP) {
                            freeRIGHTTOP = false;
                        }
                        if (nextMove == Direction.TOP) {
                            freeTOP = false;
                        }
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Unsupported GameVariant");
        }

        logger.log(Level.FINEST, "Converting matrix to array");

        //Convert matrix to an array...
        int[] values = new int[maxValue];
        int valuesPointer = 0;
        for (int iY = 0; iY < height; iY++) {
            for (int iX = 0; iX < width; iX++) {
                if (matrix[iX][iY] == 0) {
                    values[valuesPointer] = -1;
                } else {
                    values[valuesPointer] = matrix[iX][iY];
                }
                valuesPointer++;
            }
        }

        int[] valuesWithHiddenOnes = hideSomeValues(values, hidatoConstraint);

        Game game = new HidatoGame(constraint, new Matrix(width, height, valuesWithHiddenOnes));

        GameValidator validator = new HidatoValidator();
        System.out.println("STATISTIC:Number of iterations:" + iterationsCounter);
        System.out.println("STATISTIC:Valid:" + validator.validateGame(game));

        return game;
    }

    /**
     * Check whether there is anything on the proposed nextCoordinates
     * @param direction
     * @return true in case there is a snake's body or a wall on the proposed coordinates, false otherwise
     */
    private boolean isThereAnything() {
        logger.log(Level.FINEST, "isThereAnything:    \ncoordinates.getNextX():" + coordinates.getNextX() + " width:" + width +
                "\ncoordinates.getNextY():" + coordinates.getNextY() + " height:" + height);

        //Is there a wall?
        if (coordinates.getNextX() >= width || coordinates.getNextY() >= height || coordinates.getNextX() < 0 || coordinates.getNextY() < 0) {
            return true;
        }
        //Is there a snake's body?
        if (matrix[coordinates.getNextX()][coordinates.getNextY()] != 0) {
            return true;
        }
        //Its free..
        return false;
    }

    private Direction nextMove() {
        /**
         * Lets try to get hint before we do blind shot...
         */
        Direction hint = giveMeHint();
        if (hint != null) {
            //System.out.println("HINT:" + hint.name());
            return hint;
        }
        randomDirectionChooser.clear();
        if (freeBOTTOM) {
            randomDirectionChooser.add(Direction.BOTTOM);
        }
        if (freeLEFT) {
            randomDirectionChooser.add(Direction.LEFT);
        }
        if (freeLEFTBOTTOM) {
            randomDirectionChooser.add(Direction.LEFTBOTTOM);
        }
        if (freeLEFTTOP) {
            randomDirectionChooser.add(Direction.LEFTTOP);
        }
        if (freeRIGHT) {
            randomDirectionChooser.add(Direction.RIGHT);
        }
        if (freeRIGHTBOTTOM) {
            randomDirectionChooser.add(Direction.RIGHTBOTTOM);
        }
        if (freeRIGHTTOP) {
            randomDirectionChooser.add(Direction.RIGHTTOP);
        }
        if (freeTOP) {
            randomDirectionChooser.add(Direction.TOP);
        }
        if (randomDirectionChooser.size() > 0) {
            logger.log(Level.FINEST, "NEXTMOVE: randomDirectionChooser.size():" + randomDirectionChooser.size());

            switch (getRandNumberWithinRange(0, randomDirectionChooser.size() - 1)) {
                case 0:
                    return randomDirectionChooser.get(0);
                case 1:
                    return randomDirectionChooser.get(1);
                case 2:
                    return randomDirectionChooser.get(2);
                case 3:
                    return randomDirectionChooser.get(3);
                case 4:
                    return randomDirectionChooser.get(4);
                case 5:
                    return randomDirectionChooser.get(5);
                case 6:
                    return randomDirectionChooser.get(6);
                case 7:
                    return randomDirectionChooser.get(7);
                default:
                    throw new IllegalArgumentException("Illegal direction");
            }
        } else {
            throw new IllegalArgumentException("NO WAY OUT!!!");
        }
    }

    /**
     * Random number within range, min and max included.
     * @param min
     * @param max
     * @return random number within range, min and max included
     */
    private int getRandNumberWithinRange(int min, int max) {
        //Refresh seed every n iterations
        randomGeneratorCounter++;
        if (randomGeneratorCounter == 300) {
            randomGenerator.setSeed(System.currentTimeMillis());
            randomGeneratorCounter = 0;
        }
        return randomGenerator.nextInt(max - min + 1) + min;
    }

    private void rollback() {
        logger.log(Level.SEVERE, "ROLLBACK: CALLING--------");

        //Consistency check
        if (coordinatesTracker.size() != currentValue) {
            throw new IllegalArgumentException("Something is wrong with the tracking...");
        }

        for (int i = 0; i < howDeepRollback; i++) {
            if (coordinatesTracker.size() > 1) {
                KarmCoordinates coordinate = coordinatesTracker.pop();
                coordinates.setCurrentX(coordinate.getCurrentX());
                coordinates.setCurrentY(coordinate.getCurrentY());
                logger.log(Level.SEVERE, "ROLLBACK from position: [" + coordinates.getCurrentX() + "][" + coordinates.getCurrentY() + "], howDeepRollback:" + howDeepRollback + ",currentValue:" + currentValue + " , coordinatesTracker.size():" + coordinatesTracker.size());
                matrix[coordinates.getCurrentX()][coordinates.getCurrentY()] = 0;
                coordinate = coordinatesTracker.peek();
                coordinates.setCurrentX(coordinate.getCurrentX());
                coordinates.setCurrentY(coordinate.getCurrentY());
                currentValue--;
            } else {
                KarmCoordinates coordinate = coordinatesTracker.peek();
                coordinates.setCurrentX(coordinate.getCurrentX());
                coordinates.setCurrentY(coordinate.getCurrentY());
            }
        }
        //Lets free all directions
        freeLEFT = true;
        freeLEFTBOTTOM = true;
        freeLEFTTOP = true;
        freeRIGHT = true;
        freeRIGHTBOTTOM = true;
        freeRIGHTTOP = true;
        freeTOP = true;
    }

    private Direction giveMeHint() {
        int stepsAhead = 3;
        int freeCellsAhead = 0;
        Direction[] directionsToBeExploredInOrder = null;

        switch (getRandNumberWithinRange(0, 7)) {
            case 0:
                directionsToBeExploredInOrder = new Direction[]{
                            Direction.BOTTOM, Direction.LEFT, Direction.LEFTBOTTOM, Direction.LEFTTOP,
                            Direction.RIGHT, Direction.RIGHTBOTTOM, Direction.RIGHTTOP, Direction.TOP
                        };
                break;
            case 1:
                directionsToBeExploredInOrder = new Direction[]{
                            Direction.TOP, Direction.RIGHTTOP, Direction.RIGHTBOTTOM, Direction.RIGHT,
                            Direction.LEFTTOP, Direction.LEFTBOTTOM, Direction.LEFT, Direction.BOTTOM
                        };
                break;
            case 2:
                directionsToBeExploredInOrder = new Direction[]{
                            Direction.LEFT, Direction.LEFTBOTTOM, Direction.LEFTTOP, Direction.RIGHT,
                            Direction.RIGHTTOP, Direction.TOP, Direction.BOTTOM, Direction.RIGHTBOTTOM
                        };
                break;
            case 3:
                directionsToBeExploredInOrder = new Direction[]{
                            Direction.LEFTBOTTOM, Direction.LEFTTOP, Direction.RIGHT, Direction.RIGHTBOTTOM,
                            Direction.RIGHTTOP, Direction.TOP, Direction.BOTTOM, Direction.LEFT
                        };
                break;
            case 4:
                directionsToBeExploredInOrder = new Direction[]{
                            Direction.LEFTTOP, Direction.RIGHT, Direction.RIGHTBOTTOM, Direction.RIGHTTOP,
                            Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.LEFTBOTTOM
                        };
                break;
            case 5:
                directionsToBeExploredInOrder = new Direction[]{
                            Direction.RIGHT, Direction.RIGHTBOTTOM, Direction.RIGHTTOP, Direction.TOP,
                            Direction.BOTTOM, Direction.LEFT, Direction.LEFTBOTTOM, Direction.LEFTTOP
                        };
                break;
            case 6:
                directionsToBeExploredInOrder = new Direction[]{
                            Direction.RIGHTBOTTOM, Direction.RIGHTTOP, Direction.TOP, Direction.BOTTOM,
                            Direction.LEFT, Direction.LEFTBOTTOM, Direction.LEFTTOP, Direction.RIGHT
                        };
                break;
            case 7:
                directionsToBeExploredInOrder = new Direction[]{
                            Direction.RIGHTTOP, Direction.TOP, Direction.BOTTOM, Direction.LEFT,
                            Direction.LEFTBOTTOM, Direction.LEFTTOP, Direction.RIGHT, Direction.RIGHTBOTTOM
                        };
                break;
            default:
                directionsToBeExploredInOrder = null;
        }

        int currentX = coordinates.getCurrentX();
        int currentY = coordinates.getCurrentY();

        for (Direction directionToBeExplored : directionsToBeExploredInOrder) {
            coordinates.setCurrentX(currentX);
            coordinates.setCurrentY(currentY);
            for (int i = 0; i < stepsAhead; i++) {
                coordinates.setNextCoordinates(directionToBeExplored);
                if (coordinates.getNextX() >= width || coordinates.getNextY() >= height || coordinates.getNextX() < 0 || coordinates.getNextY() < 0) {
                    break;
                }
                coordinates.setCurrentX(coordinates.getNextX());
                coordinates.setCurrentY(coordinates.getNextY());
                if (matrix[coordinates.getCurrentX()][coordinates.getCurrentY()] == 0) {
                    freeCellsAhead++;
                }
            }
            if (freeCellsAhead >= stepsAhead) {
                coordinates.setCurrentX(currentX);
                coordinates.setCurrentY(currentY);
                return directionToBeExplored;
            }
            freeCellsAhead = 0;
        }
        coordinates.setCurrentX(currentX);
        coordinates.setCurrentY(currentY);
        return null;
    }

    private int[] hideSomeValues(int[] values, HidatoConstraint constraint) {
        if (constraint.getNoOfFilledCells() != 0) {
            return values;
        } else {
            //We have to count how many non-zero values are there
            int howManyActualValues = 0;
            int howManyToDelete = 0;
            int maximumValue = 0;
            Set<Integer> indexesToBeDeleted = new HashSet<Integer>();

            //How many non-zero values do we have?
            for (int i : values) {
                if (i != -1) {
                    howManyActualValues++;
                }
                if (i > maximumValue) {
                    maximumValue = i;
                }
            }

            //Decide how many of them should be deleted
            if (constraint.getGameLevelType().equals(GameLevelType.DIFFICULT)) {
                howManyToDelete = (howManyActualValues / 6) * 4;
            } else if (constraint.getGameLevelType().equals(GameLevelType.EASY)) {
                howManyToDelete = (howManyActualValues / 6) * 1;
            } else if (constraint.getGameLevelType().equals(GameLevelType.MEDIUM)) {
                howManyToDelete = (howManyActualValues / 6) * 2;
            } else {
                throw new IllegalArgumentException("Unsupported GameLevel");
            }
            long t1 = System.currentTimeMillis();
            //Decide some random indexes to be deleted and continue until we have enough of them
            indexesToBeDeleted.clear();
            while (indexesToBeDeleted.size() < howManyToDelete) {
                int randIndex = getRandNumberWithinRange(0, values.length - 1);
                //We don't want to delete the start nor the end of the game!
                if (values[randIndex] != 1 && values[randIndex] != maximumValue && values[randIndex] != -1) {
                    indexesToBeDeleted.add(randIndex);
                }
                if (System.currentTimeMillis() - t1 > 6000) {
                    break;
                }
            }

            //Perform deleting
            for (int i = 0; i < values.length; i++) {
                if (indexesToBeDeleted.contains(i)) {
                    values[i] = 0;
                }
            }

            return values;
        }
    }
}
