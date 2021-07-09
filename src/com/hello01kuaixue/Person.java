package com.hello01kuaixue;

public class Person  implements Comparable<Person>{
	
	public Person(int age,String name) {
		this.name = name;
		this.age = age;
	}
	
	String name = "名字";
	int age;
	public int compareTo(Person person) {
		int num = this.age - person.age;
		return num;
	}
	public String toString() {
		return "名字:" + this.name + ";年龄:" + this.age + "岁";
	}
}
