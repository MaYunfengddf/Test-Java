package com.helloworld.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Test79 {
	public static void main(String[] args) throws Exception{
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection( "jdbc:h2:tcp://localhost:9092/D:/H2/01kuaixue","01","123456");
		Statement set = conn.createStatement();
		String sql = "CREATE TABLE XUE (ID IDENTITY PRIMARY KEY, NAME VARCHAR, PHONE VARCHAR, AGE INT)";
		System.out.println("要创建xue表sql语句为");
		set.execute("drop table if exists xue");
		System.out.println(sql);
		set.executeUpdate(sql);
		
		String a= ("insert into xue (name ,phone,age) values(?,?,?)");
		PreparedStatement pre = conn.prepareStatement(a);
		pre.setString(1,"peter");
		pre.setString(2,"13888888");
		pre.setInt(3, 30);
		System.out.println("要插入的为");
		pre.executeUpdate();
		
		String y= ("insert into xue (name ,phone,age) values(?,?,?)");
		PreparedStatement p = conn.prepareStatement(y);
		p.setString(1,"pd");
		p.setString(2,"1387777777");
		p.setInt(3, 39);
		System.out.println("要插入的为");
		p.executeUpdate();
		
		System.out.println("age-1");
		PreparedStatement pr = conn.prepareStatement("update xue set age = age - 1");
		int x = pr.executeUpdate();
		System.out.println("修改" + x);
		conn.close();
		set.close();
	}
}
