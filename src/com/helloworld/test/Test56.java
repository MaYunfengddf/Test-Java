package com.helloworld.test;

public class Test56 {
	public static void main(String[] args) {
		Test55<String,String> testA = new Test55<String,String>();
		testA.setName("老王");
		testA.setAge(45);
		testA.setCar("小轿车");
		testA.setEat("汉堡");
		testA.setSleep("床上");
		testA.toStringA() ;
		testA.toStringB();
		
		Test55<Integer,String> testB = new Test55<Integer,String>();
		testB.setName(64);
		testB.setAge(65);
		testB.setCar("66");
		testB.setEat(67);
		testB.setSleep("68");
		testB.toStringA() ;
		testB.toStringB();
		
		Test55<String,String> testC = new Test55<String,String>();
		testC.setName("李四");
		testC.setAge(40);
		testC.setCar("无");
		testC.setEat("盒饭");
		testC.setSleep("单人床");
		testC.toStringA() ;
		testC.toStringB();
	}
}
