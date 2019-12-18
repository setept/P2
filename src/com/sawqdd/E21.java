package com.sawqdd;
interface Animal{
	void shout();
}

public class E21 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String name="庹giao";
		animalShout(new Animal() {
			
			@Override
			public void shout() {
				// TODO 自动生成的方法存根
				System.out.println(name+" giaogiao...");
			}
		});
		animalShout(()->{System.out.println(name+"庹giao");
			System.out.println("你是一只庹giao");});
		}
	
	public static void animalShout(Animal an) {
		an.shout();
	}
}
