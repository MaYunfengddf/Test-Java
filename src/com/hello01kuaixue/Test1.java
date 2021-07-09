package com.hello01kuaixue;

import java.lang.reflect.Field;

public class Test1 {
	public static void main(String[] args) {
		printClassVariables(new Person1());
	}
	public static void printClassVariables(Object obj) {
		Class c = obj.getClass();
		Field[] fields = c.getDeclaredFields();
		for(Field field : fields) {
			Class fieldType = field.getType();
			String typeName = fieldType.getSimpleName();
			String fieldNam = field.getName();
			System.out.println("字段类型信息:" + typeName + ",名称:" + fieldNam);
		}
	}
}
