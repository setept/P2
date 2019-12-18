package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChartReceiver implements Runnable {

	private DatagramSocket ds;

	public ChartReceiver(DatagramSocket ds) {
		this.ds=ds;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		byte[]buf=new byte[1024];
		DatagramPacket pa=new DatagramPacket(buf, buf.length);
		System.out.println("等带接收数据.......");
		while(true) {
			try {
				ds.receive(pa);
				String das=new String(pa.getData(),0,pa.getLength());
				System.out.println(das);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
