package com.io;

import java.io.FileWriter;


public class E708 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		FileWriter fileWriter=new FileWriter("writer.txt");
		fileWriter.write("你悄地莫地走了,\r\n");
		fileWriter.write("正如你偷地摸地来,\r\n");
		fileWriter.write("我一巴掌打到你脸上,\r\n");
		fileWriter.write("在你脸上留下了巴掌印.\r\n");
		
		fileWriter.close();
	}
}
