package com.apk;

import java.io.IOException;

import javax.swing.text.rtf.RTFEditorKit;

public class E12 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO 自动生成的方法存根
		Runtime rt=Runtime.getRuntime();
		System.out.println("处理器的个数"+rt.availableProcessors()+"个");
		System.out.println("空闲内存的大小"+rt.freeMemory()/1024/1024+"M");
		System.out.println("最大可用内存大小:"+rt.maxMemory()/1024/1024+"M");
		
		Process jc=rt.exec("notepad");
		Thread.sleep(5000);
		jc.destroy();
	}

}
