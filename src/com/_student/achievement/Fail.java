package com._student.achievement;

import java.util.Scanner;

public class Fail {
	public void error() {
		Scanner sc = new Scanner(System.in);
		System.out.println("密码或账号错误");
		System.out.println("输入esc返回主菜单 返回主菜单后可以重新输入密码账号");
		for(;;) {
			
			String str = sc.nextLine();
			if("esc".equals(str)) {
				sc.close();
				break;
			}
			switch(str) {
			default:
				System.out.println(str + "......请重新输入esc 来选来进入主菜单......");
				break;
			}
		}
	}
}
