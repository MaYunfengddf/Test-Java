package com.helloworld.test;

public class Test38 {
	public static void main(String[] args) {
		try{

			Test37 test = new Test37();
			test.setName("向往");
			test.setAge(18);
			System.out.println(test);

			Test37 test1= (Test37)test.clone();
			System.out.println(test1);
			test1.setName("xioaming");
			test1.setAge(16);
			System.out.println(test1);
			System.out.println(test);

			Test37 test2= (Test37)test1.clone();
			test1.setName("小玲");
			test1.setAge(12);
			System.out.println(test2);
			System.out.println(test1);
			System.out.println(test);

			Test37 test3 = new Test37();
			test.setName("小站");
			test.setAge(24);
			System.out.println(test3.toString());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
