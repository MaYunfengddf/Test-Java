package com.hello01kuaixue;

public class Cat2 implements CatService,AnimalService {
	public void sleep() {
		System.out.println("猫咪睡觉");
	}
	public void playBall() {
		System.out.println("猫咪玩球");
	}
	public static void main(String[] args) {
		Cat2 cat = new Cat2();
		cat.sleep();
		cat.playBall();
	}
}
