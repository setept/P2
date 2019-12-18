package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;

public class E61 {

	public static void main(String[] args) {
		//<>是泛型，里面的类型是集合里元素的类型
		//有两个类，前面一个是集合类，后面尖括号里的是集合里元素类型
		ArrayList<String> list=new ArrayList<String>();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		//list.add(5);
		System.out.println("集合的长度："+list.size());
		System.out.println("第2个元素是："+list.get(1));
		
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("stu1");
		list1.add("stu2");
		list1.offer("offer");
		list1.push("push");
		//list.add(5);
		System.out.println("集合的长度："+list1.size());
		System.out.println("第2个元素是："+list1.get(1));
		System.out.println("链表第一个元素是:"+list1.getFirst());
		System.out.println("链表第一个元素是:"+list1.getFirst());
		System.out.println(list1);
	}

}
