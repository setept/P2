package com.apk;

import java.util.Random;

public class E16 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random r=new Random();
		System.out.println("生成boolean类型的随机数:"+r.nextBoolean());
		System.out.println("生成double类型的随机数:"+r.nextDouble());
		System.out.println("生成float类型的随机数:"+r.nextFloat());
		System.out.println("生成int类型的随机数:"+r.nextInt());
		System.out.println("生成0到10之间int类型的随机数:"+r.nextInt(10));
		System.out.println("生成long类型的随机数:"+r.nextLong());
		
		System.out.println("随机生成[0,1]之间一个浮点数"+Math.random());
		Random a=new Random();
		System.out.println("随机生成[0,1]之间一个浮点数"+a.nextDouble());
		System.out.println("随机生成-21亿到21亿之间的一个整数"+a.nextInt());
		System.out.println("随机生成10以内不包含10但包含0的一个整数:"+a.nextInt(10));
	}

}
