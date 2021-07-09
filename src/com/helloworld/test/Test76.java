package com.helloworld.test;
//打印 1-100 之间的数，如果这个数，要么是3，要么5的倍数，就忽略掉
public class Test76 {
	public static void main(String[] args) {
		Test76 test= new Test76();
		test.number();
		test.number(0);
		test.number('4');
		test.number("5");
	}

	public void number(){
		for(int i = 0;i <= 100;i++) {
			if(i %3 != 0 && i %5 !=0) {
				System.out.println(i);
			}
		}
	}

	/*
	 * 假设你月收入是3000，除开平时花销，每个月留下1000块钱进行投资。

然后你认真的钻研了 《股票和基金 21天从入门到精通》，达到了每年20%的投资回报率。

那么问题来了，以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
（复利计算按照每年12000投入计算，不按照每月计息）
复利公式：
F = p* ( (1+r)^n );.F 最终收入.p 本金.r 年利率.n 存了多少年
假设情景一：.p = 10000.r = 0.05.n = 1
	 */
	public void number(int a) {
		Double w = 12000.0;

		for(int i = 1;;i++) {
			Double x = w*(1 + 0.05);
			w = w + x;
			if(w >= 1000000 + x -1)
				break;
			System.out.println("本金"+ w + "年" + i);
		}
	}
	public void number(char a) {
		int w = 0;
		for(int i = 0;;i++) {
			Double x = (12 * 1000) * (1 + 0.05);
			w += x;
			if(w >= 1000000 + x -1) 
				break;
			System.out.println("本金"+ w + "年" + i);

		}
	}
	//i + s = 8
	//+   +
	//x - y = 6
	//=   =
	//14  10
	public void number(String a) {
		for(int i = 1;i <= 8;i++) {
			for(int s = 1;s <= 8;s++) {
				for(int x = 1;x <= 14;x++) {
					for(int y = 1;y <= 10;y++) {
						if(i + s == 8 && x - y == 6 &&i + x == 14 && s + y == 10) {
							System.out.println("i = " + i +"  s =" + s +"  x =" + x + "  y =" + y);
						}
					}
				}
			}
		}
	}
}
