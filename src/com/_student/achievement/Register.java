package com._student.achievement;

import java.io.FileOutputStream;
import java.util.Scanner;

//注册账号和设置密码
public class Register {
	public void setRegister(Scanner scr) {
		int account = (int) (Math.random() * 100000000);//随机生成八位账号
		System.out.println("您的账号为:" + account);
		String x = String.valueOf(account);
		System.out.println("请输入密码 ");
		String str = scr.nextLine();
		try {
			FileOutputStream fos = new FileOutputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\Student.txt", true);

			fos.write(x.getBytes("UTF-8"));
			fos.write(",".getBytes("UTF-8"));
			fos.write(str.getBytes("UTF-8"));
			fos.write("\n".getBytes("UTF-8"));
			System.out.println("写出完毕！");
			
			scr.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
