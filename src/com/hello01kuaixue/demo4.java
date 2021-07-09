package com.hello01kuaixue;

import java.io.FileReader;

public class demo4 {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("data.json");
			char ch = ' ';
			System.out.println("读取文件中的字符:");
			while(ch != '}') {
				ch = (char)fileReader.read();
				System.out.print(ch);
			}
			System.out.println("====文件读取完毕===");
			fileReader.close();
		}catch(Exception e) {
			System.out.println("系统异常:" + e.getMessage());
		}
	}
}
