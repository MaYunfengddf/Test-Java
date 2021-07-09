package com.helloworld.test;

public class Table {
	private String name;//桌子名字
	private String shape;//桌子形状
	private String colour;//桌子颜色
	private double high;//桌子高
	private String usefulness;//桌子用处

	public  Table(String name,String shape,String colour,double high,String usefulness){
		this.name = name;
		this.shape = shape;
		this.colour = colour;
		this.high = high;
		this.usefulness = usefulness;
	}
	public String getName() {
		return this.name;
	}
	public String getShape() {
		return this.shape;
	}
	public String getColour() {
		return this.colour;
	}
	public double getHigh(
			) {
		return this.high;
	}
	public String getUsefulness() {
		return this.usefulness;
	}
}

