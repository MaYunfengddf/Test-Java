package com.helloworld.test;

import java.util.Scanner;

public class Test27 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("输入 1 录入学生成绩，输入 2 展示录入的学生成绩");
		String input = scanner.nextLine();
		switch(input) {

		case "1":
			number(input,scanner);
			break;

		case "2":
			//number(input,a,scanner);
			break;
		}
	}

	public static void number(String input,Scanner scanner) {
		String[] string = new String[5];
		for(int a = 0;;a ++) {
			
			if(a==0) {
				for(int i = 0;; i++) {

					System.out.println("请输入学生成绩和姓名 不超过五位学生 以名字 【语文成绩 数学成绩 英语成绩 和学号】 输入2查看当前输入学生内容 输入equ终止录入 终止后也可以输入3直接查看已输入的学生成绩单");
					String input1 = scanner.nextLine();
					if(input1.equals("equ")){
						System.out.println("终止录入");
						System.out.println("输入3查看学生成绩，输入ssa终止程序");
						break;
					}

					if(i + 1 % 5 == 0 || i >= 5) {
						System.out.println("存储五个 已存满");
					}else {
						string[i] = input1;
					}
					if(input1.equals("2")){
						for(String element:string) {
							System.out.println(element);
						}
					}
				}
			}
			if(a > 0) {
				String input2 = scanner.nextLine();

				if(input2.equals("3")){
					for(String element:string) {
						System.out.println(element);
					}
					System.out.println("输入3查看学生成绩 输入ssa终止程序");
				}
				if(input2.equals("ssa")){
					System.out.println("终止程序");
					break;
				}
			}
		}
	}
}