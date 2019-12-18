package com.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class E615 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map<String, String> map=new HashMap<String, String>();
		map.put("1", "Jack");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		System.out.println(map);
		Set<String> keySet=map.keySet();
		Iterator<String> iterator=keySet.iterator();
		while(iterator.hasNext()) {
			
			Object key=iterator.next();
			Object value=map.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("用foreach键值对集遍历双列集合的键好值");
		map.forEach((key,value)->System.out.println(key+":"+value));
		System.out.println("用foreach键值对集遍历双列集合的所有值");
		Collection<String> zhiji=map.values();
		zhiji.forEach(value->System.out.println(value));
		
		System.out.println("==================");
		Map<String, String> map1=new LinkedHashMap<String, String>();
		map1.put("1", "Jack");
		map1.put("2", "Rose");
		map1.put("3", "Lucy");
		System.out.println(map1);
		 
 	}
}
