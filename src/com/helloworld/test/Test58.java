package com.helloworld.test;
//输出0-100的偶数 并相加

public class Test58 {
	public static void main(String[] args) {
		int a = 0;
		String x = "";
		int y = 0;
		for(int i = 0;i <= 100;i ++) {
			if(i % 2 == 0) {
				if(i == 0) {
					x = x + 0;	
				}else {
					x = ","+i;
				}
				System.out.print(x);
				a +=i;
			}

		}
		System.out.println();
		System.out.println();
		for(int c = 0;c <= 100;c ++) {
			x = "";
			if(c % 2 != 0) {
				if(c == 1) {
					x = x + 1;	
				}else {
					x = ","+c;
				}

				System.out.print(x);
				y +=c;
			}
		}
		System.out.print("\n偶数相加结果为:"+a);
		System.out.print("\n奇数相加结果为:"+y);

	}
}
