package com.hello01kuaixue;
import java.util.Arrays;
//删除数组重复原属
/*
 * System.arraycopy的函数原型是：


public static void arraycopy(Object src,
                             int srcPos,
                             Object dest,
                             int destPos,
                             int length)
其中：src表示源数组，srcPos表示源数组要复制的起始位置，desc表示目标数组，length表示要复制的长度。
 */
public class DeleteAduplicateToarray {
	
	public static Object[] deleteDuplicatrElement(Object[] array) {
		
		int length = 0;
		Object[] tempArray = new Object[array.length];
		
		for(int i = 0;i < array.length;i++) {
			boolean isDuplicate = false;
			for(int j = i + 1;j < array.length;j++) {
				if(array[i] == array[j] || array[i].equals(array[j])) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				tempArray[length] = array[i];
				length++;
			}
		}
		
		Object[] newArray = new Object[length];
		
		System.arraycopy(tempArray,0,newArray,0,length);
		
		return newArray;
	}
	
	public static void main(String[] args) {
		
		Object[] array = new String[] {"零","零·","壹","壹","快","学","学"};
		System.out.println(Arrays.toString(array));
		array = deleteDuplicatrElement(array);
		System.out.println(Arrays.toString(array));
	}
}
