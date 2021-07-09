package com._01Basics;
//设计一个类Armor护甲
//继承Item类，并且额外提供一个属性ac: 护甲等级 int 类型
//实例化出两件护甲名称 价格 护甲等级布甲 300 15锁子甲 500 40
public class Armor extends Ltem{
	public int ac;
	 public void Armor() {
		 
	 }
	 
	 public static void main(String[] args) {
		 Armor a = new Armor();
		 a.name = "布甲";
		 a.age = 300;
		 a.ac = 15;
		 System.out.println(a.toString());
		 Armor c = new Armor();
		 c.name = "重甲";
		 c.age = 500;
		 c.ac = 40;
		 System.out.println(c.toString());
	 }
	 
	 public String toString() {
		 return "名称:" + name + "\n价格:" + age + "\n护甲:" + ac;
	 }
}
