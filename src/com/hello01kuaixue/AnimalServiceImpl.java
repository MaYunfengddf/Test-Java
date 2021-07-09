package com.hello01kuaixue;

public class AnimalServiceImpl implements AnimalService {
	public void sleep() {
		System.out.println("实现动物接口");
	}
	public static void main(String[] args) {
		AnimalService animalService = new AnimalServiceImpl();
		animalService.sleep();
	}
}
