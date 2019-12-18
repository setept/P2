package com.io;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class E21 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		Path ad = Paths.get("d:\\班级信息.txt");
		Path bjmc = Paths.get("d:\\求班级编号.txt");
		Path bjbh=Paths.get("d:\\班级编号.txt");
		List<String> neirong = new ArrayList<>();
		Files.createFile(bjbh);

		List<String> lines = Files.readAllLines(ad);
		List<String> names = Files.readAllLines(bjmc);
		for (String name : names) {
			for (String line : lines) {
				String[] zfcsz = line.split("\t");
				if (name.equals(zfcsz[1])) {
					//System.out.println(zfcsz[0]);
					neirong.add(zfcsz[0]);
				}
			}
		}
		//System.out.println(neirong);
		Files.write(bjbh, neirong,StandardOpenOption.APPEND);
	}
}
