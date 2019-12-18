package com.thread;

class MyThread2 extends Thread{

	 public void run() {
		 int i=0;
		 while(i++<5) {
			 System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		 }
	 }
}

public abstract class threadf {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MyThread2 myThread2=new MyThread2();
		
		Thread thread1=new Thread(myThread2,"thread1");
		thread1.start();
		
		Thread thread2=new Thread(myThread2,"thread2");
		thread2.start();
	}

}
