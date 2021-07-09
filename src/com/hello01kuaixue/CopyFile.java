package com.hello01kuaixue;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
	public static void main(String[] args) {
		try {
			long beginTime = System.currentTimeMillis();
			FileInputStream fileInput = new FileInputStream("data.txt");
			BufferedInputStream input = new BufferedInputStream(fileInput);
			FileOutputStream fileOutput = new FileOutputStream("copyData.txt");
			BufferedOutputStream output = new BufferedOutputStream(fileOutput);
			int size = 0;
			byte[] buffer = new byte[10240];
			while ((size = input.read(buffer)) != -1) {
				output.write(buffer,0,size);
			}
			output.flush();
			input.close();
			output.close();
			System.out.println("复制文件完毕---耗时" + (System.currentTimeMillis() - beginTime) + "毫秒");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
