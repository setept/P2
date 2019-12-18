package com.io;

import java.io.FileReader;
import java.io.FileWriter;

public class E709 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		FileReader fi=new FileReader("reader.txt");
		FileWriter fn=new FileWriter("writer.txt");
		int len=0;
		char[]buff=new char[1024];
		while((len=fi.read(buff))!=-1) {
			fn.write(buff,0,len);
		}
		fi.close();
		fn.close();
	}

}
