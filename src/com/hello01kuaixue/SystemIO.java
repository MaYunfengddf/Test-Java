package com.hello01kuaixue;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SystemIO {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("请输入字符串，按回车键结束");
			System.out.println("输出字符串为:" + reader.readLine());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
