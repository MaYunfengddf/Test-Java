package com.helloworld.test;

public class Test32 {
	public  String name = "hello";
	public  int x = 34;
	public int s = 7;
	
	public String name() {
		return name;
	}
	public int name(int a) {
		return a + x;
	}
	public final void na(int s) {
		System.out.println(s);
	}
	public int  name1(/*final*/ int c) {
		c = 8;
		return c;
	}
}
