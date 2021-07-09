package com.teaching;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 登录控制器
 * @author Administrator
 *
 */
public class AccountControl {
	
	// 账户集合
	private Map<String, Account> accountMap = new HashMap<String, Account>();
	
	/**
	 * 登录控制器构造方法
	 * @throws IOException
	 */
	public AccountControl() throws IOException {
		loadFileData();
	}
	
	
	/**
	 * 登录系统
	 * @param scan
	 * @return  true 验证成功， false 验证失败
	 */
	public boolean login(Scanner scan) {
		// 只运行输入三次
		for(int times = 0; times < 3; times++) {

			System.out.print(String.format("请输入登录账户(剩余%s次):", 3 - times));
			String accountNo  =  scan.nextLine();

			System.out.print("请输入账户密码:");
			String password  =  scan.nextLine();
			
			Account account = this.accountMap.get(accountNo);
			if(null == password || null == account || !password.equals(account.getPassword())) {
				System.out.print("密码错误！");
				if(times < 2) {
					System.out.println("请重新输入");
				} else {
					System.out.println("程序结束！");
				}
			} else {
				return true;
			}
		}
		return false;
	}

	
	/**
	 * 读取文件数据
	 * @throws IOException 
	 */
	private void loadFileData() throws IOException {
		// 加载账户数据
		String accountFileDate = FileUtil.read(StudentControl.FILE_PATH, StudentControl.ACCOUNT_FILE);
		if(null != accountFileDate && accountFileDate.trim().length() > 0) {
			String[] accountStrArray = accountFileDate.split("\r\n");
			for(String accountStr : accountStrArray) {
				Account account = Account.load(accountStr);
				accountMap.put(account.getAccountNo(), account);
			}
		}

		System.out.println(String.format("日志：账户信息数据量[%s]", accountMap.size()));
	}
}
