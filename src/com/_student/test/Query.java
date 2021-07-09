package com._student.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

//查询
public class Query {
	public void query(Scanner sca){
		System.out.println("使用查询功能");
		for(;;) {
			StudentInformation studentInformation = null;
			try {
				System.out.println("输入qst查询学生信息 输入qid查询当前录入的ID  输入esc返回主菜单");
				String str = sca.nextLine();
				switch(str) {
   
				case"qst":
					try {
						FileInputStream file = new FileInputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\test\\student_Info.txt");
						ObjectInputStream in = new ObjectInputStream(file);
						studentInformation = (StudentInformation) in.readObject();

						System.out.println("反序列化StudentInformation对象");
						System.out.println(studentInformation.getID());
						System.out.println(studentInformation.getName());
						System.out.println(studentInformation.getBirthday());
						System.out.println(studentInformation.getGender());
						System.out.println("----------查询结束----------");
						
					}catch (IOException e) {
						e.printStackTrace();
					}catch(ClassNotFoundException e) {
						System.out.println("无法找到StudentInformation类");
						e.printStackTrace();
					}
					

					break;
				case"qid":
					FileInputStream fileID = new FileInputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\test\\student_ID.txt");
					byte[] byteArrayID =  fileID.readAllBytes();

					String fileContentID = new String(byteArrayID, "UTF-8");
					System.out.print(fileContentID);
					System.out.println("----------查询结束----------");
					fileID.close();
					break;
				case"esc":
					System.out.println("返回主菜单");
					return;

				default:
					System.out.println(str + "无效输出 重新输入");
				}	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
