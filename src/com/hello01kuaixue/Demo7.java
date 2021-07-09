package com.hello01kuaixue;

import java.io.*;

public class Demo7 {
	public static void main(String[] args) {
		Cat4 cat= new Cat4();
		cat.name = "小猫猫";
		cat.age = 3;
		cat.desc = "喵喵喵";
		try {
			FileOutputStream fileOut = new FileOutputStream("cat.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(cat);
			out.close();
			fileOut.close();
			System.out.println("序列化后文件储存在文件: + cat.ser");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
