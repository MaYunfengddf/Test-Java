package com.hello01kuaixue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test4 {
	public static void main(String[] args) throws InvocationTargetException,IllegalAccessException{
		PrintUtil printUtil = new PrintUtil();
		Class clazz = printUtil.getClass();
		try {
			Method m1 = clazz.getMethod("print",int.class,int.class);
			m1.invoke(printUtil,1,2);
			
			Method m2 = clazz.getMethod("print",String.class,String.class);
			m2.invoke(printUtil,"hello","world");
			
			Method m3 = clazz.getMethod("print");
			m3.invoke(printUtil);
		}catch(NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}
