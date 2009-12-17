package biz.karms.hidato.app.util.impl;

import biz.karms.hidato.app.game.impl.HidatoGame;
import com.masprop.cluster1.shared.controller.GameGenerator;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Coordinates;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.Matrix;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author Matus Pleva
 */
public class HidatoGenerator implements GameGenerator {

    public HidatoGenerator() {
    }

    /**
     * Generate game.
     * 
     * @param constraint informations that describe game
     * @return game instance of game with generated matrix
     */
    public Game generateGame(Constraint constraint) {
        /*int[] array = { -1, 0,  20, 21, 16, 17,
        24, -1, 0,  0,  0,  0,
        0,  28, -1, 5,  14, 0,
        0,  0,  -1,  -1, 12, 10,
        0,  -1,  36, 0,  -1, 0,
        -1, 2,  7,  8,  0,  -1,
        1,  0,  0,  0,  0,  35};*/
        if (!(constraint instanceof HidatoConstraint)) {
            throw new IllegalArgumentException("Constraint is not instance" + "of HidatoConstraint.");
        }
        HidatoConstraint hidatoConstraint = (HidatoConstraint) constraint;
        int width = hidatoConstraint.getXDimension();
        int height = hidatoConstraint.getYDimension();
        int[] values = new int[width * height];
        int nonActive = 0;
        //create matrix according constraint
        if (hidatoConstraint.getGameVariant() == GameVariantImpl.RECTANGULAR_SHAPE) {
            for (int i = 0; i < width * height - 1; i++) {
                values[i] = 0;
            }
        }
        if (hidatoConstraint.getGameVariant() == GameVariantImpl.OVAL_SHAPE) {
            //determine oval type according matrix width and height
            int min = width < height ? width : height;
            int ovalType;
            switch (min) {
                case 6:
                    ovalType = 2;
                    break;
                case 7:
                    ovalType = 2;
                    break;
                case 8:
                    ovalType = 3;
                    break;
                case 9:
                    ovalType = 3;
                    break;
                case 10:
                    ovalType = 4;
                    break;
                default:
                    ovalType = 1;
                    break;
            }
            int row = 1;
            int col = 1;
            for (int i = 0; i < width * height; i++) {
                boolean isSet = false;
                //ovalType 1,2,3,4
                if ((row == 1 && (col == 1 || col == width)) || (row == height && (col == 1 || col == width))) {
                    values[i] = -1;
                    nonActive++;
                    isSet = true;
                }
                //ovalType 2,3,4
                if ((ovalType > 1) && ((row == 1 && (col == 2 || col == width - 1)) || (row == 2 && (col == 1 || col == width)) || (row == height - 1 && (col == 1 || col == width)) || (row == height && (col == 2 || col == width - 1)))) {
                    values[i] = -1;
                    nonActive++;
                    isSet = true;
                }
                //ovalType 3,4
                if ((ovalType > 2) && ((row == 1 && (col == 3 || col == width - 2)) || (row == 3 && (col == 1 || col == width)) || (row == height - 2 && (col == 1 || col == width)) || (row == height && (col == 3 || col == width - 2)))) {
                    values[i] = -1;
                    nonActive++;
                    isSet = true;
                }
                //ovalType 4
                if ((ovalType > 3) && ((row == 1 && (col == 4 || col == width - 3)) || (row == 4 && (col == 1 || col == width)) || (row == height - 3 && (col == 1 || col == width)) || (row == height && (col == 4 || col == width - 3)) || (row == 2 && (col == 2 || col == width - 1)) || (row == height - 1 && (col == 2 || col == width - 1)))) {
                    values[i] = -1;
                    nonActive++;
                    isSet = true;
                }
                //if not set
                if (!isSet) {
                    values[i] = 0;
                }
                //update col and row variables
                if (col % width == 0) {
                    row++;
                    col = 1;
                } else {
                    col++;
                }
            }
        }
        Matrix matrix = new Matrix(width, height, values);
        Random random = new Random();
        HidatoValidator validator = new HidatoValidator();
        int randX;
        int randY;
        boolean first;

        //add min
        do {
            randX = random.nextInt(width);
            randY = random.nextInt(height);
        } while (matrix.getCell(new Coordinates(randX, randY)).getCurrentValue() != 0);
        matrix.setCellValue(new Coordinates(randX, randY), 1);

        //add max
        do {
            randX = random.nextInt(width);
            randY = random.nextInt(height);
        } while (matrix.getCell(new Coordinates(randX, randY)).getCurrentValue() != 0);
        matrix.setCellValue(new Coordinates(randX, randY), width * height - nonActive);

        //add some random numbers
        HashSet<Integer> filledValues = new HashSet<Integer>();
        int numOfcell = 3;
        int[] randX1 = new int[numOfcell];
        int[] randY1 = new int[numOfcell];
        int[] num = new int[numOfcell];
        int numberOfValidations = 0;
        //hidatoConstraint.getNoOfFilledCells()-2
        for (int i = 0; i < (width * height); i++) {
            //generate number to be filled
            for (int j = 0; j < numOfcell; j++) {
                do {
                    num[j] = random.nextInt(width * height - nonActive - 2) + 2;
                } while (filledValues.contains(num[j]));
                filledValues.add(num[j]);
            }
            for (int j = 0; j < numOfcell; j++) {
                randX1[j] = 0;
                randY1[j] = 0;
            }
            first = true;
            do {
                //generate position of number
                if (!first) {
                    numberOfValidations++;
                    for (int j = 0; j < numOfcell; j++) {
                        matrix.setCellValue(new Coordinates(randX1[j], randY1[j]), 0);
                    }
                }
                first = false;
                for (int j = 0; j < numOfcell; j++) {
                    do {
                        randX1[j] = random.nextInt(width);
                        randY1[j] = random.nextInt(height);
                    } while (matrix.getCell(new Coordinates(randX1[j], randY1[j])).getCurrentValue() != 0);
                    matrix.setCellValue(new Coordinates(randX1[j], randY1[j]), num[j]);
                }
                //game must be valid
                            System.out.println("Loop do-while");

            } while (!validator.validateGame(new HidatoGame(constraint, matrix)));
            matrix.write();
            System.out.println("------------------------------------");
        }

        matrix.write();
        System.out.println("------Validations:"+numberOfValidations+"---------------------");

        HidatoGame game = new HidatoGame(constraint, matrix);
        return game;
    }
}
