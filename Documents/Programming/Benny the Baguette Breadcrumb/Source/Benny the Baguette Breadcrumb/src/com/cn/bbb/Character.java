package com.cn.bbb;

import java.util.ArrayList;

public abstract class Character extends GameObject {
	
	protected ArrayList<Item> inv; //Inventory
	protected int hp; //Hit points
	protected int dp; //Defense Points
	protected Weapon w;
	
	
	public int getHP() {
		return this.hp;
	}
	
	public ArrayList<Item> getInv() {
		return this.inv;
	}
	
	public int getDP() {
		return dp;
	}
	
	public Weapon getWeapon() {
		return w;
	}

}