package com.thoughtworks.hackme;

import java.util.Scanner;
import java.util.Random;

public class GameDriver {
	static Random random = new Random();
	static Scanner inputScanner = new Scanner(System.in);
	public static void main(String args[])
	{
		int shipCount;
		int battleAreaRowSize;
		int battleAreaColSize;
		int noOfShipPlaced = 0;
		Player player1 = null;
		Player player2 = null;
		int shipRowSize = 0;
		int shipColSize = 0;
		String shipSize = null;
		int startColCoordinate = 0;
		int startRowCoordinate = 0;
		Random random = new Random();


		System.out.println("Enter size of the battle area M x N");
		String battleSize = inputScanner.nextLine();
		battleAreaRowSize = Integer.parseInt(battleSize.split(" ")[0]);
		battleAreaColSize = Integer.parseInt(battleSize.split(" ")[1]);

		BattleField battleArena = new BattleField(battleAreaRowSize, battleAreaColSize);
		battleArena.createBattleField();

		//battleArena.printBattleArea();

		System.out.println("Enter number of ships ");

		shipCount = Integer.parseInt(inputScanner.nextLine().trim());


		player1 = new Player(1);//new Player(getRandomNum(0));
		player2 =new Player(2); //new Player(getRandomNum(player1.getPlayerNum()));

		while(noOfShipPlaced < shipCount )
		{
			System.out.println("Enter ship size ");
			shipSize = inputScanner.nextLine();
			shipRowSize = Integer.parseInt(shipSize.split(" ")[0]);
			shipColSize = Integer.parseInt(shipSize.split(" ")[1]);

			Ship ship = new Ship(shipColSize, shipRowSize);


			addShip(player1, ship, battleArena, battleAreaRowSize, battleAreaColSize);

			addShip(player2, ship, battleArena, battleAreaRowSize, battleAreaColSize);
			noOfShipPlaced++;

		}
		battleArena.printBattleArea();
		
		System.out.println("Let the game begin..");
		boolean player1Hits = true;
		boolean player2Hits = false;
		
		while(player1.getListOfShip().size() != 0 && player2.getListOfShip().size() != 0)
		{
			if(player1Hits)
			{
				System.out.println("Enter target for player"+player1.getPlayerNum());
				String target = inputScanner.nextLine();
				int rowTraget = Integer.parseInt(target.split(" ")[0]);
				int colTarget = Integer.parseInt(target.split(" ")[1]);
				if(battleArena.getBattleArena()[rowTraget][colTarget] == player2.getPlayerNum() )
				{
					battleArena.getBattleArena()[rowTraget][colTarget] = 0;
					checkIfAnyShipCollapsed(player2, battleArena);
					continue;
				}
				else
				{
					player1Hits = false;
					player2Hits = true;
					continue;
				}
			}
			if(player2Hits)
			{
				System.out.println("Enter target for player"+player2.getPlayerNum());
				String target = inputScanner.nextLine();
				int rowTraget = Integer.parseInt(target.split(" ")[0]);
				int colTarget = Integer.parseInt(target.split(" ")[1]);
				if(battleArena.getBattleArena()[rowTraget][colTarget] == player1.getPlayerNum() )
				{
					battleArena.getBattleArena()[rowTraget][colTarget] = 0;
					checkIfAnyShipCollapsed(player1, battleArena);
					continue;
				}
				else
				{
					player2Hits = false;
					player1Hits = true;
					continue;
				}
			}
		}
		
		if(player1.getListOfShip().size() == 0)
			System.out.println("PLayer2 wins");
		else
			System.out.println("Player1 wins");


	}

	public static void addShip(Player player , Ship ship, BattleField battleArena, int battleAreaRowSize, int battleAreaColSize)
	{
		System.out.println("Enter Ship start Coordinate for Player"+player.getPlayerNum());
		String shipStartCoordinate = inputScanner.nextLine();
		int startRowCoordinate = Integer.parseInt(shipStartCoordinate.split(" ")[0]);
		int startColCoordinate = Integer.parseInt(shipStartCoordinate.split(" ")[1]);
		while(!player.isValidShipCoordinate(ship, battleArena, startRowCoordinate, startColCoordinate))
		{
			System.out.println("Inavlid Coordinates.. Please Enter Ship start Coordinate for Player"+player.getPlayerNum());
			shipStartCoordinate = inputScanner.nextLine();
			startRowCoordinate = Integer.parseInt(shipStartCoordinate.split(" ")[0]);
			startColCoordinate = Integer.parseInt(shipStartCoordinate.split(" ")[1]);
		}
		ship.setStartRowCoordinate(startRowCoordinate);
		ship.setStartColCoordinate(startColCoordinate);
		
		player.addShip(ship, battleArena, startRowCoordinate, startColCoordinate);
	}

	public static int getRandomNum(int valueAlreadyExist)
	{
		int value = random.nextInt(10);
		while(value==0 || value == valueAlreadyExist)
		{
			value = random.nextInt(10);
		}
		return value;
	}
	
	public static void checkIfAnyShipCollapsed(Player playerObj,BattleField battleArena )
	{
		Ship shipToBeRemoved = null;
		for(Ship ship : playerObj.getListOfShip())
		{
			if(playerObj.checkIfShipCollapsed(ship, battleArena))
			{
				shipToBeRemoved = ship;
				break;
			}
		}
		if(shipToBeRemoved != null)
			playerObj.getListOfShip().remove(shipToBeRemoved);
	}



}
