package com.helloworld.test;

public class Test31 {
	public static void main(String[] args) {
		System.out.println(Test31.number(5));
		System.out.println(Test31.num(10) + "岁");
		System.out.println(Test31.nu(5) + "步");
	}
	public static int number(int n) {
		int x = 0;
		if(n == 1) {
			return 1;
		}
		 x  = number(n -1) * n;
		 return x;
	}
	public static int num(int x) {
		int n = 0;
		if(x == 1) {
			return 10;
		}
		n = num(x -1) + 2;
		return n;
	}
	public static int nu(int y) {
		int a = 0;
		if(y == 1) {
			return 1;
		}
		a = nu(y - 1) * 2 +1;
		return a;
	}
}
