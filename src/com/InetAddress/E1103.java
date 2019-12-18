package com.InetAddress;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class E1103 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		DatagramSocket client=new DatagramSocket(3000);
		String str="双克辉";
		byte[]zjsz=str.getBytes();
		DatagramPacket packet=new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getByName("10.2.103.31"),8900);
		System.out.println("开始发送信息...");
		client.send(packet);
		client.close();
	}
}
