/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import coderetreatsession5.Board;
import coderetreatsession5.DeadCell;
import coderetreatsession5.LivingCell;
import static junit.framework.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author andy
 */
public class CRSession5Test {
   Board board;
   
   @Before
   public void setup() {
	  this.board = new Board(3, 3);
	  initializeLivingField();
   }
   
   @Test
   public void testIsCellAlive() {
	  assertTrue(new LivingCell().isAlive());
   }
   
   @Test
   public void testIsCellDead() {
	  assertFalse(new DeadCell().isAlive());
   }
   
   @Test
   public void testIfThreeNeighboursAreAlive() {
	  assertEquals(3, this.board.getLivingCellsAt(1,1,0));
   }

   private void initializeLivingField() {
	  this.board.revive(1,0);
	  this.board.revive(2,0);
	  this.board.revive(2,1);
   }
}
