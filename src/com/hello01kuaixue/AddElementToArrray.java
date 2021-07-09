package com.hello01kuaixue;
import java.util.Arrays;

public class AddElementToArrray {
	public static String[] insertElement(String[] array, int index,String value) {
		String[] insertArray = new String[array.length + 1];
		for(int i = 0;i<array.length + 1;i++) {
			if(i<index) {
				insertArray[i] = array[i];
				System.out.println(Arrays.toString(insertArray)+1);
			}
			if(i == index) {
				insertArray[i] = value;
				System.out.println(Arrays.toString(insertArray)+2);
			}
			if(i>index) {
				insertArray[i] = array[i - 1];
				System.out.println(Arrays.toString(insertArray)+3);
			}
			}
		return insertArray;
	}
	public static void main(String[]args) {
		String[] array = new String[] {"零","壹","学"};
		System.out.println(Arrays.toString(array));
		array = insertElement(array,2,"快");
		System.out.println(Arrays.toString(array));
	}
}
