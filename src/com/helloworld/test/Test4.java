package com.helloworld.test;
import java.util.Scanner;
/*
 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
(2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。
(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步
 */
public class Test4 {
	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入数字");
		x = scanner.nextInt();
		new PrimeSplit(x);
		
	}
}
	class PrimeSplit{
		int k = 2;
	public PrimeSplit(int x) {
		
		if(x <= 1) {
			System.out.println("格式不成立");
		}else if(x == 2){
			System.out.println(x+"分解后的质因数为：1");
		}else {
			System.out.println(x+"分解后的质因数为：1");
		}
		while(k <= x) {
			if(x % k == 0) {
				System.out.println("*" + k);
				x = x / k;
			}else {
				k++;
			}
		}
	}
	
}
