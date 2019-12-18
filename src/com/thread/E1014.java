package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockThread implements Runnable {
	private int tickest = 10;
	private final Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			lock.lock();
			if (tickest > 0) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName() + "真在发售第" + tickest-- + "张票");
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
			if (tickest > 0) {
				System.out.println(Thread.currentThread().getName() + "正在发售第" + tickest-- + "张票");
			} else {
				break;
			}
		}

	}
}

public class E1014 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		LockThread lockThread = new LockThread();
		new Thread(lockThread, "窗口1").start();
		new Thread(lockThread, "窗口2").start();
		new Thread(lockThread, "窗口3").start();
		new Thread(lockThread, "窗口4").start();
	}

}
