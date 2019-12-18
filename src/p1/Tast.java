package p1;

import java.time.format.TextStyle;

public class Tast {

	public Tast() {
		System.out.println("构造方法一被调用了");
	}
	public Tast(int x) {
		this();
		System.out.println("构造方法二被调用了");
	}
	public Tast(boolean  b) {
		this(1);
		System.out.println("构造方法三被调用了");
	}

	public static void main(String[] args) {
		Tast test=new Tast(true);

	}

}
