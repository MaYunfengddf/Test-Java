package test.test_list;

/**
 * 账号 JavaBean
 * @author MaYunfeng
 *
 */
public class Account01 {

	//账号
	private String accountNo;
	//密码
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
	public String toString(){
		return this.accountNo +"," + this.password;
	}
	
	/**
	 * 把字符串加载成字符串对象
	 * @param accountStr
	 * @return
	 */
	public static Account01 load(String accountStr) {
		if(null != accountStr) {
			String[] accountArray = accountStr.split(",");
			
			Account01 account = new Account01();
			account.setAccountNo(accountArray[0]);
			account.setAccountNo(accountArray.length > 0 ? accountArray[1] : null);
			return account;
		}
		return null;
	}
}
