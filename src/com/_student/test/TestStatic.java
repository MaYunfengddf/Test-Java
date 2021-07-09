package com._student.test;

public class TestStatic {
	public static int a;
	String name;
	static String age = "29";
	public TestStatic(String name) {
		this.name = name;
		a++;
	}
	public static void main(String[] args) {
		TestStatic test1= new TestStatic("wang");
		TestStatic test2 = new TestStatic("li");
		TestStatic test3 = new TestStatic("hei");
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		System.out.println(test3.toString());
		
		test2.age = "25";
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		System.out.println(test3.toString());
		
		System.out.println("一共调用了:" + test1.a + "次");
	}
	
	@Override
	public String toString() {
		return "name:" + this.name + "  age:" + this.age;
	}
	
}
