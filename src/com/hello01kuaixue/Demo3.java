package com.hello01kuaixue;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo3 {
	public static void main(String[] args) {
		try {
		FileInputStream input = new FileInputStream("data.json");
		FileOutputStream output = new FileOutputStream("output.json");
		byte[] byteArray = new byte[input.available()];
		input.read(byteArray);
		output.write(byteArray);
		input.close();
		output.close();
		}catch(Exception e) {
			System.out.println("系统异常:" + e.getMessage());
		}
	}
}
