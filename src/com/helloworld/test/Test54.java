package com.helloworld.test;

public abstract class Test54<T,U> {
	private T  name;
	private int age;
	private U car;
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public U getCar() {
		return car;
	}
	public void setCar(U car) {
		this.car = car;
	}
	public void toStringA () {
		System.out.printf( "姓名: %s  \n年龄: %s  \n出行工具: %s", getName(),getAge(),getCar()); 
		
		//return "姓名: %s  \n年龄: %s  \n出行: %s", getName(),getAge(),getCar()
	}
	
}
