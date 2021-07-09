package com.helloworld.demo;

public class TestMain {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		System.out.println(person1.hashCode());

		System.out.println(Person.address);

		Person person2 = new Person("张三", 30);
		System.out.println(person2.getName());
		System.out.println(person2.getAge());
		

		System.out.println(person1.getName());
		System.out.println(person1.getAge());
//		Person person3 = new Person("张三");
	}

}
