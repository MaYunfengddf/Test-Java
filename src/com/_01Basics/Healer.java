package com._01Basics;

public class Healer {
	private int ID;
	private String name;
	private int y;//语
	private int x;//数
	
	public String getID() {
		return "学号" + ID + "名字" + name + y + x;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}

}
