package com.hello01kuaixue;
import java.util.Date;

public class FormatDateString {
	public static void main(String[] args) {
		Date date = new Date();//创建一个日期对象
		System.out.println(String.format("现在是哪年哪月哪日： %tY年%tB月%td日",date,date,date));
		System.out.println(String.format("当前系统时间为：%tH小时%tM分钟%tS秒",date,date,date));
	}
}
