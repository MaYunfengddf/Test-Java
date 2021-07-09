package com.helloworld.demo;

public class Person {
	
	/**
	 * 第一部分：类的属性，不能重复
	 */
	private String name;
	private int age;
	
	public static String address = "上海";
	
	/**
	 * 第二部分：构造函数
	 */
	public Person() {
		this.name = "无名";
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private Person(String name) {
		this.name = name;
		this.age = 20;
	}
	
	/**
	 * 第三部分：方法（函数）
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) {
			Person o = (Person)obj;
			
			if(this.name.equals(o.name) && this.age == o.age) {
				return true;
			}
		}
		
        return false;
    }

}
