package com.net;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;

import org.apache.commons.math3.random.ISAACRandom;

public class tcpSender {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ServerSocket fwqtjz=new ServerSocket(8899);
		String ip=khdtjz.getInetAddress().getHostAddress();
		int port=khdtjz.getPort();
		System.out.println("和客户端ip地址是"+ip+",端口是"+port+"连接上了");
		InputStream inputStream=khdtjz.getInputStream();
		byte[]zjhc=new byte[1024];
		FileOutputStream fileOutputStream=new FileOutputStream("d:\\upload\\"+ip+"");
		int b=ISAACRandom.read(zjhc);
		while(b!=-1) {
			fileOutputStream.write(zjhc,0,b);
			b=is.read(zjhc);
		}
		String xinxi="文件上传成功"；
		zjhc=new byte[1024];
		FileOutputStream fout=new FileOutputStream("d:\\upload\\"+""); 
	}

}
