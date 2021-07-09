package com.hello01kuaixue;

import java.io.File;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class EDemo2 {
	public static void main(String[] args) {
		
		//NullPointerException
		List<String> list = new ArrayList<>();
		list.add("第一个元素abc");
		list.add(null);
		for(String var : list) {
			if(var == null) {
				System.out.println("判断该元素为空");
				continue;
			}
			System.out.println(var.toUpperCase());
		}
		
		System.out.println("-------------------------");
		
		//NumberFormatException
		String str = "01";
		Double num = Double.parseDouble(str);
		System.out.println(num);
		
		System.out.println("-------------------------");
		
		//IllegalArgumentException
		System.out.println(EDemo2.createFilePath("dir1","file1"));
		System.out.println();
		System.out.println(EDemo2.createFilePath("dsda","file1"));
		
		System.out.println("-------------------------");
		
		
		try {
			Class<ECat> cls = ECat.class;
			ECat obj = (ECat)cls.newInstance();
			Method target = cls.getDeclaredMethod("desc",String.class);
		}catch(InstantiationException e) {
			System.out.println("捕获异常:" + e.getClass().getName());
			System.out.println("异常内容为:" + e.getMessage());
		}catch(NoSuchMethodException e) {
			System.out.println("捕获异常:" + e.getClass().getName());
			System.out.println("异常内容为:" + e.getMessage());
		}catch(IllegalAccessException e) {
			System.out.println("捕获异常:" + e.getClass().getName());
			System.out.println("异常信息为:" + e.getMessage());
		}
		
		System.out.println("-------------------------");
		
		System.out.println("count方法返回值为:" + count());
	}
	
	
	public static String createFilePath(String parent,String filename) throws IllegalArgumentException{
		if(parent == null)
			throw new IllegalArgumentException("文件路径不能为空!");
		
		if(filename == null)
			throw new IllegalArgumentException("文件名称不能为空!");
		
		return parent + File.separator + filename;
		
	}
	
	
	public static int count() {
		try {
			return 1;
		}catch(Exception e) {
		}finally {
			return  -1;
		}
	}
}
