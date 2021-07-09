package com._student.test;

import java.io.Serializable;

public class StudentInformation implements Serializable{
	public static int ID;//学号
	private String name;//名字
	private String birthday;//生日
	private String gender;//性别
	
	public StudentInformation() {
		
	}
	
	public StudentInformation(String name,String birthday,String gender) {
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
	}
	public int getID() {
		return ID;
	}
	public void setID() {
		ID++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
