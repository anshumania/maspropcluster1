package com.masprop.cluster1.sudoku.model;

import com.masprop.cluster1.shared.model.GameVariant;
import java.lang.reflect.InvocationTargetException;
/**
 * 
 * @author Matteo De Martino
 *
 */
public enum SudokuGameVariant implements GameVariant {

      	TWENTYFIVEcrossTWENTYFIVE,
	
	SIXTEENcrossSIXTEEN,
	
	NINEcrossNINE,
	
	FOURcrossFOUR;

  public static void main(String args[])
        {
         
              Class<?> gVariant;
        GameVariant gaVariant = null;
        try {
            gVariant = Class.forName("com.masprop.cluster1.sudoku.model.SudokuGameVariant");
            System.out.println(" the class " + gVariant.getName());
            gaVariant = (GameVariant)gVariant.getMethod("valueOf", String.class).invoke(gVariant, "TWENTYFIVEcrossTWENTYFIVE");
            System.out.println(" gavariant " + gaVariant);
        } catch (IllegalAccessException ex) {
            
        } catch (IllegalArgumentException ex) {
            
        } catch (InvocationTargetException ex) {
            
        } catch (NoSuchMethodException ex) {
            
        } catch (SecurityException ex) {
            
        } catch (ClassNotFoundException ex) {
            
        }


        }

}
