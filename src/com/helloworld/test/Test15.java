package com.helloworld.test;

public class Test15 {
	public int number(int x) {
		if(x <= 2) {
			return 1;
		}
		return number(x - 1) + number(x - 2);
	}
	public static void main(String[] args) {
		Test15 test = new Test15();
		int x = test.number(10);
		System.out.println(x);
	}
}
