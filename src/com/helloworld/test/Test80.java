package com.helloworld.test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test80 {
	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection( "jdbc:h2:tcp://localhost:9092/D:/H2/01kuaixue","01","123456");
			Statement set = conn.createStatement();
			set.execute("drop table if exists xue01");

			String sql = "CREATE TABLE XUE01 (ID IDENTITY PRIMARY KEY, MD5 VARCHAR(100), encryption VARCHAR(1000))";
			System.out.println("要创建xue01表sql语句为:");
			System.out.println(sql);
			set.executeUpdate(sql);
			System.out.println("创建成功!");
			
			for(int i = 0;;i++) {
				Scanner sca = new Scanner(System.in);
				System.out.println("请输入需要MD5加密的内容,输入esc退出程序");
				String str = sca.nextLine();
				if("esc" .equals(str)) {
					conn.close();
					set.close();
					System.out.println("程序结束!");
					break;
				}else {

					MessageDigest md = MessageDigest.getInstance("MD5");
					md.update(str.getBytes());
					System.out.println(str + "MD5加密后内容为:");
					String a = new BigInteger(1,md.digest()).toString(16);
					System.out.println(a);

					set.executeUpdate("INSERT INTO XUE01(MD5,ENCRYPTION) VALUES('" + str + "','" + a + "')");
					System.out.println("数据库存入成功!");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
