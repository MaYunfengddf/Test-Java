package com.hello01kuaixue;

public class BoxingAndUnBoxing {
	public static void main(String[] args) {
		Integer x = 100;
		Integer y = 100;
		System.out.println(x == y);
		System.out.println(x.equals(y));
		x = 200;
		y = 200;
		System.out.println(x == y);
		System.out.println(x.equals(y));
	}
}
