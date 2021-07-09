package com._01Basics;

import java.util.Scanner;

public class Basics {
	int i = 1;
	public static void main(String[] args) {
		int b = 2,c = 4,d = 5;
		if(b < --c)
			b *= b;
		System.out.println( b + " " + c +" "  +d);

		System.out.println("======='A2' + 2========");

		char ch1 = 'A',ch2 = 'W';
		if(ch1 + 2 < ch2) {
			++ch1;
			System.out.println(ch1 +" " + ch2);
		}
		
		System.out.println("=======i - j 1========");

		int i = 10,j = 18,k = 30;
		switch (j - i) {
		case 8: {
			k++;
			System.out.println(k);
		}
		case 9:{
			k +=2;
			System.out.println(k);
		}
		case 10:{
			k += 3;
			System.out.println(k);
		}
		default:
			double x =Integer.valueOf(k);
			x /=i;
			System.out.println(x);
		}
		System.out.println(k);

		System.out.println("===============");

		Basics ba = new Basics();
		ba.test(5);

		System.out.println("===============");

		ba.test1(5);

		System.out.println("===============");

		ba.test2();


		System.out.println("===============");

		//BMI值  BMI的计算公式是 体重(kg) / (身高*身高)
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入身高，和体重 中间以英文逗号分隔开");
		String st = sc.nextLine();
		String str = sc.nextLine();
		double x = Double.valueOf(st);
		double y = Double.valueOf(str);
		double w = y / (x * x);
		System.out.println("BIM值为:" + w);

		System.out.println("===============");
		//自增
		int g = 1;
		boolean h = !(g++ == 3) ^ (g++ ==2) && (g++==3);
		System.out.println(h);
		System.out.println(g);

		System.out.println("===============");

		//^运算符
		boolean l = true, m = true,v = false,z = false;
		System.out.println(l ^ m);
		System.out.println(l ^ v);
		System.out.println(m ^ v);
		System.out.println(v ^ m);
		System.out.println(m ^ l);
		System.out.println(m ^ m);
		System.out.println(l ^ l);
		System.out.println(v ^ z);
		System.out.println("===============");
		//不用*计算2*16 0001 0000    0010 0000  0111 1111
		int s = 16 << 1;
		System.out.println("2*16:" + s);
		System.out.println("===============");
		int p = 1;
		p += ++p;
		System.out.println("p = " + p);

		System.out.println("===============");
		//判断工作日 或周末
		System.out.println("今天周几？");
		String sr = sc.nextLine();
		int n = Integer.valueOf(sr);
		String ee = n < 6?"工作日":"周末";
		System.out.println(" 今天是:" + ee);

		System.out.println("===============");
		//判断闰年

		System.out.println("输入判断闰年");
		String yy = sc.nextLine();
		int ww = Integer.valueOf(yy);
		boolean rr = ww % 4 == 0 &&  ww % 100 != 0  || ww % 400 == 0;
		if(rr == true) {
			System.out.println("是闰年：" + ww);
		}else {
			System.out.println("不是闰年：" + ww);
		}
		
		
	}
	public void test(int i) {
		System.out.println(i);
	}

	public void test1(final int j) {


		//j = 5;
	}

	public void test2() {
		int k = 1;
		int j = ++k + k++ + ++k + ++k + k++;
		System.out.println("k = " + k);
	}
}
