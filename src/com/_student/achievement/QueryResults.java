package com._student.achievement;

import java.io.FileInputStream;

//查询录入的学生成绩
public class QueryResults {
	public void setQueryResults() {

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
	}
}
