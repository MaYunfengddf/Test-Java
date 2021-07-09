package com.helloworld.test;

public class Manager extends Employee{
	public final String vehicle = "白车";
	
	public Manager(int salary,int ID) {
		super(salary,ID);
	}
	public static void main(String[] args) {
		Employee employee =new Employee("小王",24,"男");
		employee.play();
		
		Manager manager = new Manager(4000,1001);
		manager.get(manager.getSalary(),manager.getID());
		manager.get();
		
	}
	public  void get(int salary,int ID) {
		System.out.println("薪水: " + salary + "\n工号： " + ID);
	}
	public void get() {
		System.out.println("出行: " + vehicle);
	}
}
