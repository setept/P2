package com.jihe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class E638 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<String>list=Arrays.asList("张三","李四","王五","赵六");
		Stream<String> parallelStream=list.parallelStream();
		System.out.println(parallelStream.isParallel());
		Stream<String>stream=stream=Stream.of("张三","李四","王五","赵六");
		Stream<String> parallel=stream.parallel();
		System.out.println(parallel.isParallel());
	}

}
