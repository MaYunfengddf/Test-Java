package com._01Basics;

import java.util.Arrays;
import java.util.Scanner;

public class YunShuanFu {
	public static void main(String[] args) {
		YunShuanFu yun = new YunShuanFu();
		yun.test1();

		//判断季节 switch
		yun.test2();

		//if条件内变量改变  对原本变量不变
		yun.test3();

		//阶层
		yun.test4();

		//天朝乞丐 一天1  二天2 三天4 四天8
		yun.test5();

		//打印100 内 3 5 的倍数
		yun.test6();

		//某两个数相除，其结果 离黄金分割点 0.618最近   分母和分子不能同时为偶数  分母和分子 取值范围在[1-20]
		yun.test7();

		//随机数数组
		yun.test8();

		//10内整数 数组合并
		yun.test9();

		//二维数组 并找出最大的数
		yun.test10();
	}

	public void test1() {
		int i = 3;//3 | 2  -- 0011 | 0010 = 0011  2 & 3  0010 & 0011 = 0010  
		int j = 2;//3^2 0011 ^ 0010 = 0001 ----位移<<----   0100  ---位移>>>1---  0010
		int y = ((i | j) ^ (i & j)) << 2 >>> 1;
		System.out.println("y = " + y);
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份");
		String st = sc.nextLine();
		int x = Integer.valueOf(st);
		switch(x){
		case 1:
			System.out.println(x + "月是冬季");
			break;
		case 2:
			System.out.println(x + "月是春季");
			break;
		case 3:
			System.out.println(x + "月是春季");
			break;
		case 4:
			System.out.println(x + "月是春季");
			break;
		case 5:
			System.out.println(x + "月是夏季");
			break;
		case 6:
			System.out.println(x + "月是夏季");
			break;
		case 7:
			System.out.println(x + "月是夏季");
			break;
		case 8:
			System.out.println(x + "月是秋季");
			break;
		case 9:
			System.out.println(x + "月是秋季");
			break;
		case 10:
			System.out.println(x + "月是秋季");
			break;
		case 11:
			System.out.println(x + "月冬季");
			break;
		case 12:
			System.out.println(x + "月冬季");
			break;
		default:
			System.out.println("请输入正确月份");
		}
	}

	public void test3() {
		int i = 2,y = 6;
		if(i + 2 < y - 1) {
			System.out.println(i + " "+ y);
			++i;
			System.out.println(i + " "+ y);
		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入阶乘");
		String str = sc.nextLine();
		int x = Integer.valueOf(str);
		int y = 1;
		while(x >= 1) {
			y *=x;
			System.out.println(y);
			x--;
		}
	}

	public void test5() {
		//第一天 i   第一天钱 x;
		int x = 1;//前一天的两倍
		int z = 0;//一共有的钱
		for(int i = 1; i <= 10; i++) {
			if(i == 1) {
				x *= 1;
				System.out.println("第:" + i + "天有:"+ x +"钱");
				z = z + x;
				System.out.println("第:" + i + "天一共有:"+ z +"钱");
			}else {
				x *= 2;
				System.out.println("第:" + i + "天有:"+ x +"钱");
				z = z + x;
				System.out.println("第:" + i + "天一共有:"+ z +"钱");
			}
		}
		System.out.println("10天一共有:"+ z +"钱");
	}

	public void test6() {
		for(int i = 0; i <= 100;i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				System.out.println("打印100 内 3 5 的倍数 " + i);
			}
		}
	}

	public void test7() {
		double q = 0, w = 1,e = 0;
		double x = 0;
		double z = 0;
		for(double i = 1.0;i <= 20.0;i++) {
			for(double y = 1.0;y <= 20.0; y++) {
				if( i % 2 == 0 && y % 2 == 0)
					break;
				x = i / y;
				z = (x - 0.618) < 0? -(x - 0.618):(x - 0.618);
				if(z < w) {
					w = z;
					q = i;
					e = y;
				}
			}
		}
		System.out.println("最接近黄金分割的是:" + q / e);
		System.out.println("分子:" + q);
		System.out.println("分母:" + e);
	}

	public void test8() {
		int y = 0;
		int[]  i = new int[5];
		i[0] = (int) (Math.random() *100);
		i[1] = (int) (Math.random() *100);
		i[2] = (int) (Math.random() *100);
		i[3] = (int) (Math.random() *100);
		i[4] = (int) (Math.random() *100);
		for(int element : i ) {
			System.out.print("随机数组:" + element);
		}
		System.out.print("\n数组排序:\n");
		for(int x = 0; x < i.length - 1; x++) {
			for(int w = 0; w < i.length - 1;w++) {
				if(i[w] > i[w + 1]) {
					y = i[w];
					i[w] = i[w + 1];
					i[w + 1] = y;
				}
			}
		}

		for(int element : i) {
			System.out.print(element + ",");
		}
		System.out.print("\n数组反转:\n");
		for(int x = 1;x < i.length;x++) {
			for(int v = 0; v < i.length - x;v++) {
				y = i[v];
				i[v] = i[v + 1];
				i[v + 1] = y;
			}
		}

		for(int element : i) {
			System.out.print(element + ",");
		}
		System.out.println();
		System.out.println("最大值");
		int f = 0;
		for(int element : i) {
			if(element > f) {
				f = element;
			}
		}
		System.out.println(f);
	}

	public void test9() {
		int[] s = new int[5];
		int[] x = new int[5];
		s[0] =(int) (Math.random() * 10);
		s[1] =(int) (Math.random() * 10);
		s[2] =(int) (Math.random() * 10);
		s[3] =(int) (Math.random() * 10);
		s[4] =(int) (Math.random() * 10);

		x[0] = (int) (Math.random() * 10);
		x[1] = (int) (Math.random() * 10);
		x[2] = (int) (Math.random() * 10);
		x[3] = (int) (Math.random() * 10);
		x[4] = (int) (Math.random() * 10);

		int[] y = new int[10];
		int n = 0;
		System.out.println("\n数组s: ");
		for(int a : s) {
			System.out.print( a + ",");
			y[n] = a;
			n++;
		}
		System.out.println(" \n数组x:");
		n = 5;
		for(int a : x) {
			System.out.print( a + ",");
			y[n] = a;
			n++;
		}
		System.out.println("\n合并数组s + x: ");
		for(int f : y) {
			System.out.print( f + ",");
		}
	}

	public void test10() {
		int[][] s = new int[5][5];
		for(int i = 0; i < 5 ; i++) {
			for(int y = 0;y < 5;y++) {
				s[i][y] = (int) (Math.random() * 100);
			}
		}
		System.out.println();
		System.out.println("二维数组Ayyays输出:");
		System.out.println("随机生成的二维数组是:" + Arrays.deepToString(s));
		System.out.println("二维数组是双层for循环输出:");

		for(int i = 0;i < s.length;i++) {
			for(int y = 0;y < s[i].length;y++) {
				System.out.print(s[i][y] +",");
			}
			System.out.println();
		}
		for(int e = 0; e < 5;e++) {//控制循环次数
			for(int i = 0;i < s.length;i++) {//控制行数
				for(int y = 0;y < s[i].length - 1;y++) {//控制循环个数
					if(s[i][y] < s[i][y + 1]) {
						int d = s[i][y];
						s[i][y] = s[i][y + 1];
						s[i][y + 1] = d;
					}
				}
			}
		}
		System.out.println("改变顺序后" + Arrays.deepToString(s));
		for(int y = 0; y < s[y].length - 1;y++) {
			for(int i = 0; i < s[y].length - 1;i++) {

				if(s[i][0] < s[i + 1][0]) {
					int x = s[i][0];
					s[i][0] =  s[i + 1][0];
					s[i + 1][0] = x;
				}
			}
		}
		System.out.println("再次改变顺序后" + Arrays.deepToString(s));
		if(s[0][0] == s[1][0]) {
			System.out.println("本次随机二维数组最大值有两位为:" + s[0][0] + " " + s[1][0]);
		}else if(s[0][0] == s[2][0]) {
			System.out.println("本次随机二维数组最大值有三位为:" + s[0][0] + " " + s[1][0] + " " + s[2][0]);
		}else if(s[0][0] == s[3][0]) {
			System.out.println("本次随机二维数组最大值有四位为:" + s[0][0] + " " + s[1][0] + " " + s[2][0] + " " + s[3][0]);
		}else if(s[0][0] == s[4][0]) {
			System.out.println("本次随机二维数组最大值有五位为:" + s[0][0] + " " + s[1][0] + " " + s[2][0] + " " + s[3][0] + " " + s[4][0]);
		}else {
			System.out.println("本次随机二维数组最大值为:" + s[0][0]);
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
