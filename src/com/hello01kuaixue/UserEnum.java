package com.hello01kuaixue;

public enum UserEnum {
	USER_A("userA","781e5e245d69b566979b86e28d23f2c7"),
	USER_B("userB","fbd5e160916d7cb43258e2a5b89ee2fa");
	private String name;
	private String password;
	private UserEnum(String name, String password) {
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public static String getPassword(String name) {
		for(UserEnum user : UserEnum.values()) {
			if(user.getName().equals(name)) {
				return user.password;
			}
		}
		return null;
	}
}
