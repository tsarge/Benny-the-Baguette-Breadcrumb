package com.cn.bbb;

public abstract class GameObject {
	
	protected String name;
	protected Location pos;
	
	public String getName() {
		return name;
	}
	
	public Location getPos() {
		return this.pos;
	}

}
