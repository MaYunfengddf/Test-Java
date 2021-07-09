package com.helloworld.test;
/*題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
 *对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *1 1 2 3 5
 **/ 
public class Test3 {
	public static void main(String[] args) {
		int num[] = new int[100];
		num[0] = num[1] = 1;
		for(int i = 3;; i++) {
			num[i] =num [i - 1] +num [i - 2];
			System.out.println("第"+(i - 2)+"个月有"+num[i]+"对兔子,一共有"+num[i]*2+"只兔子");
			if(i - 2 == 24 ) {
				break;
			}
		}
	}
}
