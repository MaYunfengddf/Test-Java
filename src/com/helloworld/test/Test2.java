package com.helloworld.test;
/*
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
 *153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方
 */
public class Test2 {
	public static void main(String[] args) {
		int a , x , y;//a为百为  x为十为  y为个位
		for(int i = 100; i <= 999; i++) {

			a = i%1000/100;
			x = i%100/10;
			y = i%10;
			int	num = a*a*a+x*x*x+y*y*y;
			if(num == i) {
				System.out.println(num);
			}

		}
		float s = Float.MAX_VALUE; 
		System.out.println(s);
		
	}
}
