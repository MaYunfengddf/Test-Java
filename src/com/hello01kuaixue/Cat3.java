package com.hello01kuaixue;
public class Cat3 {
	
	@Deprecated
	
	public void swim() {
		System.out.println("猫在游泳");
	}
	
	public void run() {
		System.out.println("猫在跑");
	}
	public static void main(String[] args) {
		Cat3 cat = new Cat3();
		cat.swim();
		cat.run();
	}
}
