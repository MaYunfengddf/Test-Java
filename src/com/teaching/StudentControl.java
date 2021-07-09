package com.teaching;

import java.util.Scanner;

/**
 * 学生信息维度系统控制类
 * @author Administrator
 *
 */
public class StudentControl {
	
	// 文件路径
	public static final String FILE_PATH = "D:/teaching/StudentTest";
	// 账户信息文件
	public static final String ACCOUNT_FILE = "AccountFile.stu";
	// 学生信息文件
	public static final String STUDENT_INFO_FILE = "StudentInfoFile.stu";
	// 学生成绩文件
	public static final String STUDENT_GRADE_FILE = "StudentGradeFile.stu";
	
	
	public static void main(String[] args) {
		try {
			System.out.println("系统启动中……");

			// 1、加载文件信息
			AccountControl accountControl = new AccountControl();
			StudentInfoControl studentInfoControl = new StudentInfoControl();
			StudentGradeControl studentGradeControl = new StudentGradeControl();
			
			// 2、登录系统
			System.out.println("欢迎使用学生信息维护系统！！！");
			Scanner scan = new Scanner(System.in);
			boolean loginFlag = accountControl.login(scan);
			
			// 3、一级功能菜单
			for(;loginFlag;) {
				System.out.println("==============================");
				System.out.println("0、退出");
				System.out.println("1、学生信息维护");
				System.out.println("2、学生成绩维护");
				System.out.println("==============================");
				
				String command =  scan.nextLine();
				switch(command) {
					case "0":
						loginFlag = false; break; // 退出
					case "1":
						studentInfoControl.studentInfosFunction(scan); break; // 二级功能菜单
					case "2":
						studentGradeControl.studentGradesFunction(scan); break; // 二级功能菜单
					default :
						System.out.println("暂不支持该功能！");
				}
			}
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
