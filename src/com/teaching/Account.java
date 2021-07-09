package com.teaching;

/**
 * 账号 JavaBean
 * @author Administrator
 *
 */
public class Account {

	// 账号
	private String accountNo;
	// 密码
	private String password;
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return this.accountNo + "," + this.password;
	}
	
	/**
	 * 把字符串加载为账户对象
	 * @param accountStr
	 * @return
	 */
	public static Account load(String accountStr) {
		
		if(null != accountStr) {
			String[] accountArray =  accountStr.split(",");
			
			Account account = new Account();
			account.setAccountNo(accountArray[0]);
			account.setPassword(accountArray.length > 1 ? accountArray[1] : "");
			return account;
		}
		
		return null;
	}
}
