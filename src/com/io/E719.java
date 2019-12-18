package com.io;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class E719 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		RandomAccessFile infile=new RandomAccessFile("d:\\/2.jpg","rw");
		FileChannel inChannel=infile.getChannel();
		RandomAccessFile outfile=new RandomAccessFile("target/21.jpg","rw");
		FileChannel outChannel=outfile.getChannel();
		long transferTo=inChannel.transferTo(0, inChannel.size(), outChannel);
		
		if(transferTo>0) {
			System.out.println("复制成功");
		}
		infile.close();
		inChannel.close();
		outfile.close();
		outChannel.close();
	}

}
