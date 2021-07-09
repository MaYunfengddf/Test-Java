package com.helloworld.test;
import java.util.Scanner;
/*
 * 【练习题】04.构造方法 编写Java程序模拟简单的计算器。 定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
 * 编写构造方法赋予n1和n2初始值再为该类定义加addition、减subtration、乘multiplication、除division等
 * 公有成员方法分别对两个成员变量执行加、减、乘、除的运算。 在main方法中创建Number类的对象调用各个方法并显示计算结果。
 */
public class Number {
	private int x;
	private int y;
	
	public void getX(int x,int y) {
		this.x = x;
		this.y = y;
	} 

	public void addition() {
		System.out.println(x+ "+" + y + "="  + (x + y) );
	}
	public void subtration() {
		System.out.println( x + "-" + y + "= " + (x - y) );
	}
	public void multiplication() {
		System.out.println(x + "*" + y + "=" + (x * y));
	}
	public void division() {
		System.out.println( x + "/" + y + "=" + (x / y));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.println("输入符号如 + - * / 来进行加减乘除计算 输入equ退出程序");
			String str = scanner.nextLine();
			Number number = new Number();
			if("equ".equals(str)) {
				System.out.println("程序结束");
				break;
			}
			switch(str) {

			case "+":
				System.out.println("输入相加的两位数 中间用英文逗号隔开");
				String ger = scanner.nextLine();
				String[] strArray = ger.split(",");
				number.getX(Integer.parseInt(strArray[0]),Integer.parseInt(strArray[1]));
				number.addition();
				break;

			case"-":
				System.out.println("输入相减的两位数 中间用英文逗号隔开");
				String ge = scanner.nextLine();
				String[] st = ge.split(",");
				number.getX(Integer.parseInt(st[0]),Integer.parseInt(st[1]));
				number.subtration();
				break;

			case"*":
				System.out.println("输入相乘的两位数 中间用英文逗号隔开");
				String gr = scanner.nextLine();
				String[] tr= gr.split(",");
				number.getX(Integer.parseInt(tr[0]),Integer.parseInt(tr[1]));
				number.multiplication();
				break;

			case"/":
				System.out.println("输入相除的两位数 中间用英文逗号隔开");
				String er = scanner.nextLine();
				String[] sr = er.split(",");
				number.getX(Integer.parseInt(sr[0]),Integer.parseInt(sr[1]));
				number.division();
				break;
				
				default:
					System.out.println("请重新输入符号 如 + - * / 来进行加减乘除计算 输入equ退出程序");
			}
		}
	}
}
