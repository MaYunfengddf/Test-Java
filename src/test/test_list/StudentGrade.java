package test.test_list;

/**
 * 学生成绩
 * @author MaYunfeng
 *
 */

public class StudentGrade {

	//学号
	private String studentNo;
	//语文成绩
	private Float chinese;
	//数学成绩
	private Float math;
	//英语成绩
	private Float english;
	
	
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
	
	public Float getMath() {
		return math;
	}
	
	public void setMath(Float math) {
		this.math = math;
	}
	
	public Float getEnglish() {
		return english;
	}
	
	public void setEnglish(Float english) {
		this.english = english;
	}
	
	public String toString(){
		return this.studentNo + "," + this.chinese + "," + this.english + "," + this.math;
	}
	
	/**
	 * 把字符串加载成学生成绩对象
	 * @param studentGradeStr
	 * @return
	 */
	public static StudentGrade load(String studentGradeStr) {
		if(null != studentGradeStr) {
			String[] studentGradeArray = studentGradeStr.split(",");
			
			StudentGrade studentGrade = new StudentGrade();
			studentGrade.setStudentNo(studentGradeArray[0]);
			studentGrade.setChinese(studentGradeArray.length > 0 ?  Float.valueOf( studentGradeArray[1]) : 0.0F);
			studentGrade.setEnglish(studentGradeArray.length > 0 ?  Float.valueOf( studentGradeArray[2]) : 0.0F);
			studentGrade.setMath(studentGradeArray.length > 0 ?   Float.valueOf( studentGradeArray[3]) : 0.0F);
			return studentGrade;
		}
		return null;
	}
}
