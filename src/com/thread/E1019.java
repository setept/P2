package com.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class E1019 {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO 自动生成的方法存根
		@SuppressWarnings("unused")
		CompletableFuture<Integer>completableFuture=CompletableFuture.supplyAsync(()->{
			int  sum=0,i=0;
			while(i++<10) {
				sum+=i;
				System.out.println(Thread.currentThread().getName()+"线程任务正在执行...i:"+i);
			}
			return sum;
		});
		@SuppressWarnings("unused")
		CompletableFuture<Integer>completableFuture2=CompletableFuture.supplyAsync(()->{
			int sum=0,j=5;
			while(j++<15) {
				sum+=j;
				System.out.println(Thread.currentThread().getName()+"线程任务正在执行...j:"+j);
			}
			return sum;
		});
		CompletableFuture<Integer>completableFuture3=completableFuture.thenCombine(completableFuture2,(result1,result2)->result1+result2);
		System.out.println("1到10相加的结果为:"+completableFuture3.get()
		);
	}

}
