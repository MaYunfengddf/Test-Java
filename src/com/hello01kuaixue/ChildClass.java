package com.hello01kuaixue;

public class ChildClass extends ParentClass{
	public String name = "子类名称";
	private String childName;
	
	public String parentMethod() {
		return"子类重写方法";
	}
	public void callParentMethod(){
		System.out.println(super.parentMethod());
	}
	
	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		child.callParentMethod();
	}
}
