package com._01Basics;

public class TestSingleton {
	public static void main(String[] args) {
		Singleton1 s = Singleton1.getSingleton1();
		Singleton1 x = Singleton1.getSingleton1();
		System.out.println(s==x);
		System.out.println(s.equals(x));
	}
}