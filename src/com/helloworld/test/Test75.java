package com.helloworld.test;

import java.util.Scanner;

/*
 * 天朝有一个乞丐姓洪，去天桥要钱
第一天要了1块钱
第二天要了2块钱
第三天要了4块钱
第四天要了8块钱 8 16.32.64 128 .256 512
以此类推

问题： 洪乞丐干10天，收入是多少？
 */
public class Test75 {
	public static void main(String[] args) {
		Test75 test = new Test75();
		int i = 1;
		int s = test.number(i);
		s += s;
		System.out.println(s - 1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入阶乘");
		String str = sc.nextLine();
		int x = Integer.valueOf(str);
		System.out.println(test.num(x));
	}
	public int number(int i) {
		if(i == 10) {
			return 1;
		}
		return number(i + 1) * 2 ;
	}
/*
 * 通过Scanner 获取一个整数，然后使用while计算这个整数的阶乘

N的阶乘等于 N* (N-1) * (N-2) * ... * 1

练习-阶乘
 */
	public int num(int  x) {
		if(x == 1)
			return 1;
		return num(x - 1) * x;
	}
	
}
