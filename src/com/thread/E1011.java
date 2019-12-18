package com.thread;

class SaleThread implements Runnable {
	private int tickets = 10;
	Object lock = new Object();

	public void run() {
		while (true) {
			synchronized (lock) {

				if (tickets > 0) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() + "正在发售第" + tickets-- + "张票");
			} else {
				break;
			}

		}
	}
}

public class E1011 {

	public static void main(String[] args) {
		SaleThread saleThread = new SaleThread();
		new Thread(saleThread, "窗口1").start();
		new Thread(saleThread, "窗口2").start();
		new Thread(saleThread, "窗口3").start();
		new Thread(saleThread, "窗口4").start();

	}

}
