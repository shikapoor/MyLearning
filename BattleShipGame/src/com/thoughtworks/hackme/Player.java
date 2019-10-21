package com.thoughtworks.hackme;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private int noOfShips;
	private List<Ship> listOfShip;
	private int playerNum ;


	public Player(int playerNum) {
		this.playerNum = playerNum;
		listOfShip = new ArrayList<Ship>();
	}
	public int getPlayerNum() {
		return playerNum;
	}
	public void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}
	public int getNoOfShips() {
		return noOfShips;
	}
	public void setNoOfShips(int noOfShips) {
		this.noOfShips = noOfShips;
	}
	public List<Ship> getListOfShip() {
		return listOfShip;
	}
	

	public boolean isValidShipCoordinate(Ship ship, BattleField battleArenaObj,  int startRowCoordinate,	 int startColCoordinate)
	{
		int shipLastXCoordinate = startRowCoordinate + ship.getHeight() - 1;
		int shipeLastYCoordinate = startColCoordinate + ship.getWidth() - 1;

		if(shipLastXCoordinate >= battleArenaObj.getColSize() || shipeLastYCoordinate >=   battleArenaObj.getRowSize())
		{
			//System.out.println("Invalid Coordinates");
			return false;
		}
		else
		{
			for(int xCoordinate = startRowCoordinate; xCoordinate <= shipLastXCoordinate; xCoordinate++)
			{
				for(int yCoordinate = startColCoordinate; yCoordinate <= shipeLastYCoordinate; yCoordinate++)
				{
					if(battleArenaObj.getBattleArena()[xCoordinate][yCoordinate]!=0)
					{
						return false;
					}
					
				}
			}
		}

		return true;
	}
	public void addShip(Ship ship, BattleField battleArenaObj,  int startRowCoordinate,	 int startColCoordinate)
	{
		int shipLastXCoordinate = startRowCoordinate + ship.getHeight() - 1;
		int shipeLastYCoordinate = startColCoordinate + ship.getWidth() - 1;
		for(int xCoordinate = startRowCoordinate; xCoordinate <= shipLastXCoordinate; xCoordinate++)
		{
			for(int yCoordinate = startColCoordinate; yCoordinate <= shipeLastYCoordinate; yCoordinate++)
			{
				if(battleArenaObj.getBattleArena()[xCoordinate][yCoordinate]==0)
				{
					battleArenaObj.getBattleArena()[xCoordinate][yCoordinate] = this.playerNum;
				}

			}
		}
		this.listOfShip.add(ship);
	}
	
	public boolean checkIfShipCollapsed(Ship ship, BattleField battleArenaObj)
	{
		int shipLastXCoordinate = ship.getStartRowCoordinate() + ship.getHeight() - 1;
		int shipeLastYCoordinate = ship.getStartColCoordinate() + ship.getWidth() - 1;
		for(int xCoordinate = ship.getStartRowCoordinate(); xCoordinate <= shipLastXCoordinate; xCoordinate++)
		{
			for(int yCoordinate = ship.getStartColCoordinate() ; yCoordinate <= shipeLastYCoordinate; yCoordinate++)
			{
				if(battleArenaObj.getBattleArena()[xCoordinate][yCoordinate]==this.playerNum)
				{
					return false;
				}

			}
		}
		
		return true;
	}
	
	


}
