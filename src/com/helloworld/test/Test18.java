package com.helloworld.test;

public class Test18 {
	public static void main(String[] args) {
		int[] a= {0,1};
		int b = a[0];
		a[0] = a[1];
		a[1] = b;
		
		System.out.println( a[0]+""+a[1]);
	}
}
