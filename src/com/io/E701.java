package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class E701 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		FileInputStream inputStream=new FileInputStream("d:\\tp.jpg");
		FileOutputStream fou=new FileOutputStream("tp.jpg");
		long kssj=System.currentTimeMillis();
		byte[]zjht=new byte[1024];
		int b=inputStream.read(zjht);
		while(b!=-1) {
			//System.out.print((char)b);
			fou.write(zjht,0,b);
			b=inputStream.read(zjht);
		}
		long jssj=System.currentTimeMillis();
		System.out.println("拷贝40kb的图片文件耗时"+(jssj-kssj)+"毫秒");
		//fou.write(",come on".getBytes());	
		fou.close();
		inputStream.close();
	}

}
