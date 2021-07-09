package com.helloworld.test;

public class Test53 {
	public static void main(String[] args) {
		Test52<Integer> test = new Test52<Integer>();
		test.setName(8);
		System.out.println(test.getName());
		
		Test52<Character> test1 = new Test52<Character>();
		test1.setName('-');
		System.out.println(test1.getName());
		
	}
}
