package com.jihe;

import java.util.Arrays;

public class Arrays_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr= {9,8,3,5,2,6,12};
		System.out.println("排序前:");
		printArray(arr);
		Arrays.sort(arr);
		System.out.println("\n排序后:");
		printArray(arr);
		
		int index=Arrays.binarySearch(arr,9);
		System.out.println("\n元素6在排序后的数组中的索引是:"+index);
		//拷贝数组元素                                                             
		int [] copiedArr=Arrays.copyOfRange(arr,2,8);
		System.out.println("\n被拷贝的数组是:");
		printArray(copiedArr);
		//替换数组元素
		Arrays.fill(copiedArr, 8);
		System.out.println("\n被考贝的数组元素替换成8以后是:");
		printArray(copiedArr);
	}

	private static void printArray(int[] arr) {
		for (int i:arr) {
			System.out.print(i+" ");
		}
		
	}

}
