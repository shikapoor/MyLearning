package com.thoughtworks.hackme;

public class Ship {


	private int width;
	private int height;
	private int startRowCoordinate;
	private int startColCoordinate;
	private boolean shipColapsed;
	
	


	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Ship(int width, int height) {
		
		this.width = width;
		this.height = height;
		this.shipColapsed = false;
		
	}

	public int getStartRowCoordinate() {
		return startRowCoordinate;
	}

	public int getStartColCoordinate() {
		return startColCoordinate;
	}

	public void setStartRowCoordinate(int startRowCoordinate) {
		this.startRowCoordinate = startRowCoordinate;
	}

	public void setStartColCoordinate(int startColCoordinate) {
		this.startColCoordinate = startColCoordinate;
	}

}
