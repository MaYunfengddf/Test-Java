package com.helloworld.test;

public class Test46 {
	public static void main(String[] args) {
		Test43 testA = new Test44();
		testA.name = "狗";
		testA.getName();
		Test44 testC = new Test44();
		testC.getAge(testA.age = 8);
		testC.getHobby(testA.hobby = "骨头");
		
		System.out.println("---------------------");
		
		Test43 testB = new Test45();
		testB .name= "猫";
		testB.getName();
		Test45 testD = new Test45();
		testC.getAge(testD.age = 4);
		testC.getHobby(testD.hobby = "鱼");
		
		System.out.println("---------------------");
		
		Test47 testV = new Test47();
		testV.name = "哈士奇";
		testV.getName();
		testC.getAge(testV.age = 5);
		testC.getHobby(testV.hobby = "拆家");
		
		System.out.println("---------------------");
		
		Test48 testK = new Test48();
		testK.name = "大黄";
		testK.getName();
		testC.getAge(testV.age = 7);
		testC.getHobby(testV.hobby = "吃");
	}
	
}
