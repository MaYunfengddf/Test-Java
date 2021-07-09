package com._student.achievement;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class StudentPassword extends Student{
	static {
		try {
			FileInputStream f = new FileInputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\StudentID.txt");
			
			ID = f.read();
			f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		StudentPassword stu = new StudentPassword();
		for(;;) {

			Scanner scr = new Scanner(System.in);
			System.out.println("欢迎使用xxx系统");
			System.out.println("新用户输入reg创建账号和密码 或输入esc退出程序");
			System.out.println("老用户输入sig登录  或输入esc退出程序 输入rev进入修改和查询页面 ");
			String str = scr.nextLine();
			if("esc".equals(str)) {
				System.out.println("程序结束");
				scr.close();
				break;
			}
			switch(str) {
			case "reg":
				stu.password(scr);//新建账号密码
				break;
			case"sig": 
				stu.signIn(scr,stu);//登录账号密码
				break;
			case"rev":
				stu.Revision(scr,stu);//删除账号密码
				break;
			default:
				System.out.println(str + "......请重新输入或输入esc 来选择菜单或退出程序......");
				break;
			}
		}
	}

	//注册
	public void password(Scanner scr) {
		int account = (int) (Math.random() * 100000000);//随机生成八位账号
		System.out.println("您的账号为:" + account);
		String x = String.valueOf(account);
		System.out.println("请输入密码 ");
		String str = scr.nextLine();


		//输出内容的账号和密码

		try {
			FileOutputStream fos = new FileOutputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\Student.txt", true);

			fos.write(x.getBytes("UTF-8"));
			fos.write(",".getBytes("UTF-8"));
			fos.write(str.getBytes("UTF-8"));
			fos.write("\r\n".getBytes("UTF-8"));
			System.out.println("写出完毕！");
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//登录
	public void signIn(Scanner scr,StudentPassword stu) {
		try {
			FileInputStream f = new FileInputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\Student.txt");

			System.out.println("请输入账号和密码 中间以英文逗号隔开");
			String str = scr.nextLine();

			//获取文件全部账号密码
			byte[] fileBytes = f.readAllBytes();
			String fileContent = new String(fileBytes, "UTF-8");

			System.out.print(fileContent);
			String[] s = fileContent.split("\\r\\n");
			for(int i = 0;i < s.length;i++) {
				if(s[i].equals(str)) {
					stu.success(scr);//密码账号正确进入
					f.close();
					return;
				}else if(i == s.length - 1) {
					stu.error();//密码账号错误重新输入
					f.close();
					return;
				}
			}
			f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	//修改密码和查询调用方法
	public void Revision(Scanner scr,StudentPassword stu) {
		for(;;) {
			System.out.println("输入ddd删除账号密码 输入qqq查询账号密码 输入esc返回主菜单");
			String str = scr.nextLine();
			switch(str) {
			case"qqq":
				stu.query(scr);
				break;
			case"ddd":
				stu.delete(scr);
				break;
			case"esc":
				return;
			default:
				System.out.println(str + "......请重新输入或输入esc 来选择菜单或退出程序......");
				break;
			}
		}
	}

	//删除账号密码
	public void delete(Scanner scr) {
		System.out.println("sss");
		try {
			FileInputStream f = new FileInputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\Student.txt");

			System.out.println("请输入账号和密码 中间以英文逗号隔开");
			byte[] fileBytes = f.readAllBytes();
			String fileContent = new String(fileBytes, "UTF-8");
			System.out.println("删除指定学生");
			String s = fileContent;
			String[] temp =  s.split("\n"); 
			System.out.println(Arrays.deepToString(temp));
			System.out.println("输入需要删除的学生的下标 输入esc会主菜单");

			//删除指定下标
			String[] deleteArray = new String[temp.length - 1];
			String delete = scr.nextLine();
			if("esc".equals(delete)) {
				f.close();
				return;
			}else for(int i = 0;i <deleteArray.length;i++) {

				int x = Integer.valueOf(delete);

				if(i < x) {
					deleteArray[i] = temp[i];
				}else {
					deleteArray[i] = temp[i + 1];
				}
			}
			System.out.println(Arrays.deepToString(deleteArray));

			//输出流把删除后的重新写入文件
			FileOutputStream fo = new FileOutputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\Student.txt");
			for(int i = 0;i < deleteArray.length;i++) {

				fo.write(deleteArray[i].getBytes("UTF-8"));
				fo.write("\n".getBytes("UTF-8"));
			}
			System.out.println("写出完毕！");

			fo.close();
			f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	//查询账号密码
	public void query(Scanner scr) {
		System.out.println("查询录入的学生成绩");
		try {
			FileInputStream f = new FileInputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\Student.txt");
			byte[] fileBytes = f.readAllBytes();

			String fileContent = new String(fileBytes, "UTF-8");
			System.out.print(fileContent);
			System.out.println("----------查询结束----------");

			f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	//验证成功进入
	public void success(Scanner scr ) {
		System.out.println("aaaaaa");
		for(;;) {
			System.out.println("输入名字 语数英 中间以逗号隔开 输入esc返货主菜单");
			System.out.println("输入que查询录入的学生成绩 输入del删除指定学号的所有内容");
			String str = scr.nextLine();
			if("esc".equals(str)) {

				break;
			}
			//查询学生成绩
			if("que".equals(str)){
				System.out.println("查询录入的学生成绩");
				try {
					FileInputStream fos = new FileInputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\Student information.txt");
					byte[] fileBytes = fos.readAllBytes();
					String fileContent = new String(fileBytes, "UTF-8");
					System.out.print(fileContent);
					System.out.println("----------查询结束----------");

					fos.close();
				}catch(Exception e) {
					e.printStackTrace();
				}

				//删除学生
			}else if("del".equals(str)) {
				try {
					//查询文件内有多少学生信息
					FileInputStream fos = new FileInputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\Student information.txt");
					byte[] fileBytes = fos.readAllBytes();
					String fileContent = new String(fileBytes, "UTF-8");
					System.out.println("删除指定学生");
					String s = fileContent;
					String[] temp =  s.split("\n"); 
					System.out.println(Arrays.deepToString(temp));
					System.out.println("输入需要删除的学生的下标 输入esc会主菜单");

					//删除指定下标
					String[] deleteArray = new String[temp.length - 1];
					String delete = scr.nextLine();

					if("esc".equals(delete)) {
						fos.close();
						return;
					}else { 
						for(int i = 0;i <deleteArray.length;i++) {
	
							int x = Integer.valueOf(delete);
	
							if(i < x) {
								deleteArray[i] = temp[i];
							}else {
								deleteArray[i] = temp[i + 1];
							}
						}
					}
					System.out.println(Arrays.deepToString(deleteArray));

					//输出流把删除后的重新写入文件
					FileOutputStream fo = new FileOutputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\Student information.txt");
					for(int i = 0;i < deleteArray.length;i++) {

						fo.write(deleteArray[i].getBytes("UTF-8"));
						fo.write("\n".getBytes("UTF-8"));
					}
					System.out.println("写出完毕！");
					fos.close();

					fo.close();
				}catch(Exception e) {
					e.printStackTrace();
				}

				//输出流
			}else for(;;) {
				try {
					ID++;
					FileOutputStream file = new FileOutputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\StudentID.txt");
					file.write(ID);
					
					String[] st = str.split(",");
					Student s = new Student();
					int in = Integer.valueOf(st[1]);//语文转为整形
					int x = Integer.valueOf(st[2]);//数学转为整形
					int w = Integer.valueOf(st[3]);//英语转为整形
					s.setName(st[0]);
					s.setChinese(in);
					s.setMathematics(x);
					s.setEnglish(w);
					System.out.println(s.toString());


					FileOutputStream fos = new FileOutputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\Student information.txt", true);
					String ww = s.toString();
					String[] ss = ww.split(",");
					fos.write((ss[0] + "\n").getBytes("UTF-8"));
					System.out.println("写出完毕！");
					file.close();
					fos.close();
				}catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(e.getClass().getName());
					System.out.println("----------------");
					System.out.println("英文逗号或者位数不对 请重新输入");
					System.out.println("----------------");
					System.out.println(e.getMessage());

				}catch (Exception e) {
					System.out.println(e.getClass().getName());
					System.out.println(e.getMessage());
				}
				break;
			}
		}
	}

	//验证失败进入
	public void error() {
		System.out.println("密码或账号错误");
		System.out.println("输入esc返回主菜单 返回主菜单后可以重新输入密码账号");
		for(;;) {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			if("esc".equals(str)) {
				break;
			}
			switch(str) {
			default:
				System.out.println(str + "......请重新输入esc 来选来进入主菜单......");
				break;
			}
			sc.close();
		}
	}
}