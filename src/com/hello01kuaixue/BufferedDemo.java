package com.hello01kuaixue;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedDemo {
	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream("data.txt");
			BufferedInputStream bufferInput = new BufferedInputStream(input);
			String content = null;
			byte[] buffer = new byte[1024];
			int flag = 1;
			while((flag = bufferInput.read(buffer)) != -1) {
				content += new String(buffer,0,flag);
			}
			System.out.println("输出缓存内容为:" );
			System.out.println(content);
			bufferInput.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
