package com.cn.bbb;

public class Location {
	
	private int x, y;
	
	enum Direction {
		North,
		South,
		East,
		West
	}
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void move(Direction d) {
		
		switch(d) {
		
		case North:
			y--;
			break;
			
		case South:
			y++;
			break;
			
		case East:
			x++;
			break;
		
		case West:
			x--;
			break;
		
		}
		
	}

}