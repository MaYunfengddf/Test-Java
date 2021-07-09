package com.hello01kuaixue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyAnnotationProcessor {
	public static void main(String[] args) {
		try {
			
			Class<?> clazz = MyAnnotationProcessor.class.getClassLoader().loadClass("com.hello01kuaixue.AnnotationTest");
			
			Field[] fields = clazz.getDeclaredFields();
			for(Field field : fields) {
				CustomAnnotation  MyAnnotation = field.getAnnotation(CustomAnnotation.class);
				System.out.println(" 1name:" + MyAnnotation.name() + " num:" + MyAnnotation.num() + " desc:" + MyAnnotation.desc());
			}
			
			Method[] methods = clazz.getMethods();
			
			for(Method method : methods) {
				
				if(method.isAnnotationPresent(CustomAnnotation.class)) {
					CustomAnnotation MyAnnotation = method.getAnnotation(CustomAnnotation.class);
					System.out.println(" 2name:" + MyAnnotation.name() + " num:" + MyAnnotation.num() + " desc:" + MyAnnotation.desc());
				}
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
