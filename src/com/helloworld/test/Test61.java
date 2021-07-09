package com.helloworld.test;
/*
 * 32描述了三种类型的汽车，宝马和奔驰，它们都有颜色、名称它还具有运行功能定义一个方
 */
public abstract class Test61 {
	private String name;
	protected String colour;//颜色
	private int speed;//速度

	public Test61() {
		
	}
	public Test61(String name,String colour,int speed) {
		this.name = name;
		this.colour = colour;
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}


}
