package com.helloworld.test;
import java.util.Arrays;
import java.util.Scanner;

public class Test60 {
	public static void main(String[] args) {
		int[] x = new int[4];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.println("请输入数组第一位");
			int test = scanner.nextInt();
			x[0] = test;
			System.out.println("请输入数组第二位");
			int testA = scanner.nextInt();
			x[1] = testA;
			System.out.println("请输入数组第三位");
			int testB = scanner.nextInt();
			x[2] = testB;
			System.out.println("请输入数组第四位");
			int testC = scanner.nextInt();
			x[3] = testC;
			break;
		}
		System.out.println("\n输入的数组为:" + Arrays.toString(x));

		for(int i = 0;i < x.length - 1; i++) {
			for(int j = 0;j < x.length -1- i; j++) {
				if(x[j] <x[j + 1]) {
					int a = x[j];
					x[j] = x[j + 1];
					x[j + 1] = a;
				}
			}
		}
		System.out.println("\n大到小排列:" + Arrays.toString(x));
		System.out.println("\n提前输入的最大值" + x[0]);
	}
}


