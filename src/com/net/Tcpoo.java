package com.net;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import org.apache.commons.math3.geometry.partitioning.Side;


public class Tcpoo {

	public static void main(String[] args) throws Exception {
		Socket khdtjz=new Socket("10.2.103.40",8899);
		OutputStream os=khdtjz.getOutputStream();
		FileInputStream fin=new FileInputStream("d:\\tp.jpg");
		byte[]zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while(b!=-1) {
			os.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		khdtjz.shutdownOutput();
		InputStream is=khdtjz.getInputStream();
		b=is.read(zjhc);
		while (b!=-1) {
			System.out.println(new String(zjhc,0,b));
			b=is.read(zjhc);
		}
		is.close();
		khdtjz.close();
	}
}
