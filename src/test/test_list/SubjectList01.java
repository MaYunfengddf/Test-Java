package test.test_list;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * 控制页面
 * @author MaYunfeng
 *
 */
public class SubjectList01 {

	//文件路径
	private static final String FILE_PATH = "D:/StudentTest";
	//账户信息文件
	private static final String ACCOUNT_FILE = "AccountFile,stu";
	//学生信息文件
	private static final String STUDENT_INFO_FILE = "SyudentInfoFile.stu";
	//学生成绩文件
	private static final String STUDENT_GRADE_FILE = "SyudentGradeFile.stu";

	//账户集合
	private Map<String,Account01> accountMap = new HashMap<String,Account01>();
	//学生信息集合
	private Map<String,Student01> studentInfoMap = new HashMap<String,Student01>();
	//学生成绩集合
	private Map<String,StudentGrade> studentGradeMap = new HashMap<String,StudentGrade>();


	public static void main(String[] args) {
		SubjectList01 subjectList = new SubjectList01();

		try {
			//1.加载文件信息
			subjectList.loadFiledata();

			//2登陆系统
			System.out.println("欢迎使用学生信息维护系统");
			Scanner scan = new Scanner(System.in);
			boolean loginFlag = subjectList.login(scan);

			//3一级菜单功能
			for(;;) {
				System.out.println("========================");
				System.out.println("0,保存退出");
				System.out.println("1,学生信息维护");
				System.out.println("2,学生成绩维护");
				String command = scan.nextLine();
				switch(command) {
				case"0":
					subjectList.saveDate();
					loginFlag = false;
					break;
				case"1":
					subjectList.studentInfosFunction();
					break;
				case"2":
					subjectList.studentGradesFunction();
					break;
				default:
					System.out.println(command + "功能未完成");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//	保存并退出
	public void saveDate() {

	}
	
	//读取文件信息
	private void loadFiledata() throws IOException{
		//TODO读取文件数据
		System.out.println("系统启动中");
		//加载账户数据
		String AccountFileDate = FileUtil01.read(FILE_PATH,ACCOUNT_FILE);
		if(null != AccountFileDate && AccountFileDate.trim().length() >0) {
			String[] accountStrArray = AccountFileDate.split("\r\n");
			for(String accountStr : accountStrArray) {
				Account01 account = Account01.load(accountStr);
				accountMap.put(account.getAccountNo(), account);
			}
		}
		
		
		
		//加载学生信息数据
		String studentInfoFileDate = FileUtil01.read(FILE_PATH,STUDENT_INFO_FILE);
		if(null != studentInfoFileDate && studentInfoFileDate.trim().length() >0) {
			String[] studentInfoStrArray = studentInfoFileDate.split("\r\n");
			for(String studentInfoStr : studentInfoStrArray) {
				Student01 studentInfo = Student01.load(studentInfoStr);
				studentInfoMap.put(studentInfo.getID(), studentInfo);
			}
		}
		//加载学生成绩数据
		String studentGradeFileDate = FileUtil01.read(FILE_PATH,ACCOUNT_FILE);
		if(null != studentGradeFileDate && studentGradeFileDate.trim().length() >0) {
			String[] studentGradeStrArray = studentGradeFileDate.split("\r\n");
			for(String studentGradeStr : studentGradeStrArray) {
				StudentGrade studentGrade = StudentGrade.load(studentGradeStr);
				studentGradeMap.put(studentGrade.getStudentNo(), studentGrade);
			}
		}
		System.out.println(String.format("日志:账户信息数据量[%s],学生信息数据量[%s],学生成绩数据[%s]", accountMap.size(),studentInfoMap.size(),studentGradeMap.size()));
	}

	//学生信息维护
	private void studentInfosFunction() {

	}

	//学生成绩维护
	private void studentGradesFunction() {

	}

	
	/**
	 * 登录系统
	 * @param scan
	 * @return 
	 */
	public boolean login(Scanner scan) {
		System.out.println("请输入登录账户");
		String accountNo = scan.nextLine();
		System.out.println("请输入账户密码");
		String password = scan.nextLine();
		
		Account01 account = accountMap.get(accountNo);
		if(null == password || null == account || !password.equals(account.getPassword())) {
			System.out.println("密码错误");
			return false;
		}
		
		return true;
	}
}
