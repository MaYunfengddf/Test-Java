package com.hello01kuaixue;

import java.lang.reflect.Constructor;

public class Test {
	public static void main(String[] args)throws Exception{
		Class clazz = Class.forName("com.hello01kuaixue.Person1");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		
		Constructor constructor1 = clazz.getConstructor();
		Object object1 = constructor1.newInstance();
		Person1 personA = (Person1) object1;
		personA.say();
		
		Constructor constructor2 = clazz.getConstructor(String.class,int.class);
		Object object2 = constructor2.newInstance("Mike",22);
		Person1 person2 = (Person1) object2;
		person2.say();
	}
}
