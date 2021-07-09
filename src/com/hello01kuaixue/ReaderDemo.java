package com.hello01kuaixue;

import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo {
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("D:/Date.json");
			System.out.println("A" + reader.toString());
			System.out.println("B" + (char)reader.read());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
