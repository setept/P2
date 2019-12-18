package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.security.spec.DSAGenParameterSpec;
import java.util.Scanner;

public class ChatSender implements Runnable {

	private DatagramSocket ds;
	private int i;

	public ChatSender(DatagramSocket ds, int i) {
		this.ds=ds;
		this.i=i;
	}
	@Override 
	public void run() {
		// TODO 自动生成的方法存根
		 Scanner sc=new Scanner(System.in);
		 while (true) {
			 try {
				 String str=sc.nextLine();;
				 byte[]zjsz;
				 zjsz=str.getBytes("UTF-8");
				 System.out.println("这条信息发送给哪个IP:");
				 String ip=sc.nextLine();
				 DatagramPacket pa=new DatagramPacket(zjsz,zjsz.length,InetAddress.getByName(ip),8900);
				ds.send(pa);
			 }catch (Exception e) {
				e.printStackTrace();
			}
		 }
	}

}
