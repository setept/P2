package com.apk;

public class E58 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s="我爱你中国";
		StringBuffer zf=new StringBuffer(s);
		System.out.println(zf);
		//添加
		zf.append("!");
		System.out.println(zf);
		zf.insert(3,',');
		System.out.println(zf);
		//删除
		zf.delete(2, 4);
		System.out.println(zf);
		//修改
		zf.replace(2, 4,"铁铁");
		System.out.println(zf);
		//反转
		zf.reverse();
		System.out.println(zf);
	}
}
