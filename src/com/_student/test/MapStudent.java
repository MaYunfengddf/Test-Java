package com._student.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//Map  输入学生信息后可以输需要查询的学生信息 存在文件里 输入

public class MapStudent {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		for(;;) {
			System.out.println("输入esc退出程序 输入que查询学生信息  输入stu录入学生");
			String str = sca.nextLine();
			Map<String,String> hashMap = new HashMap<>();//键：名字 值 生日性别
			Map<Integer, Map<String, String>> hashMap1 = new HashMap<>();//键： ID 值：名字生日性别

			switch(str) {
			case"esc":
				System.out.println("程序结束");
				sca.close();
				return;
			case"que":
				Query(sca,hashMap,hashMap1);
				break;
			case"stu":
				Map(sca,hashMap,hashMap1);
				break; 
			default:
				System.out.println(str + "未定义 请重新输入");
			}
		}
	}

	public static void Map(Scanner sca,Map<String,String> hashMap,Map<Integer, Map<String, String>> hashMap1) {
		StudentInformation stu = new StudentInformation();//


		for(;;) {
			System.out.println("请输入学生名字");
			String str1 = sca.nextLine();
			if("esc".equals(str1)) {
				System.out.println("程序结束");
				break;
			}else {
				stu.setName(str1);
			}

			System.out.println("请输入学生生日");
			String str2 = sca.nextLine();
			if("esc".equals(str2)) {
				System.out.println("程序结束");
				break;
			}else {
				stu.setBirthday(str2);
			}

			System.out.println("请输入学生性别");
			String str3 = sca.nextLine();
			if("esc".equals(str3)) {
				System.out.println("程序结束");
				break;
			}else {
				stu.setGender(str3);
			}

			//键：学生名字  值：学生生日和性别

			hashMap.put(stu.getName(), stu.getBirthday() + stu.getGender());

			Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();//迭代以学生键值
			while(it.hasNext()) {
				Map.Entry<String, String> entry = it.next();
				System.out.println("迭代以学生键值" + entry.getKey() + "  " + entry.getValue());
			}

			//键：学生学号 值：学生名字生日性别

			stu.setID();
			hashMap1.put(stu.getID(), hashMap);

			Iterator<Entry<Integer, Map<String, String>>> it1 = hashMap1.entrySet().iterator();//迭代以学号键值
			while(it1.hasNext()) {
				Entry<Integer,Map<String,String>> entry = it1.next();
				System.out.println("迭代以学号键值" + entry.getKey() + "  " + entry.getValue());
			}
		}
	}

	public static void Query(Scanner sca,Map<String,String> hashMap,Map<Integer, Map<String, String>> hashMap1) {
		System.out.println("使用查询功能");
		System.out.println("可以输入queID选择以ID查询学生信息 或以queName查询学生信息 输入esc返回主菜单");
		String str1 = sca.nextLine();
		switch(str1) {
		case"queID":
			queryID(sca,hashMap1);
			break;
		case"queName":
			queryName(sca,hashMap);
			break;
		case"esc":
			System.out.println("返回主菜单");
			break;
		default:
			System.out.println(str1 + "为定义,请查询输入需要查询的信息");

		}
	}

	public static void queryID(Scanner sca,Map<Integer, Map<String, String>> hashMap1) {
		System.out.println("输入需要查询的ID");
		String str = sca.nextLine();
		
		if(hashMap1.containsKey(str)) {
			Iterator<Entry<Integer, Map<String, String>>> it1 = hashMap1.entrySet().iterator();
			while(it1.hasNext()) {
				Entry<Integer,Map<String,String>> entry = it1.next();
				System.out.println("迭代以学号键值" + entry.getKey() + "  " + entry.getValue());
			}
			System.out.println("未找到");

		}

	}

	public static void queryName(Scanner sca,Map<String,String> hashMap) {
		System.out.println("输入需要查询的名字");
		String str = sca.nextLine();

		if(hashMap.containsKey(str)) {
			Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();//迭代以学生键值
			while(it.hasNext()) {
				Map.Entry<String, String> entry = it.next();
				System.out.println("迭代以学生键值" + entry.getKey() + "  " + entry.getValue());
			}
			System.out.println("未找到");

		}
	}
}
