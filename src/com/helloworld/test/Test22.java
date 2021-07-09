package com.helloworld.test;
import java.util.Scanner;
/*加密解密
 * A->b, b->C, C->d, d->E, e->F, F-g, g->A
 */
public class Test22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入1进行加密");
		System.out.println("输入2进行解密");
		String str = scanner.nextLine();
		Test22 test = new Test22();
		switch(str) {
		case "1":
			test.number(str);
			break;
		case "2":
			test.number2(str);
			break;
		}

	}
	public void number(String str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入加密内容");
		String st = scanner.nextLine();
		st = st.replaceAll("d","E");
		
		st = st.replaceAll("C","d");
		
		st = st.replaceAll("b","C");

		st = st.replaceAll("A","b");
		
		st = st.replaceAll("g","A");

		st = st.replaceAll("F","g");

		st = st.replaceAll("e","F");

		System.out.println(st);
	}
	public void number2(String str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入加密内容");
		String st = scanner.nextLine();
		st = st.replaceAll("F","e");

		st = st.replaceAll("g","F");

		st = st.replaceAll("A","g");

		st = st.replaceAll("b","A");

		st = st.replaceAll("C","b");

		st = st.replaceAll("d","C");

		st = st.replaceAll("E","d");
		System.out.println(st);
	}
}
