package com.helloworld.test;
/*
 * 英雄联盟中有这么一些分类
TANK (坦克)
WIZARD (法师 )
ASSASSIN (刺客)
ASSIST (辅助)
WARRIOR (近战)
RANGED (远程 )
PUSH (推进)
FARMING (打野)
设计一个枚举类型HeroType,使用上述分类作为常量

再编写一段switch语句，把每种枚举常量输出为中文字符串
 */
public enum Test72 {
	TANK("坦克"),
	WIZARD ("法师"),
	ASSASSIN("刺客"),
	ASSIST ("辅助"),
	WARRIOR("近战") ,
	RANGED("远程"),
	PUSH ("推进"),
	FARMING("打野");
	public String A;
	private Test72() {
		
	}
	private Test72(String A) {
		this.A = A;
	}
}
