package com.jihe;

import java.util.HashMap;
import java.util.Map;

public class E614 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		//赋值符号左边的类或接口可以是右边的类的上一代
		Map<String, String> map=new HashMap<String, String>();
		map.put("1", "Jack");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		map.put("4", "Lucy");
		map.put("1", "Tom");
		System.out.println(map);
		if(map.containsKey("1")) {
			System.out.println("这个双列集合包含键1");
			System.out.println("这个双列集合包中键1的值是"+map.get("1"));
		}
		//将双列集合Map变成单列的键对象集合使用kesSet()方法
		//将双列集合Map变成单列的值对象集合使用values()方法
		System.out.println("这个双列集合中所有键的集合是"+map.keySet());
		System.out.println("这个双列集合中所有键的集合是"+map.values());
		//将键为1的值改成Andy
		map.replace("1", "Andy");
		System.out.println(map);
		//删除键1对应的键key值+value=对entry
		System.out.println(map.containsKey(1));
		System.out.println(map.get("1"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		map.replace("1", "Tom2");
		System.out.println(map);
		map.remove("1");
		System.out.println(map);
	}

}
