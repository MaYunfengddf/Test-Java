package com.helloworld.test;

public class Test65 {
	public static void main(String[] args) {
		Test64 test = new Test64();
		test.setName("血瓶");
		test.setPrice(50);
		System.out.println(test.number());
		System.out.println("-----------");
		
		Test64 testA = new Test64();
		testA.setName("草鞋");
		testA.setPrice(300);
		System.out.println(testA.number());
		System.out.println("-----------");
		
		Test64 testB = new Test64();
		testB.setName("长剑");
		testB.setPrice(350);
		System.out.println(testB.number());
	}
}
