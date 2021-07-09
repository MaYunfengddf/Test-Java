package com._01Basics;

//饿汉模式
public class Singleton {
	String name;
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		return instance;
	}
	
	public static void main(String[] args) {
		getInstance().setName("雄安命");
		System.out.println(getInstance().getName());
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
