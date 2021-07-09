package com.helloworld.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Test68 {
	public static void main(String[] args) {
		try {
			File file = new File("d:/ssad.txt");
			OutputStream out = new FileOutputStream(file);
			
			Scanner ner = new Scanner(System.in);
			System.out.println("请输入需要写入文档的内容");
			String str = ner.nextLine();
			
			char[] x = str.toCharArray();
			for(int i = 0; i < x.length; i++) {
				System.out.println(x[i]);
				out.write(x[i]);
			}
			
			for(int i = 0; i < 128; i++) {
				out.write((char)i);
			}
			out.close();
			ner.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
