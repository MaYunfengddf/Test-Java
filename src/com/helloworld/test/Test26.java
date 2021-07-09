package com.helloworld.test;
import java.util.Scanner;

public class Test26 {
	private static Student name;
	private static Student name1;
	private static Student name2;
	private static Student name3;
	private static Student name4;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("输入 1 录入学生成绩，输入 2 展示录入的学生成绩");
		String input = scanner.nextLine();

		int a = 1;

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
		for(int i = 0;; i++) {
			System.out.println("请输入学生成绩和姓名 不超过五位学生 以名字 【语文成绩 数学成绩 英语成绩 和学号】 输入 输入equ返回主菜单 也可以输入2直接查看已输入的学生成绩单");
			String input1 = scanner.nextLine();
			if(input1.equals("equ")){
				break;
			}
			if(input1.equals("2")){
				for(String element:string) {
					System.out.println(element);
				}
				break;
			}
			if(i + 1 % 5 == 0 || i >= 5) {
				System.out.println("存储五个 已存满");
			}else {
				string[i] = input1;
			}


		}

		/*for(int i = 0;i < student.length;i ++) {
			System.out.println(student[i].getName());
			System.out.println("语文成绩:" + student[i].getChinese());
			System.out.println("数学成绩:" + student[i].getMathematics());
			System.out.println("英语成绩:" + student[i].getEnglish());
			System.out.println("学号" + student[i].getStudentNumber());
		}*/
	}
}
