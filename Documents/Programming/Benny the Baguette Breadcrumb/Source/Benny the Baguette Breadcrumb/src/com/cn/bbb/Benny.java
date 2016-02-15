package com.cn.bbb;

import java.util.ArrayList;

public class Benny extends Character {
	
	private int lives;
	
	public Benny(int rlx, int rly) { //Get the random placement from the main method using the current level constraints
		pos = new Location(rlx, rly);
		inv = new ArrayList<Item>();
		name = "Benny";
		hp = 10;
		dp = 5;
		lives = 3;
	}
	
	public void move(Location.Direction d) {
		pos.move(d);
	}
	
	public int getLives() {
		return this.lives;
	}

}
