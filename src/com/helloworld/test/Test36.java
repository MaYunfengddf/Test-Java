package com.helloworld.test;

public class Test36 extends Test35{
	public int a = 101;
	public void test35() {
		System.out.println("子类方法");
	}
	public static void main(String[] args) {
		Test35 test = new Test36();
		test.test35();
		Test36 test1 = new Test36();
		test1.number();
		System.out.println(test.a);
	}
	public void number() {
	super.test35();
	this.test35();
	}
}
