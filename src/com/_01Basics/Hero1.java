package com._01Basics;

import java.io.FileOutputStream;

public class Hero1 {
	public static void main(String[] args) {
		Hero1 h = new Hero1();
		h.test();
	}
	public void test() {
		try {
		FileOutputStream file = new FileOutputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\test.txt",true);
		String s = "dffsf";
		
		file.write(s.getBytes("utf-8"));
		
		
		
		file.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
