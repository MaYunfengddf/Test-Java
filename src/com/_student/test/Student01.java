package com._student.test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//list 输入·学生信息 和输入 要放在一个student info对象里面 输学号姓名生日性别  list    java bean  arrayList linkedList  学号要自己生成不能重复

public class Student01 extends StudentInformation{
	static {
		try {
			FileInputStream fileInID = new FileInputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\test\\student_ID.txt");
			ID = fileInID.read();

			fileInID.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Student01 stu = new Student01();
		System.out.println("欢迎使用111系统");

		for(;;) {
			Scanner sca = new Scanner(System.in);
			System.out.println("输入stu录入信息");
			System.out.println("输入que查询信息");
			System.out.println("输入esc退出程序");
			String str= sca.nextLine();
			switch(str){
			case"stu":
				stu.Input(sca);
				break;
			case"que":
				Query query = new Query();
				query.query(sca);
				break;
			case"esc":
				System.out.println("结束程序");
				sca.close();
				return;
			default:
				System.out.println(str + "为定义 请查询输入");
			}
		}

	}

	public void Input(Scanner sca) {
		StudentInformation inf = new StudentInformation();
		inf.setID();
		List<StudentInformation> list = new ArrayList<StudentInformation>();
		for(;;) {
			inf.setID();

			System.out.println("请输入学生姓名 输入esc返回主菜单");
			String strName = sca.nextLine();

			System.out.println("请输入学生生日 输入esc返回主菜单");
			String strBirthday = sca.nextLine();

			System.out.println("请输入学生性别 输入esc返回主菜单");
			String strgender = sca.nextLine();

			if("esc".equals(strName)||"esc".equals(strBirthday)||"esc".equals(strgender)) {     //输入esc中断写入 返回主菜单
				FileOutput out = new FileOutput();
				out.setFileOutput(list);
				System.out.println("程序结束");
				return;
			}else {
				StudentInformation ss = new StudentInformation(strName,strBirthday,strgender);  //判断成功写入list集合
				list.add(ss);
			}

			for(StudentInformation lis : list) {
				System.out.println("main方法内遍历" + lis);
			}
		}


	}
}
