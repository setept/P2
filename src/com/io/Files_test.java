package com.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		Path directorPath=Paths.get("D:/test/sample");
		//定义
		Files.createDirectories(directorPath);
		System.out.println("目录创建成功!");
		Path filePath=Paths.get("D:/test/sample/test.txt");
		Files.createFile(filePath);
		List<String>list=new ArrayList<String>();
		list.add("这是一个测试文件");
		Files.write(filePath,list,StandardOpenOption.APPEND);
		List<String>lines=Files.readAllLines(filePath);
		System.out.println("文件的大小为:"+Files.size(filePath));
		System.out.println("文件中的内容为:"+lines);
	}

}
