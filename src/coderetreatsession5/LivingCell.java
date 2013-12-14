/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coderetreatsession5;

/**
 *
 * @author andy
 */
public class LivingCell extends Cell {
   @Override
   public int toInt() {
	  return 1;
   }

   @Override
   public boolean willBeAlive(int livingCells) {
	  return livingCells == 3 || livingCells == 4;
   }
   
}
