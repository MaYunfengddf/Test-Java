package com.hello01kuaixue;

import java.io.File;

public class DirDemo {
	public static void main(String[] args){
		String dirName = "java";
		File file = new File (dirName);
		System.out.println("创建目录java,是否成功:" + file.mkdirs());
	}
}
