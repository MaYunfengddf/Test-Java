package com.hello01kuaixue;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		try {
			File file = new File("asd.json");
			System.out.println("创建文件asd;json");
			System.out.println("是否创建成功;" + file.createNewFile());
			System.out.println("文件名是否为绝对路径 ：" + file.isAbsolute());
			System.out.println("文件名是否可读:" + file.canRead());
			System.out.println("修改文件名称为kls.sja:" + file.renameTo(new File("kls.sja")));
		}catch(Exception e) {
			System.out.println("系统发生异常:" + e.getMessage());
		}
	}
}
