package com._student.achievement;

import java.io.FileInputStream;
import java.util.Scanner;

//获取文件内账号密码 并验证
public class SignIn {
	public void setSignIn(Scanner scr) {
		StudentPassword stu = new StudentPassword();
		try {
			FileInputStream f = new FileInputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\Student.txt");

			System.out.println("请输入账号和密码 中间以英文逗号隔开");
			String str = scr.nextLine();

			//获取文件全部账号密码
			byte[] fileBytes = f.readAllBytes();
			String fileContent = new String(fileBytes, "UTF-8");

			System.out.print(fileContent);
			String[] s = fileContent.split("\\n");

			if(s[s.length - 1].equals(str) || s[s.length - 2].equals(str)) {
				Success success = new Success();
				success.setSuccess(scr);//密码账号正确进入
				f.close();
				return;
			}
			Fail  fail = new Fail();
			fail.error();//密码账号错误重新输入
			f.close();
			return;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
