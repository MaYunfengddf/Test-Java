package com.helloworld.test;

public class SetTable {
	public static void main(String[] aegs) {
		Table table = new Table("书桌","长方形","木色",1.2,"学习");
		System.out.println("桌子名字为:" + table.getName());
		System.out.println("桌子形状为:" + table.getShape());
		System.out.println("桌子颜色为:" + table.getColour());
		System.out.println("桌子高度为:" + table.getHigh());
		System.out.println("桌子用处为:" + table.getUsefulness());
		System.out.println("---------------------");
		Table table1 = new Table("茶几","长方形","白色",0.5,"客厅摆设");
		System.out.println("桌子名字为:" + table1.getName());
		System.out.println("桌子形状为:" + table1.getShape());
		System.out.println("桌子颜色为:" + table1.getColour());
		System.out.println("桌子高度为:" + table1.getHigh());
		System.out.println("桌子用处为:" + table1.getUsefulness());
	}
}
