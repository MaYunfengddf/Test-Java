package com.helloworld.test;

public class Test19 {
	public static  void main(String[] args) {
		int str = 0;
		int num = 0;
		String n = "0";
		int c = 0 ;
		char d = '5';
		Test19 test = new Test19();
		test.number(str);
		test.number( str,num);
		test.number(n, str, num);
		test.number(n, str, num,c);
		test.number(d);
	}
	public void number(int str) {
		for(int y = 0; y < 10; y++) {
			for(int x = 0; x < 10; x++) {
				if(y == 4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 0; i < 10 ;i ++) {
			System.out.print("-");
		}
		System.out.println();
	}
	public void number(int str,int num) {
		for(int y = 1; y <= 10; y ++) {
			for(int x = 1;x <= 10; x++) {
				if(y <= 5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 0; i < 10 ;i ++) {
			System.out.print("-");
		}
		System.out.println();
	}
	public void number(String n,int str,int num) {
		for(int y = 1; y <= 10; y ++) {
			for(int x = 0;x <= 10; x++) {
				if(y == -x + 10) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 0; i < 10 ;i ++) {
			System.out.print("-");
		}
		System.out.println();
	}
	public void number(String n,int ... str) {
		for(int y = 1; y <= 10; y ++) {
			for(int x = 0;x <= 10; x++) {
				if(y <= -x +10 && y >= 0 && x >= 0) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		for(int i = 0; i < 10 ;i ++) {
			System.out.print("-");
		}
		System.out.println();
	}
	public void number(char d) {
		int r = 5;
		for(double y = -5; y < 5; y ++) {
			for(double x = -5;x < 5; x++) {
				if(r* r >= y * y + x * x) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}