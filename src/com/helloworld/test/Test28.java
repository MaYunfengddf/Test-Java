package com.helloworld.test;

public class Test28 {
	
		/*
		int a = 0;
		for(int i = 0;i < 100;i ++) {
			a = a + i;
		}
		System.out.println(a + "A");

		int x = 0;
		for(int w = 0; w < 100; w ++) {
			x += w;
		}
		System.out.println(x+ "B");
	}*/
		
		public static void main(String[] args) {
			Student[] student = {new Student("小王",45,67,45,1001),new Student("小李",64,48,45,1002),new Student("小明",64,54,87,1003),new Student("张三",12,54,87,1004),new Student("李四",46,87,45,1005)};
		for(int i = 0; i < student.length;i++) {
			System.out.println(student[i].getName());
			System.out.println("语文成绩:" + student[i].getChinese());
			System.out.println("数学成绩:" + student[i].getMathematics());
			System.out.println("英语成绩:" + student[i].getEnglish());
			System.out.println("学号" + student[i].getStudentNumber());
		}
	}
}
