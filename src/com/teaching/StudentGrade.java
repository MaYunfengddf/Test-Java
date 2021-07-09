package com.teaching;
/**
 * 学生成绩
 * @author Administrator
 *
 */
public class StudentGrade {

	// 学号
	private String studentNo;
	
	// 语文成绩
	private Float  chinese;
	
	// 英语成绩
	private Float english;
	
	// 数学成绩
	private Float math;
	

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public Float getChinese() {
		return chinese;
	}

	public void setChinese(Float chinese) {
		this.chinese = chinese;
	}

	public Float getEnglish() {
		return english;
	}

	public void setEnglish(Float english) {
		this.english = english;
	}

	public Float getMath() {
		return math;
	}

	public void setMath(Float math) {
		this.math = math;
	}
	
	@Override
	public String toString() {
		return this.studentNo + "," + this.chinese + "," + this.english + "," + this.math;
	}
	
	/**
	 * 把字符串加载为学生成绩对象
	 * @param studentGradeStr
	 * @return
	 */
	public static StudentGrade load(String studentGradeStr) {
		
		if(null != studentGradeStr) {
			String[] studentGradeArray =  studentGradeStr.split(",");
			
			StudentGrade studentGrade = new StudentGrade();
			studentGrade.setStudentNo(studentGradeArray[0]);
			studentGrade.setChinese(studentGradeArray.length > 1 ? Float.valueOf(studentGradeArray[1]) : 0.0F);
			studentGrade.setEnglish(studentGradeArray.length > 2 ? Float.valueOf(studentGradeArray[2]) : 0.0F);
			studentGrade.setMath(studentGradeArray.length > 3 ? Float.valueOf(studentGradeArray[3]) : 0.0F);
			
			return studentGrade;
		}
		
		return null;
	}
	
	public String show() {
		return this.studentNo + "\t|" + this.chinese + "\t|" + this.english + "\t|" + this.math;
	}
}
