package com.hello01kuaixue;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo {
	public static void main(String[] args) {
		try {
			InputStream inputStream = new FileInputStream("D:/game/test.jde");
			System.out.println(inputStream.toString());
			System.out.println((char)inputStream.read());
			inputStream.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
