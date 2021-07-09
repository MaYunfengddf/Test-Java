package com.teaching;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *  学生信息处理器
 * @author Administrator
 *
 */
public class StudentInfoControl {
	
	// 学生信息集合
	private Map<String, StudentInfo> studentInfoMap = new HashMap<String, StudentInfo>();
	
	/**
	 * 学生信息处理器构造方法
	 * @throws IOException
	 */
	public StudentInfoControl() throws IOException {
		loadFileData();
	}
	
	
	/**
	 * 学生信息维护
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */
	public void studentInfosFunction(Scanner scan) throws UnsupportedEncodingException, IOException {
		boolean backFlag = false;
		for(;!backFlag;) {
			System.out.println("------------------------------");
			System.out.println("0、保存并返回上层菜单");
			System.out.println("1、显示所有学生信息");
			System.out.println("2、新增学生信息");
			System.out.println("3、修改学生信息");
			System.out.println("4、删除学生信息");
			System.out.println("------------------------------");

			String command =  scan.nextLine();
			switch(command) {
				case "0":
					saveDate();
					backFlag = true;
					break;
				case "1":
					showStudentInfo(scan); break;
				case "2":
					addStudentInfo(scan); break;
				case "3":
					updateStudentInfo(scan); break;
				case "4":
					deleteStudentInfo(scan); break;
				default :
					System.out.println("暂不支持该功能！");
			}
		}
		
	}


	/**
	 * 读取文件数据
	 * @throws IOException 
	 */
	private void loadFileData() throws IOException {
		// 加载学生信息数据
		String studentInfoFileDate = FileUtil.read(StudentControl.FILE_PATH, StudentControl.STUDENT_INFO_FILE);
		if(null != studentInfoFileDate && studentInfoFileDate.trim().length() > 0) {
			String[] studentInfoStrArray = studentInfoFileDate.split("\r\n");
			for(String studentInfoStr : studentInfoStrArray) {
				StudentInfo studentInfo = StudentInfo.load(studentInfoStr);
				studentInfoMap.put(studentInfo.getStudentNo(), studentInfo);
			}
		}
		System.out.println(String.format("日志：学生信息数据量[%s]", studentInfoMap.size()));
	}
	
	
	/**
	 * 保存并返回上层菜单
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */
	private void saveDate() throws UnsupportedEncodingException, IOException {
		StringBuffer fileData = new StringBuffer();
		for(StudentInfo studentInfo: studentInfoMap.values()) {
			fileData.append(studentInfo.toString()).append("\r\n");
		}
		
		FileUtil.write(StudentControl.FILE_PATH, StudentControl.STUDENT_INFO_FILE, fileData.toString());
	}
	
	/**
	 * 显示所有学生信息
	 */
	private void showStudentInfo(Scanner scan) {
		System.out.println(" 学号\t\t| 语文成绩\t\t| 数学成绩\t\t| 英语成绩");
		for(StudentInfo studentInfo: studentInfoMap.values()) {
			System.out.println(studentInfo.show());
		}
		System.out.println("输入回车键返回菜单：");
		scan.nextLine();
	}
	
	/**
	 * 增加学生信息
	 * @param scan
	 */
	private void addStudentInfo(Scanner scan) {
		for(;;) {
			System.out.println("请输入学生信息，如：学号,姓名,生日,性别；（ESC结束录入）");
			
			String studentInfoStr = scan.nextLine();
			if("ESC".equals(studentInfoStr.toUpperCase())) {
				return ;
			}

			String[] studentInfoArray =  studentInfoStr.split(",");
			StudentInfo studentInfo = new StudentInfo();
			studentInfo.setStudentNo(studentInfoArray[0]);
			studentInfo.setName(studentInfoArray.length > 1 ? studentInfoArray[1] : "");
			studentInfo.setBirthDay(studentInfoArray.length > 2 ? studentInfoArray[2] : "");
			studentInfo.setGender(studentInfoArray.length > 3 ? studentInfoArray[3] : "");
			
			studentInfoMap.put(studentInfo.getStudentNo(), studentInfo);
		}
	}
	
	/**
	 * 修改学生信息
	 * @param scan
	 */
	private void updateStudentInfo(Scanner scan){
		System.out.println("请输入要修改的学生学号：");
		
		String studentNo = scan.nextLine();
		StudentInfo studentInfo = studentInfoMap.get(studentNo);

		if(null != studentInfo) {
			System.out.println(" 学号\t\t| 姓名\t\t| 生日\t\t| 性别");
			System.out.println(studentInfo.show());
			
			System.out.println("请输入修改信息，如：姓名,生日,性别");
			String studentInfoStr = scan.nextLine();

			String[] studentInfoArray =  studentInfoStr.split(",");
			studentInfo.setName(studentInfoArray[0]);
			studentInfo.setBirthDay(studentInfoArray.length > 1 ? studentInfoArray[1] : "");
			studentInfo.setGender(studentInfoArray.length > 2 ? studentInfoArray[2] : "");
			System.out.println("修改成功");
		} else {
			System.out.println("学生信息不存在！");
		}
	}
	
	/**
	 * 删除学生信息
	 * @param scan
	 */
	private void deleteStudentInfo(Scanner scan) {
		System.out.println("请输入要删除的学生学号：");
		
		String studentNo = scan.nextLine();
		StudentInfo studentInfo = studentInfoMap.get(studentNo);

		if(null != studentInfo) {
			System.out.println(" 学号\t\t| 姓名\t\t| 生日\t\t| 性别");
			System.out.println(studentInfo.show());

			System.out.println("即将删除以上信息，确认-Y，取消-N");
			String command = scan.nextLine();
			if("Y".equals(command.toUpperCase())) {
				studentInfoMap.remove(studentNo);
				System.out.println("删除成功");
			}
			
		} else {
			System.out.println("要删除的学生信息不存在！");
		}
	}
	
	
}
