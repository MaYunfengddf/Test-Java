package com.hello01kuaixue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDome {
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			FileReader fileReader = new FileReader("data.txt");
			reader = new BufferedReader(fileReader);
			String line;
			try {
				int i = 0;
				while((line = reader.readLine()) != null){
					System.out.println("读取文件第" + i + "行数据为:" + line);
					i++;
				}
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			if(reader != null) {
				try {
					reader.close();
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
