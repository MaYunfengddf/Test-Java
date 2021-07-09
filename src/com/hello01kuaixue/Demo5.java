package com.hello01kuaixue;

import java.io.*;

public class Demo5 {
	public static void main(String[] args) {
		try {
			String fileName = "data.txt";
			writeFile(fileName);
			readFile(fileName);
		}catch(Exception e) {
			System.out.println("系统异常:" + e.getMessage());
		}
	}

	private static void readFile(String fileName) throws IOException,FileNotFoundException{
		FileReader fileReader = new FileReader(fileName);
		char ch = ' ';
		System.out.println("读取文件内容");
		while(ch !='9') {
			ch = (char)fileReader.read();
			System.out.print(ch);
		}
		System.out.println("===文件读取完毕===");
		fileReader.close();
	}

	private static void writeFile(String fileName) throws IOException{
		FileWriter fileWriter = new FileWriter(fileName);
		System.out.println("开始写入:");
		for(int i = 0; i < 15;i++) {
			fileWriter.write(String.valueOf(i));
		}
		fileWriter.close();
	}
}
