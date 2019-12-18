package com.io;

import java.io.RandomAccessFile;

public class ra {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		RandomAccessFile raf=new RandomAccessFile("guagua.txt", "rw");
		int times=Integer.parseInt(raf.readLine())-1;
		if(times>0) {
			System.out.println("您还可以试用"+times+"次!");
			raf.seek(0);
			raf.write((times+"").getBytes());
		}else {
			System.out.println("试用次数已用完！");
		}
		raf.close();
	}
}
