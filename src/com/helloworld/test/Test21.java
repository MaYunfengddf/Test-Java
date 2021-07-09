package com.helloworld.test;

import java.util.Arrays;
//循环排列大写
public class Test21 {
	public static void main(String[] args) {
		int[] num = {423,554,45,456,785,34,446,47};
		Test21 test = new Test21();
		test.number(num);
		int a = 0;
		test.number(num,a);
	}
	public void number(int[] num) {
		for(int i = 1; i < num.length;i++) {//外出控制循环次数
			for(int x = 0; x < num.length - i;x++) {//内层循环换每次结束最小的一位移动到最后
				if(num[x] < num[x + 1]) {
					int a = num[x];
					num[x] = num[x + 1];
					num[x + 1] = a;
					System.out.println(Arrays.toString(num));
				}
			}
		}
	}
	public void number(int[] num,int n) {
		int a = 1;
		for(int i = n; i <= 100;i ++) {
			if(i % 3 == 0 && i % 5 != 0) {
				System.out.println(i);
				System.out.println(a++ + "个");
			}
		}
	}
}
