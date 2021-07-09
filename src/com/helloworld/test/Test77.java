package com.helloworld.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test77 {
	private static final String JDBC_URL = "jdbc:h2:tcp://localhost:9092/D:/H2/01kuaixue";
	private static final String USER = "01";
	private static final String PASSWORD = "123456";
	private static final String DRIVER_CLASS = "org.h2.Driver";
	public static void main(String[] args) throws Exception{
		Class.forName(DRIVER_CLASS);
		Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
		Statement sta = conn.createStatement();
		sta.execute("drop table if exists kuaixue");
		sta.execute("create table kuaixue (id int primary key,name varchar)");
		//chinese语文mathematics数学English英语
		for(int i = 1; i < 4; i++){
			Scanner sca = new Scanner(System.in);
			System.out.println("输入以 学生姓名 -- 语文 -- 数学 -- 英语成绩--并用英文逗号隔开");
			String str = sca.nextLine();
			sta.executeUpdate("insert into kuaixue values("+ i + ",'" + str + "')");

			/*sta.executeUpdate("insert into kuaixue values("+ i +",'雄安')");
			sta.executeUpdate("insert into kuaixue values("+ i + ",'小黑')");
			sta.executeUpdate("insert into kuaixue values("+ i + ",'小白')");
			sta.executeUpdate("insert into kuaixue values("+ i + ",'太白')");
			sta.executeUpdate("insert into kuaixue values("+ i +",'小李')");*/

			sta.executeUpdate("update kuaixue set name = '楼下' where id = 2");
			sta.executeUpdate("delete from kuaixue where id = 4");
		}
		ResultSet res = sta.executeQuery("select * from kuaixue");
		while(res.next()) {
			System.out.print("ID:" + res.getString("id"));
			System.out.println("   Name:" + res.getString("name"));
		}
		conn.close();
		sta.close();
	}
}
