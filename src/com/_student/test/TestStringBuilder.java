package com._student.test;


public class TestStringBuilder {
	public static void main(String[] args) {

		//循环输出100以内整数 加英文逗号 10的倍数换行
		for(int i = 0;i < 100;i++) {
			StringBuilder stringBuilder = new StringBuilder();
			if(i % 10 == 0 && i !=  0) {
				stringBuilder.append(i + "，" +"\r\n");
				System.out.print(stringBuilder);
			}else{
				stringBuilder.append(i != 99 ? i + "," : i);
				System.out.print(stringBuilder);
				if(i == 99) {
					System.out.print("AAAA" + stringBuilder);

					int[] array = new int[5];
					array[1] = 555;
					array[1] = 444;
					array[1] = 333;
					array[1] = 222;
					array[1] = 111;

					stringBuilder.insert(50, array);

					System.out.print(stringBuilder);
				}
			}
		}

	}
}
