/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coderetreatsession5;

/**
 *
 * @author andy
 */
public class DeadCell extends Cell {

   @Override
   public int toInt() {
	  return 0;
   }

   @Override
   public boolean willBeAlive(int livingCells) {
	  return livingCells == 4;
   }
   
}
