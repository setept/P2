package com.net;

import java.net.DatagramSocket;

public class chatRoom {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		DatagramSocket ds=new DatagramSocket(8900);
		new Thread(new ChartReceiver(ds),"接收服务").start();
		new Thread(new ChatSender(ds,3000),"发送服务").start();
	}

}
