package com.hello01kuaixue;

public class ShowAnimal {
	public static void main(String[] args) {
		AbsTractAnimal cat = new Cat1();
		cat.name = "猫";
		cat.getDesc();
		cat.eat();
		AbsTractAnimal dog = new Dog1();
		dog.name = "狗";
		dog.getDesc();
		dog.eat();
	}
}
