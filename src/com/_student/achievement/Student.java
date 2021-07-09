package com._student.achievement;


public class Student {
	public static int ID;//学号
	public String name;//名字
	public int chinese;//语文
	public int mathematics;//数学
	public int english;//英语
	
	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChinese() {
		return chinese;
	}

	public void setChinese(int chinese) {
		this.chinese = chinese;
	}

	public int getMathematics() {
		return mathematics;
	}

	public void setMathematics(int mathematics) {
		this.mathematics = mathematics;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}
	
	public String toString() {
		return "学号:" + ID + "  -名字:" + name + "  -语文:" + chinese + "  -数学:" + mathematics + "  -英语:" + english;
	}
	
}
