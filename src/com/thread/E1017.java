package com.thread;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.functors.WhileClosure;

public class E1017 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<Object>goods=new ArrayList<>();
		long start=System.currentTimeMillis();
		Thread thread1=new Thread(()->{
			int num=0;
			while(System.currentTimeMillis()-start<=100) {
					goods.add("商品"+(++num));
					System.out.println("生产商品"+num);
			}
		},"生产者");
		
		Thread thread2=new Thread(()->{
			int num=0;
			while(System.currentTimeMillis()-start<=100) {
					goods.remove("商品"+(++num));
					System.out.println("消费商品"+num);
				}
		} ,"消费者") ;
		thread1.start();
		thread2.start();
}
}