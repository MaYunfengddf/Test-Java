package com.hello01kuaixue;

import java.io.File;

public class DeleteDir {
	public static void main(String[] args) {
		File file = new File("java");
		System.out.println("创建文件夹java:" + file.mkdir());
		file = new File("java/dir");
		System.out.println("创建文件夹java/dir;" + file.mkdir());
		File folder = new File("java");
		deleteFolder(folder);
	}
	public static void deleteFolder(File folder) {
		File[] files = folder.listFiles();
		if(files !=null) {
			for(File f: files) {
				if(f.isDirectory()) {
					deleteFolder(f);
				}else {
					System.out.println("删除文件:" + f.getName() + "是否成功:" + f.delete());
				}
			}
		}
		System.out.println("删除文件:" + folder.getName() + "是否成功:" +folder.delete());
	}
}
