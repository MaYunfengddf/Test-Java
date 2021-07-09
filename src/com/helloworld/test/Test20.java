package com.helloworld.test;
import java.util.Scanner;
//输入相反的数  如987  输出789
public class Test20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入万位正整数");
		String str = scanner.nextLine();
		Test20 test = new Test20();
		String result = "";
		long x = Long.valueOf(str);
		//test.number(str);
		test.number(str,result);
		Test20 tes = new Test20();
		tes.num(str,x);
	}

	/*public void number(String str) {
		int n = str.length();
		int x = Integer.valueOf(str);
		int wanwei = x/10000;
		int qianwei = x%10000/1000;
		int baiwei = x%1000/100;
		int shiwei = x%100/10;
		int gewei = x%10;
		if(n == 1) {
			String strs = String.valueOf(gewei);
			System.out.println(strs);
		}else if(n == 2) {
			String strs = String.valueOf(gewei) + shiwei;
			System.out.println(strs);
		}else if(n == 3) {
			String strs = String.valueOf(gewei) + shiwei + baiwei;
			System.out.println(strs);
		}else if(n == 4) {
			String strs = String.valueOf(gewei) + shiwei + baiwei + qianwei;
			System.out.println(strs);
		}else if(n == 5) {
			String strs = String.valueOf(gewei) + shiwei + baiwei + qianwei + wanwei;
			System.out.println(strs);
		}
	}*/
	public void number(String str, String result) {
		for(int index = str.length() - 1;index >= 0;index --) {
			result += str.charAt(index);
		}
		System.out.println(result);
	}
	public void num(String str,long x ) {
		
		for(;x > 0;) {
			long tem =  x % 10;
			x = x / 10;
			System.out.print(tem);
		}
		System.out.println();
	}
}
