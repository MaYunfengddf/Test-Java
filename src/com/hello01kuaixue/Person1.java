package com.hello01kuaixue;

class Person1 {
	private String name = "Jack";
	private int age = 10;
	public Person1() {
		
	}
	public Person1(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void say() {
		System.out.println("姓名:" + name + ",年龄:" + age);
	}
	public void say(String message) {
		System.out.println("String" + message);
	}
	public void run(int age) {
		System.out.println("Running");
	}
	public void swim() {
		System.out.println("Swimming");
	}
	
	
}
