package com.teaching;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 学生成绩控制器
 * @author Administrator
 *
 */
public class StudentGradeControl {

	// 学生成绩集合
	private Map<String, StudentGrade> studentGradeMap = new HashMap<String, StudentGrade>();

	/**
	 * 学生成绩控制器构造方法
	 * @throws IOException
	 */
	public StudentGradeControl() throws IOException {
		loadFileData();
	}

	/**
	 * 学生成绩维护
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */
	public void studentGradesFunction(Scanner scan) throws UnsupportedEncodingException, IOException {
		boolean backFlag = false;
		for(;!backFlag;) {
			System.out.println("----------------------");
			System.out.println("学生成绩维护功能");
			System.out.println("0,保存并退出");
			System.out.println("1，查询学生成绩");
			System.out.println("2，添加学生成绩");
			System.out.println("3，修改学生成绩");
			System.out.println("4，删除学生成绩");
			System.out.println("----------------------");
			String str = scan.nextLine();
			switch(str) {
			case"0":
				saveDate();
				backFlag = true;
				break;
			case"1":
				inquireStudentsGrades(scan);
				break;

			case"2":
				addToStudentsGrades(scan);
				break;
			case"3":
				modifyStudentsGrades(scan);
				break;
			case"4":
				deleteStudentsGrades(scan);
				break;
			default:
				System.out.println("暂不支持该功能！");
			}
		}

	}


	/**
	 * 读取文件数据
	 * @throws IOException 
	 */
	private void loadFileData() throws IOException {
		// 加载学生成绩数据
		String studentGradeFileDate = FileUtil.read(StudentControl.FILE_PATH, StudentControl.STUDENT_GRADE_FILE);
		if(null != studentGradeFileDate && studentGradeFileDate.trim().length() > 0) {
			String[] studentGradeStrArray = studentGradeFileDate.split("\r\n");
			for(String studentGradeStr : studentGradeStrArray) {
				StudentGrade studentGrade = StudentGrade.load(studentGradeStr);
				studentGradeMap.put(studentGrade.getStudentNo(), studentGrade);
			}
		}

		System.out.println(String.format("日志：学生成绩数据量[%s]", studentGradeMap.size()));
	}


	/**
	 * 保存并退出
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */
	private void saveDate() throws UnsupportedEncodingException, IOException {
		StringBuffer fileData = new StringBuffer();
		for(StudentGrade studentGrade: studentGradeMap.values()) {
			fileData.append(studentGrade.toString()).append("\r\n");
		}

		FileUtil.write(StudentControl.FILE_PATH, StudentControl.STUDENT_GRADE_FILE, fileData.toString());
	}

	/**
	 * 查询学生成绩
	 * @param scan
	 */
	private void inquireStudentsGrades(Scanner scan) {
		System.out.println(" 学号\t| 语文\t| 英语\t| 数学");
		for(StudentGrade studentGrade : studentGradeMap.values()) {
			System.out.println(studentGrade.show());
		}
		System.out.println("按回车键返回");
		scan.nextLine();
	}

	/**
	 * 添加学生成绩
	 * @param scan
	 */
	public void addToStudentsGrades(Scanner scan) {
		for(;;) {
			System.out.println("请输入学生成绩 以学号,语文,英语,数学形式输入 输入esc返回");

			String achievement = scan.nextLine();
			if("ESC".equals(achievement.toUpperCase())) {
				return;
			}

			String[] studentInfoArray =  achievement.split(",");
			StudentGrade studentGrade = new StudentGrade();

			studentGrade.setStudentNo(studentInfoArray[0]);
			studentGrade.setChinese(studentInfoArray.length > 1 ?  Float.valueOf(studentInfoArray[1]) : 0.0F);
			studentGrade.setEnglish(studentInfoArray.length > 2 ?  Float.valueOf(studentInfoArray[2]) : 0.0F);
			studentGrade.setMath(studentInfoArray.length > 3 ?  Float.valueOf(studentInfoArray[3]) : 0.0F);

			studentGradeMap.put(studentGrade.getStudentNo(), studentGrade);
		}
	}

	/**
	 * 修改学生成绩
	 * @param scan
	 */
	public void modifyStudentsGrades(Scanner scan) {
		System.out.println("修改学生成绩");
		System.out.println("请输入需要修改的学生学号");

		String modify1 = scan.nextLine();
		StudentGrade studentGrade = studentGradeMap.get(modify1);
		if(null != studentGrade) {
			System.out.println(" 学号\t\t| 语文成绩\t\t| 英语成绩\t\t| 数学成绩");
			System.out.println(studentGrade.show());

			System.out.println("请输入修改的信息 如 语文成绩, 英语成绩, 数学成绩");
			String modify2 = scan.nextLine();

			String[] studentGradeArray = modify2.split(",");
			studentGrade.setChinese(Float.valueOf(studentGradeArray[0]));
			studentGrade.setEnglish(studentGradeArray.length >1 ? Float.valueOf(studentGradeArray[1]) : 0.0F);
			studentGrade.setMath(studentGradeArray.length >2 ? Float.valueOf(studentGradeArray[2]) : 0.0F);
			System.out.println("修改成功");
		}else {
			System.out.println("未找到学生学号");
		}

	}

	/**
	 * 删除学生成绩
	 * @param scan
	 */
	public void deleteStudentsGrades(Scanner scan) {
		System.out.println("删除学生成绩");
		System.out.println("请输入需要删除学生的学号");
		String studentNo = scan.nextLine();
		StudentGrade studentGrade = studentGradeMap.get(studentNo);


		if(null != studentGrade) {
			System.out.println(" 学号\t\t| 姓名\t\t| 生日\t\t| 性别");
			System.out.println(studentGrade.show());
			
			System.out.println("即将删除以上信息，确认-Y，取消-N");
			String command = scan.nextLine();
			if("Y".equals(command.toUpperCase())) {
				studentGradeMap.remove(studentNo);
				System.out.println("删除成功");
			}else {
				System.out.println("删除信息不存在");
			}
		}
	}

}
