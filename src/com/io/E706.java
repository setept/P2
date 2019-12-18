package com.io;

import java.io.FileReader;

public class E706 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		FileReader fi=new FileReader("d:\\test.txt");
		int b=fi.read();
		while(b!=-1) {
			System.out.print((char)b);
			b=fi.read();
		}
		fi.close();
	}

}
