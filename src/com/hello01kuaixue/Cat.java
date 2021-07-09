package com.hello01kuaixue;

public class Cat implements Cloneable {
		private String name;
		private int age; 
		
		public String getName() {
			return name;
		}
		
		
		public void setName(String name) {
			this.name = name;
		}
		
		
		public int getAge() {
			return age;
		}
		
		
		public void setAge(int age) {
			this.age = age;
		}
		
		
		
		public String toString() {
			return "Cat: 姓名 = " + name + ",年龄=" + age + "";
		}
		
		
		public Object clone() throws CloneNotSupportedException{
			return super.clone();
		}
}
