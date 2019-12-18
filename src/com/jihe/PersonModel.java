package com.jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonModel {


	public PersonModel(String string, int i, String string2) {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		@SuppressWarnings("unused")
		List<PersonModel> list=new ArrayList<>();
		PersonModel p1=new PersonModel("Wang Yu",18,"男");
		PersonModel p2=new PersonModel("zhang san",20,"男");
		PersonModel p3=new PersonModel("li si",22,"女");
		PersonModel p4=new PersonModel("zhao qiao",28,"男");
		list=Arrays.asList(p1,p2,p3,p4);
	}
}
