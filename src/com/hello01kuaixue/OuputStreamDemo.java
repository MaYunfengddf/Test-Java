package com.hello01kuaixue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
//把Date.json里的内容通过输出流的方式写道output.json里
public class OuputStreamDemo {
	public static void main(String[] args) { 
		try {
			File inputFile = new File("D:/Date.json");
			File outputFile = new File("D:/output.json");
			InputStream inputStream = new FileInputStream(inputFile);
			OutputStream outputStream = new FileOutputStream(outputFile);
			int i = 0;
			while (i != -1) {
				i = inputStream.read();
				outputStream.write(i);
			}
			inputStream.close();
			outputStream.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
