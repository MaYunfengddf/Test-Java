package com._student.achievement;

import java.io.FileOutputStream;
import java.util.Scanner;

//输出流 把命令窗口学生信息录入文件
public class Success {
	public void setSuccess(Scanner scr ) {
		for(;;) {
			System.out.println("输入学号名字语数英中间以逗号隔开 输入esc返货主菜单");
			System.out.println("输入que查询录入的学生成绩 输入del删除指定学号的所有内容");
			String str = scr.nextLine();
			if("esc".equals(str)) {

				break;
			}

			for(;;) {
				String[] st = str.split(",");
				Student s = new Student();
				int i = Integer.valueOf(st[0]);//学号转为整形
				int in = Integer.valueOf(st[2]);//语文转为整形
				int x = Integer.valueOf(st[3]);//数学转为整形
				int w = Integer.valueOf(st[4]);//英语转为整形
				s.setNumber(i);
				s.setName(st[1]);
				s.setChinese(in);
				s.setMathematics(x);
				s.setEnglish(w);
				System.out.println(s.toString());
				try {
					FileOutputStream fos = new FileOutputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\Student information.txt", true);
					String ww = s.toString();
					String[] ss = ww.split(",");
					fos.write((ss[0] + "\n").getBytes("UTF-8"));
					System.out.println("写出完毕！");
					
					scr.close();
					fos.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}
}
