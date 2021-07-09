package com.hello01kuaixue;

public class UseEnum {
	public static void main(String[] args) {
		ColorEnum colorArray[] = ColorEnum.values();
		for(int i = 0; i < colorArray.length;i++) {
			System.out.println(colorArray[i].color);
		}
	}
}
