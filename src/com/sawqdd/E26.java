package com.sawqdd;
@FunctionalInterface
interface PersonBuilder{
	Person buildPerson(String name);
}

class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}

public class E26 {
	public static void printName(String name,PersonBuilder builder) {
		System.out.println(builder.buildPerson(name).getName());
}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		printName("黄渤",name->new Person(name));
		printName("庹giao", Person::new);
	}

}
