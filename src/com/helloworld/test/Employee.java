package com.helloworld.test;

public class Employee extends Role{
	private int salary;//薪水
	private static int ID;
		
	Employee(String name ,int age,String gender){
		super(name,age,gender);
	}
	Employee(int salary,int ID){
		this.salary = salary;
		this.ID = ID;
	}
	public void play() {
		System.out.println("姓名: " + getName() + "\n性别: " + getGender() + "\n年龄: " + getAge());
	}
	public int getSalary() {
		return salary;
	}
	public int getID() {
		return ID;
	}
	public final void sing() {
		System.out.println("唱");
		
	}
}
