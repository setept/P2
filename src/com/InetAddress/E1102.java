package com.InetAddress;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class E1102 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		DatagramSocket server=new DatagramSocket(8900);
		byte[]buf=new byte[1024];
		DatagramPacket packet=new DatagramPacket(buf,buf.length);
		System.out.println("等待接受数据...");
		while(true) {
			server.receive(packet);
			String str=new String(packet.getData(),0,packet.getLength());
			System.out.println(packet.getAddress()+":"+packet.getPort()+"发送消息:"+str);
		}
	}

}
