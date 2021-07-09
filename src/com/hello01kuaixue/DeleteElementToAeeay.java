package com.hello01kuaixue;
import java.util.Arrays;

public class DeleteElementToAeeay {
	public static String[] deleteElement(String[] array,int index) {
		String[] deleteArray = new String[array.length - 1];
		for(int i = 0; i<deleteArray.length;i++) {
			if(i<index) {
				deleteArray[i] = array[i];
			}else {
				deleteArray[i] = array[i + 1];
			}
		}
		return deleteArray;
	}
	public static void main(String[] args) {
		String[] array = new String[] {"零","壹","01","快","学"};
		System.out.println(Arrays.toString(array));
		array = deleteElement(array,2);
		System.out.println(Arrays.toString(array));
	}
}
