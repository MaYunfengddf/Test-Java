package com.helloworld.test;

public class Test34 {
	public static void main(String[] args) {
		
		int a= 1;
		int b = 6;
		int c = 9;
		String d = "01";
		String e = "02";
		String f = "03";
		char g = '_';
		char h = '/';
		char i = ',';
		
		Test34 test = new Test34();
		
		test.number(a);
		test.number(b);
		test.number(c);
		test.number(a,b);
		test.number(a,c);
		test.number(b,c);
		test.number(a,b,c);
		test.number(b,a,c);
		
		test.number(d);
		test.number(e);
		test.number(f);
		test.number(d,e);
		test.number(e,f);
		test.number(g);
		test.number(h);
		test.number(i);
		test.number(g,h);
		test.number(h,i);
		
		test.number(a,d,g);
		test.number(a,g,d);
		test.number(d,a,g);
		
	}
	public void number(int a) {
		System.out.println("a" + a);
	}
	
	public void number(int b,int c) {
		System.out.println("a" + b +" c"+ c);
	}
	
	public void number(int b,int c,int a) {
		System.out.println("a" + b +" c"+ c + " a" + a);
	}
	public void number(String d) {
		System.out.println("d" + d);
	}
	public void number(String d,String e) {
		System.out.println("d" + d +" e" + e);
	}
	public void number(String d,String e,String f) {
		System.out.println("d" + d + " e" + e + " f" + f);
	}
	public void number(char g) {
		System.out.println("g" + g);
	}
	public void number(char g,char h) {
		System.out.println("g" + g + " h" + h);
	}
	public void number(char g,char h,char i) {
		System.out.println("g" + g + " h" + h + " i" + i);
	}
	public void number(int a,String d ,char g) {
		System.out.println("a" + a + " d" + d + " g" + g);
	}
	public void number(int a, char g,String d) {
		System.out.println("a" + a +  " g" + g +" d" + d);
	}
	public void number(String d, int a,char g) {
		System.out.println("d" + d+" a" + a +  " g" + g );
	}

}
