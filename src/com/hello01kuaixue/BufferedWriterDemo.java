package com.hello01kuaixue;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		FileWriter fileWriter = null;
		BufferedWriter writer = null;
		try {
			fileWriter = new FileWriter("data.txt");
			writer = new BufferedWriter(fileWriter);
			System.out.println("开始向data.txt文件中写入内容:");
			writer.write("开始写入文件:");
			for(int i = 0; i < 4;i++) {
				String str = "第" + i + "行文字";
				System.out.println(str);
				writer.write(str);
				writer.newLine();
				writer.flush();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
