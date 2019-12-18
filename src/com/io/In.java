package com.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class In {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		InputStream jp=System.in;
		InputStreamReader ir=new InputStreamReader(jp);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("请输入年龄:");
		String line=br.readLine();
		System.out.println("您的年龄是"+line);
		
		System.out.println("自我介绍");
		String line1=br.readLine();
		System.out.println(line1);
	}

}
