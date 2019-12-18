package com.jihe;

import java.util.HashSet;

public class E609 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSet<String> set =new HashSet<String>();
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		set.forEach(o->System.out.println(o));
		set.removeAll(set);
		System.out.println("来自哈希集的输出");
		
		HashSet<Integer> set2 =new HashSet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(5);
		set.forEach(o->System.out.println(o));
		System.out.println("来自哈希集的输出");
	}

}
