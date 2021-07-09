package com.helloworld.test;
import java.util.Scanner;

public class schoolReport {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输出姓名 各科成绩 并用英文逗号分割");
		String input = scanner.nextLine();
		String[] strArray = input.split(",");
		int i = 1;
		Student test1 = new Student(strArray[0], Integer.parseInt(strArray[1]), Integer.parseInt(strArray[2]), Integer.parseInt(strArray[3]),i);
		System.out.println("姓名:" + test1.getName());
		System.out.println("语文成绩:" + test1.getChinese());
		System.out.println("数学成绩:" + test1.getMathematics());
		System.out.println("英语成绩:" + test1.getEnglish());
		System.out.println("学号" + test1.getStudentNumber());
		
		String name = "张三";
		test1.setName(name);
		System.out.println("姓名:" + test1.getName());
		System.out.println("语文成绩:" + test1.getChinese());
		System.out.println("数学成绩:" + test1.getMathematics());
		System.out.println("英语成绩:" + test1.getEnglish());
		System.out.println("学号" + test1.getStudentNumber());
	}
}
