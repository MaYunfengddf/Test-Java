package com._01Basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//实现自增ID并输入到文件内 可以把运行结束的ID存到一个文档内 下次运行读取文档ID
public class test1 {
	public static int ID;
	public String name;

	public static void main(String[] args) {
		try {
		FileInputStream file = new FileInputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\ID.txt");
		ID = file.read();
		
		file.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		test1 t = new test1();
		t.setName("王");
		t.toString();
		t.output();
		System.out.println(t.toString());

		test1 x = t;
		x.setName("li");
		x.toString();
		x.output();
		System.out.println(t.toString());

		test1 i = t;
		i.setName("bai");
		i.toString();
		i.output();
		System.out.println(t.toString());

		test1 v = t;
		v.setName("bai");
		v.toString();
		v.output();
		System.out.println(t.toString());

		test1 b = t;
		b.setName("bai");
		b.toString();
		b.output();
		System.out.println(t.toString());
	}

	public  void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}

	public String toString(){
		return "学号" + ID +",名字" + getName();
	}

	public void output() {
		try {
			ID++;
			FileOutputStream fo = new FileOutputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\IDName.txt",true);
			fo.write(toString().getBytes("UTF-8"));
			fo.write("\n".getBytes("UTF-8"));
			
			FileOutputStream file = new FileOutputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\ID.txt");
			file.write(ID);
			
			
			file.close();
			fo.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
