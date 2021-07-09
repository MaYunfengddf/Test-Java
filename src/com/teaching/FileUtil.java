package com.teaching;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 文件工具类
 * @author Administrator
 *
 */
public class FileUtil {

	/**
	 * 读取指定的文件为字符串
	 * @param path
	 * @param fileName
	 * @return
	 * @throws IOException 
	 */
	public static String read(String path, String fileName) throws IOException {
		File file = new File(path + File.separatorChar + fileName);
		
		// 检查文件是否存在，不存在就新建
		if(!file.exists()){
			file.createNewFile();
		}
		
		// 读取文件
		FileInputStream input = new FileInputStream(file);
		ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
		
		byte[] b = new byte[1024];
		for(int n; (n = input.read(b)) > 0;) {
			byteOutput.write(b, 0, n);
		}
		
		String fileData = byteOutput.toString("UTF-8");
		
		byteOutput.close();
		input.close();
		return fileData;
	}
	
	/**
	 * 把指定数据写入文件
	 * @param path
	 * @param fileName
	 * @param fileData
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */
	public static void write(String path, String fileName, String fileData) throws UnsupportedEncodingException, IOException {
		File file = new File(path + File.separatorChar + fileName);
		
		// 检查文件是否存在，存在就删除
		if(file.exists()) {
			file.delete();
		}
		
		FileOutputStream output = new FileOutputStream(file);
		output.write(fileData.getBytes("UTF-8"));
		output.flush();
		output.close();
	}
	
}
