package com.hello01kuaixue;

public abstract class AbsTractAnimal {
	public String name;
	public String color;
	
	public abstract void eat();
	
	public void getDesc() {
		System.out.println("这是动物类:" + name);
	}
}
