package com.hello01kuaixue;

public class AnnotationTest {
	@CustomAnnotation(name = "Mike",desc = "My name is Mike")
	public void test1() {
		System.out.println("test1");
	}
	@CustomAnnotation
	public void test2() {
		
		System.out.println("test2");
	}
}
