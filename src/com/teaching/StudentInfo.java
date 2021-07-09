package com.teaching;

/**
 * 学生信息
 * @author Administrator
 *
 */
public class StudentInfo {

	// 学号
	private String studentNo;
	
	// 姓名
	private String name;
	
	// 生日
	private String birthDay;
	
	// 性别
	private String gender;
	

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	

	@Override
	public String toString() {
		return this.studentNo + "," + this.name + "," + this.birthDay + "," + this.gender;
	}
	
	/**
	 * 把字符串加载为学生信息对象
	 * @param studentInfoStr
	 * @return
	 */
	public static StudentInfo load(String studentInfoStr) {
		
		if(null != studentInfoStr) {
			String[] studentInfoArray =  studentInfoStr.split(",");
			
			StudentInfo studentInfo = new StudentInfo();
			studentInfo.setStudentNo(studentInfoArray[0]);
			studentInfo.setName(studentInfoArray.length > 1 ? studentInfoArray[1] : "");
			studentInfo.setBirthDay(studentInfoArray.length > 2 ? studentInfoArray[2] : "");
			studentInfo.setGender(studentInfoArray.length > 3 ? studentInfoArray[3] : "");
			
			return studentInfo;
		}
		
		return null;
	}
	
	/**
	 * 格式化显示
	 * @return
	 */
	public String show() {
		return this.studentNo + "\t|" + this.name + "\t|" + this.birthDay + "\t|" + this.gender;
	}
	
}
