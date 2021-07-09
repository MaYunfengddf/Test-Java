package com._student.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

//输出流  写入文件内
public class FileOutput extends StudentInformation {
	public void setFileOutput(List<StudentInformation> list) {
		try {

			for(StudentInformation lis : list) {
				System.out.println("输出流前遍历" + lis);
				FileOutputStream fileOut = new FileOutputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\test\\student_Info.txt",true);
				ObjectOutputStream ss=new ObjectOutputStream(fileOut);
				ss.writeObject(lis);
				System.out.println("信息录入成功");



				FileOutputStream fileIDOut = new FileOutputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\test\\student_ID.txt");
				fileIDOut.write(getID());
				System.out.println("ID记录成功");

				ss.close();
				fileOut.close();
				fileIDOut.close();
			}

		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
