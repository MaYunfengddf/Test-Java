package com.hello01kuaixue;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternExample {
	private static final int ssa = 20*60*60;


	public static void main(String[] args) {
		String str = "零壹快学www.01kuaixue.com";
		String regex = "[0-1A-Za-z](.*)(\\.)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		System.out.println(ssa + "A");
		int groupCount = matcher.groupCount(); 
		System.out.println(groupCount);

		System.out.println(Math.PI +"B");
		if(matcher.find()) {
			for(int i = 0; i <= groupCount;i++) {
				System.out.println(matcher.group(i) + "C");
			}
		}else {
			System.out.println("未找到");
		}
	}
}
