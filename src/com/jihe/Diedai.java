package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("stud1");
		arrayList.add("stud2");
		arrayList.add("stud3");
		arrayList.add("stud4");
		//arrayList.add(5);
		System.out.println("数组列表arrayList的长度是"+arrayList.size());
		System.out.println("数组列表arrayList的第二元素是"+arrayList.get(1));
		System.out.println("迭代");
		//使用迭代读取集合中的每个元素
		Iterator<String>diedai=arrayList.iterator();
		while(diedai.hasNext()) {
			//next方法读取下一个元素
			String dgys=diedai.next();
			System.out.println(dgys);
		}
		System.out.println("使用foreach循环输出每个元素：");
		for(String guapi:arrayList) {
			System.out.println(guapi);
			
			ArrayList<String> list=new ArrayList<String>();
			list.add("data_1");
			list.add("data_2");
			list.add("data_3");
			System.out.println(list);
			@SuppressWarnings("unused")
			Iterator<String> iterator=list.iterator();
			list.forEach(obj->System.out.println("迭代集合元素"+obj));
		}
	}
}
