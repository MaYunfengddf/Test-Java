package com.helloworld.test;

public class Test51 {
	public static void main(String[] args) {
		Test50 test[] = Test50.values();
		
		for(int i = 0; i < test.length; i ++) {
			System.out.println( test[i] + test[i].a);
		}
	}
}
