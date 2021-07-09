package com.helloworld.test;

//	创建抽象动物类
public abstract class Animal {
	private int weight;//体重
	private String colour;//颜色
	
	Animal(int weight,String colour){
		this.weight = weight;
		this.colour = colour;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}
