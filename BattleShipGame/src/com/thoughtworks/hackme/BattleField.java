package com.thoughtworks.hackme;

public class BattleField {
	
	private int colSize;
	private int rowSize;
	private int[][] battleArena;
	
	

	public BattleField(int colSize, int rowSize) {
		
		this.colSize = colSize;
		this.rowSize = rowSize;
		this.battleArena = new int[this.rowSize][this.colSize];
	}

	public int getColSize() {
		return colSize;
	}

	public void setColSize(int colSize) {
		this.colSize = colSize;
	}

	public int getRowSize() {
		return rowSize;
	}

	public void setRowSize(int rowSize) {
		this.rowSize = rowSize;
	}

	public int[][] getBattleArena() {
		return battleArena;
	}

	public void setBattleArena(int[][] battleArena) {
		this.battleArena = battleArena;
	}

	public void createBattleField() {

		for(int rowIndx = 0 ; rowIndx < rowSize; rowIndx++)
		{
			for(int colIndx = 0; colIndx < colSize;  colIndx++ )
			{
				battleArena[rowIndx][colIndx] = 0;
			}
		}
		
	}
	
	public void printBattleArea()
	{
		for(int rowIndx = 0 ; rowIndx < this.rowSize; rowIndx++)
		{
			for(int colIndx = 0; colIndx < this.colSize;  colIndx++ )
			{
				System.out.print(battleArena[rowIndx][colIndx] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	

}
