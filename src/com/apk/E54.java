package com.apk;

public class E54 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s1="a我s爱f中1国254";
		System.out.println("这个字符里的数子时:");
		//将字符串打碎成字符数组
		char[] zfsz=s1.toCharArray();
		//foreach循环:对于字符数组里德每个字符
		//冒号前面是集合或者数组里德单个元素,冒号后面是集合或者数组
		for(char zf:zfsz) {
			if (zf>='0'&&zf<='9') {
				System.out.print(zf);
			}
		}
		System.out.println("\n这个字符串里的汉子是：");
		for(char zf : zfsz) {
			if(zf>='\u4E00'&&zf<='\u9FA5') {
				System.out.print(zf);
			}
		}
	}

}
