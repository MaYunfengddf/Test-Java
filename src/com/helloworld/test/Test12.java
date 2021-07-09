package com.helloworld.test;
/*題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
 *对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *1 1 2 3 5 8 13 21 34 55 89
 **/ 

public class Test12 {
	public static void main(String[] args) {
		int x = number(10);
		System.out.println(x);
	}
	
	public static int number(int n) {

		if(n <= 2) {
			return  1;
		}
		return number(n - 1) + number(n-2); 
		
	}
	/*										n = 6
	 * 					5												4
	 *			4				3								3					2
	 *		3		2		2 	1							2		1				2
	 * 	2		1 	2		2	1							2		1				2
	 * 	1 		1	1		1	1							1		1				1
	 * 										= 8
	 */

}
