/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coderetreatsession5;

/**
 *
 * @author andy
 */
public abstract class Cell {
   public Cell() {
	  
   }
   
   public boolean isAlive() {
	  return this instanceof LivingCell;
   }
   
   public abstract int toInt();
   
   public abstract boolean willBeAlive(int livingCells);
}
