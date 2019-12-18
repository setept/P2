package com.thread;

import java.util.concurrent.Callable;

class TicketWindow2 implements Runnable{
	private int tickets=100;
	public void run() {
		// TODO 自动生成的方法存根
		 while(true) {
			 if (tickets>0) {	 
			 System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
		 }
	}
}
}
public class E105 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TicketWindow2 tw=new TicketWindow2();
		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();
		
	}

}
