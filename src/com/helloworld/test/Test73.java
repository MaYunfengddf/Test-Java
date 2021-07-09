package com.helloworld.test;

public class Test73 {
	public static void main(String[] args) {
		Test72 test[] = Test72.values();
		for(int i = 0;i < test.length;i++) {
			System.out.println(test[i] + " : " +test[i].A + "--引索位置:" + test[i].ordinal());
		}
	}
}
