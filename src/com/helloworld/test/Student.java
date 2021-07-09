package com.helloworld.test;

public class Student {
	private String name;
	private int chinese;//语文
	private int mathematics;//数学
	private int english;//英语
	private int studentNumber;//学号

	public Student(String name) {
		this.name = name;
	}

	public Student(String name,int chinese ,int mathematics, int english,int studentNumber) {
		this.name = name;
		this.chinese = chinese;
		this.mathematics = mathematics;
		this.english = english;
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getChinese() {
		return this.chinese;//语文
	}
	public int getMathematics(){
		return this.mathematics;//数学
	}
	public int getEnglish() {
		return this.english;//英语
	}
	public int getStudentNumber() {
		return this.studentNumber;//学号
	}
	
}
