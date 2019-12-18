package com.thread;

class DeadLockThread implements Runnable {
	static Object chopsticks = new Object();
	static Object knifeAndFork = new Object();
	private boolean flag;

	DeadLockThread(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		if (flag) {
			while (true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName() + "---if---chopsticks");
					synchronized (knifeAndFork) {
						System.out.println(Thread.currentThread().getName() + "---if---knifeAndFork");
					}
				}
			}
		} else {
			while (true) {
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName() + "---if---knifeAndFork");
					synchronized (chopsticks) {
						System.out.println(Thread.currentThread().getName() + "---if---chopsticks");
						break;
					}
				}
			}
		}
	}
}
public class E1015 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DeadLockThread thread1=new DeadLockThread(true);
		DeadLockThread thread2=new DeadLockThread(false);
		new Thread(thread1,"chinese").start();
		new Thread(thread2,"American").start();
		
	}

}
