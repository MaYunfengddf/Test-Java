package com.helloworld.test;

public class Test62 extends Test61{
	private String model;//型号
	private double conductor;//长
	
	public Test62() {
		
	}
	public Test62(String model,double conductor) {
		this.model = model;
		this.conductor = conductor;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getConductor() {
		return conductor;
	}
	public void setConductor(double conductor) {
		this.conductor = conductor;
	}
	public String number() {
		return "车名:" + getName() + "\n颜色:" + getColour() + "\n速度:" + getSpeed() + "\n型号:"+ getModel() + "\n车长:" + getConductor() + "米";
	}
		
}
