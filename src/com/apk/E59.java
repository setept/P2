package com.apk;
import java.util.*;
public class E59 {
	public static void main(String[] args) {
		//获取当前系统属性
		Properties shuxing=System.getProperties();
		Set<String>shuxingming=shuxing.stringPropertyNames();
		for(String key:shuxingming) {
			String value=System.getProperty(key);
			System.out.println(key+"---->"+value);
		}
	}
}