package com._01Basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class adds {
	public static void main(String[] args) {
		try {
			//查询文件内有多少学生信息
			FileInputStream fos = new FileInputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\tion.txt");
			byte[] fileBytes = fos.readAllBytes();
			String fileContent = new String(fileBytes, "UTF-8");
			System.out.println("删除指定学生");
			String s = fileContent;
			String[] temp =  s.split("\n"); 
			System.out.println(Arrays.deepToString(temp));
			System.out.println("输入需要删除的学生的下标 输入esc会主菜单");
			Scanner scr = new Scanner(System.in);
			//删除指定下标
			String[] deleteArray = new String[temp.length - 1];
			String delete = scr.nextLine();

			if("esc".equals(delete)) {
				System.out.println("结束");
				return;
			}else for(int i = 0;i <deleteArray.length;i++) {

				int x = Integer.valueOf(delete);

				if(i < x) {
					deleteArray[i] = temp[i];
				}else {
					deleteArray[i] = temp[i + 1];
				}
			}
			System.out.println(Arrays.deepToString(deleteArray));

			//输出流把删除后的重新写入文件
			FileOutputStream fo = new FileOutputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\tion.txt");
			for(int i = 0;i < deleteArray.length;i++) {
				
			fo.write(deleteArray[i].getBytes("UTF-8"));
			fo.write("\n".getBytes("UTF-8"));
			}
			System.out.println("写出完毕！");
			fos.close();

			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}