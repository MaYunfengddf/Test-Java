package com.helloworld.test;

public class Test33 extends Test32 {
	public  String name = "Hello word";
	public final int x = 6;
	
	public static void main(String[] args) {
		Test32 test1 = new Test32();
		System.out.println(test1.x);
		test1.x = 5;
		System.out.println(test1.x);
		
		Test33 test = new Test33();
	System.out.println(test.name);
	System.out.println(test.x);
	System.out.println(test.name());
	System.out.println(test.name(7));
	test.num();
	test.na(8);
	test.s = 77;
	test.na(9);
	System.out.println(test.name1(46));
	}
	
	public  void  num() {
	System.out.println(super.name);
	System.out.println(super.x);
	}
}
