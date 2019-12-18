package com.abstra;

import org.omg.Messaging.SyncScopeHelper;

abstract class Animal{
	public abstract void shout();
}
class Dog extends Animal{
	public void  shout() {
	System.out.println("汪汪...");
 }
}
public class E12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog=new Dog ();
		dog.shout();
	}

}
