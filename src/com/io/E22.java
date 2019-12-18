package com.io;

import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E22 {

	public static void main(String[] args) throws Exception {
		Path ad = Paths.get("d:\\班级信息.txt");
		Path bjmc = Paths.get("d:\\求班级编号.txt");
		Path bjbh=Paths.get("d:\\班级编号1.txt");
		List<String> neirong = new ArrayList<>();
		Files.createFile(bjbh);
		
		List<String> lines = Files.readAllLines(ad);
		List<String> names = Files.readAllLines(bjmc);
		Map<String, String> map=new HashMap<>();
		for(String line:lines) {
			String[] zfcsz=line.split("\t");
			map.put(zfcsz[1],zfcsz[0]);
		}
		for(String name:names) {
			neirong.add(map.get(name));
		}
		Files.write(bjbh,neirong,StandardOpenOption.APPEND);
	}

}
