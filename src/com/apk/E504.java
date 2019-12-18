package com.apk;

public class E504 {

	public static void main(String[] args) {
		String s1="abc我a爱b中cc国b7a8n4b1a5.jpg";
		System.out.println("这个字符里的数字是：");
		//将字符串打碎成字符数组
		char[] zfsz=s1.toCharArray();
		
		for(char zf : zfsz) {
			if(zf>='0'&&zf<='9') {
				System.out.print(zf);
			}
		}
		System.out.println("这个字符串里的汉字是:");
		for(char zf : zfsz) {
			if(zf>='\u4E00'&&zf<='\u9FA5') {
				System.out.print(zf);
			}
		}
	}

}
