package com.jihe;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String> list=new ArrayList<String>();
		Collections.addAll(list, "赵","钱","孙","李","周");
		System.out.println("排序前:"+list);
		Collections.reverse(list);
		System.out.println("反转后:"+list);
		Collections.sort(list);
		System.out.println("自然排序:"+list);
		Collections.shuffle(list);
		System.out.println("随机排序后:"+list);
		Collections.swap(list, 0,list.size()-1);
		System.out.println("首尾交换后:"+list);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		Collections.addAll(list2,-3,9,2,8,5);
		System.out.println("集合中的元素"+list2);
		System.out.println("集合中的最大值元素"+Collections.max(list2));
		System.out.println("集合中的最小值元素"+Collections.min(list2));
		Collections.replaceAll(list2, 8, 0);
		System.out.println("替换后集合中的元素"+list2);
		Collections.sort(list2);
		System.out.println(":"+list2);
		Collections.shuffle(list2);
		System.out.println(":"+list2);
		Collections.swap(list2, 0,list2.size()-1);
		System.out.println(":"+list2);
		
		int index=Collections.binarySearch(list2, 9);
		System.out.println("集合通过二分查找方法查找"+index);
	}

}
