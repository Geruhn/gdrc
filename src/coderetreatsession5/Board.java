/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coderetreatsession5;

/**
 *
 * @author andy
 */
public class Board {
   Cell[][] field;
   
   public Board(int sizeX, int sizeY) {
	  this.field = new Cell[sizeX][sizeY];
	  initializeField();
   }
   
   public void nextGeneration() {
	  Cell[][] newGeneration = this.field.clone();
	  for(int x = 0; x < this.field.length; x++) {
		 newGeneration = newGenerationForLine(x, newGeneration);
	  }
   }
   
   public int getLivingCellsAt(int x, int y, int neighbours) {
	  for(int testX = x - 1; testX <= x + 1; testX++) {
		 neighbours += getLivingCellsInRow(testX, y, neighbours);
	  }
	  return neighbours;
   }
   
   public int getLivingCellsInRow(int x, int y, int neighbours) {
	  for(int testY = y - 1; testY <= y + 1; testY++) {
		 neighbours += this.field[x][y].toInt();
	  }
	  return neighbours;
   }
   
   private void initializeField() {
	  for(int x = 0; x < this.field.length; x++) {
		 initializeRow(x);
	  }
   }

   private void initializeRow(int x) {
	  for(int y = 0; y < this.field[x].length; y++) {
		 this.field[x][y] = new DeadCell();
	  }
   }

   public void revive(int x, int y) {
	  this.field[x][y] = new LivingCell();
   }

   private Cell[][] newGenerationForLine(int x, Cell[][] newGeneration) {
	  for(int y = this.field[x].length; y >= 0; y++) {
//		 newGeneration[x][y] = ;
	  }
	  return newGeneration;
   }
}
