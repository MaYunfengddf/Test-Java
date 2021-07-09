package com._01Basics;

//设计一个类Support (辅助英雄)继承Hero，提供一个heal(治疗)方法
//对Support的heal方法进行重载
//heal()
//heal(Hero h) //为指定的英雄加血
//heal(Hero h, int hp) //为指定的英雄加了hp的血

public class Spttort extends Hero{
	public static void main(String[] args) {
		
	}

	public void heal() {

	}
	public void heal(Hero h) {
		String name =String.valueOf(h);
	}
	public void heal(Hero h, int hp) {
		String name =String.valueOf(h);
	}
}
