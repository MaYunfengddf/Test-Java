package com.helloworld.test;

public class Test48 extends Test44{
	public void getName() {
		System.out.print(name+"属于狗类，且");
		super.getName();
	}
	public void getAge(int age) {
		System.out.println("今年:" +age + "岁了");
	}
	public void getHobby(String hobby) {
		System.out.println("最爱的是:" + hobby);
	}
}
