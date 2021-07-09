package com.helloworld.test;
//九九乘法表
public class Test23 {
	public static void main(String []args) {
		for(int i = 1; i<=9; i ++) {
			for(int x = 1; x <= i; x ++) {
				
				System.out.print(x +"*"+i +"=" + i * x+ " ");
			}
			System.out.println();
		}
	}
}
