package com.hello01kuaixue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2 {
	public static void main(String[] args) {
		printClassMethods(new Person1("Jack",24));
	}
	public static void printClassMethods(Object obj) {
		Class c = obj.getClass();
		Method[] methods = c.getDeclaredMethods();
		
		for(Method method : methods) {
			Class returnType = method.getReturnType();
			
			System.out.print(returnType.getSimpleName());
			
			System.out.print(" " + method.getName()+ "(");
			
			
			Class[] parameterTypes = method.getParameterTypes();
			for(Class paramType : parameterTypes) {
				System.out.print(paramType.getSimpleName() +",");
			}
			System.out.println(")");
		}
	}
}
