package com.io;

import java.io.File;

public class E715 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File file=new File("E:\\作业\\javajc");
		fileDir(file);
	}	
	public static void fileDir(File file) {
		File[]listFiles=file.listFiles();
		for (File files:listFiles) {
			if(files.isDirectory()) {
				fileDir(files);
			}
			System.out.println(files);
		}
	}
}
