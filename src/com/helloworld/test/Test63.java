package com.helloworld.test;

public class Test63 {
	public static void main(String[] args) {
		Test62 test = new Test62();
		test.setName("xxr");
		test.setColour("黑色");
		test.setSpeed(120);
		test.setModel("xxx");
		test.setConductor(2.1);
		System.out.println(test.number());
		
		System.out.println("--------------------");
		Test62 testA = new Test62();
		testA.setName("xr");
		testA.setColour("黑色");
		testA.setSpeed(150);
		testA.setModel("xxxxx");
		testA.setConductor(1.9);
		System.out.println(testA.number());
	}
}
