package aw;
interface Animal{
	void shout();

	void catchMouse();
}
class Cat implements Animal{
	public void shout() {
		System.out.println("喵喵......");
	}

public void catchMouse() {
	System.out.println("小猫抓老鼠......");
	}
}
public class wa {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Animal an1=new Cat();
		Cat cat=(Cat)an1;
		an1.shout(); 
		an1.catchMouse();
		}
}
