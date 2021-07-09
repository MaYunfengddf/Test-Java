package com.hello01kuaixue;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

//输出流
public class WriterDemo {
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("D:/ttst.jds");
			Writer writer = new FileWriter("D:/uets.ks");
			int i = 0;
			while(i != -1){
				i = reader.read();
				writer.write(i);
			}
			
			reader.close();
			writer.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
