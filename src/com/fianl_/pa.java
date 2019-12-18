package com.fianl_;

class Animal {
	public void shout() {
	}

	@Override // 重写父类
	public String toString() {
		return "这是一只双giao";
	}
}

class Dog extends Animal {
	public void shout() {
	}

	@Override // 重写父类
	public String toString() {
		return "这是一只庹giao";
	}
}

public class pa {
	public static void main(String[] args) {
		Dog pa2 = new Dog();
		Animal pa1 = new Animal();
		System.out.println(pa1.toString());
		System.out.println(pa2.toString());
		// TODO 自动生成的方法存根
	}
}
