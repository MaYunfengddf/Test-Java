package com._student.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//set 学生信息输出输入  如果学生姓名存在报错 hashSet实现；

public class SetStudent {
	public static void main(String[] args) {
		StudentInformation stu = new StudentInformation();
		Scanner sca = new Scanner(System.in);
		Set<String> set = new HashSet<>();
		for(;;) {

			System.out.println("请输入学生名字 输入esc退出程序");
			String str1 = sca.nextLine();
			if("esc".equals(str1)) {
				System.out.println("程序结束");
				sca.close();
				break;
			}else {
				stu.setName(str1);
			}

			System.out.println("请输入学生生日 输入esc退出程序");
			String str2 = sca.nextLine();
			if("esc".equals(str2)) {
				System.out.println("程序结束");
				break;
			}else {
				stu.setBirthday(str2);
			}

			System.out.println("请输入学生性别 输入esc退出程序");
			String str3 = sca.nextLine();
			if("esc".equals(str1)) {
				System.out.println("程序结束");
				break;
			}else {
				stu.setGender(str3);
			}
			stu.setID();

			set.add(stu.toString());

			Iterator<String> itreator = set.iterator();//迭代器
			while(itreator.hasNext()) {
				System.out.println(itreator.next());
			}
		}
	}
}
