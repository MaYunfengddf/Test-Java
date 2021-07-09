package test.test_list;

/**
 * 学生信息类
 * @author MaYunfeng
 *
 */
public class Student01 {
	private String ID;
	private String name;
	private String birthday;
	private String gender;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return this.ID + "," + this.name + "," + this.birthday + "," + this.gender;
	}
	
	/**
	 * 把字符串加载成学生信息对象
	 * @param Student01Str
	 * @return
	 */
	public static Student01 load(String Student01Str) {
		if(null != Student01Str) {
			String[] studentInfoArray = Student01Str.split(",");
			
			Student01 student01 = new Student01();
			student01.setID(studentInfoArray[0]);
			student01.setID(studentInfoArray.length > 0 ?   studentInfoArray[1] : "");
			student01.setID(studentInfoArray.length > 0 ?   studentInfoArray[2] : "");
			student01.setID(studentInfoArray.length > 0 ?   studentInfoArray[3] : "");
			return student01;
		}
		return null;
	}
}
