package com._student.achievement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		for(;;) {
			System.out.println("欢迎使用xxxxxx系统");
			System.out.println("新用户输入reg创建账号和密码 或输入esc退出程序");
			System.out.println("老用户输入sig登录  或输入esc退出程序");
			String str = scr.nextLine();
			if("esc".equals(str)) {
				System.out.println("程序结束");
				scr.close();
				break;
			}
			switch(str) {
			case "reg":
				Register reg = new Register();
				reg.setRegister(scr);//新建账号密码
				break;
			case"sig": 
				SignIn sig = new SignIn();
				sig.setSignIn(scr);//登录账号密码
				break;
			default:
				System.out.println(str + "......请重新输入或输入esc 来选择菜单或退出程序......");
				break;
			}
		}
	}
}
