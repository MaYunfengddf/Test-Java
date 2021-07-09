package com.hello01kuaixue;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo8 {
	public static void main(String[] args) {
		Cat4 cat = null;
		try {
			FileInputStream fileIn = new FileInputStream("cat.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			cat = (Cat4)in.readObject();
			in.close();
			fileIn.close();
		}catch(IOException e) {
			e.printStackTrace();
			return;
		}catch(ClassNotFoundException e) {
			System.out.println("无法找到Cat类");
			e.printStackTrace();
			return;
		}
		System.out.println("反序列化Cat对象");
		System.out.println("cat.name:" + cat.name);
		System.out.println("cat.age:" + cat.age);
		System.out.println("cat.desc:" + cat.desc);
	}
}
