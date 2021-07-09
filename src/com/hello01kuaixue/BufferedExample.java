package com.hello01kuaixue;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedExample {
	public static void main(String[] args) {
		try {
			FileOutputStream output = new FileOutputStream("data.txt");
			BufferedOutputStream bos = new BufferedOutputStream(output);
			String content = "缓存测试流测试数据1234567890";
			bos.write(content.getBytes(),0,content.getBytes().length);
			bos.flush();
			bos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
