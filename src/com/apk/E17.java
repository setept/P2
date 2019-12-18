package com.apk;

public class E17 {

	public static void main(String[] args) {
		//自动折箱：将int这个基本数据类型的变量装到Intger
		int a=20;
		Integer b=a;
		System.out.println(b);
		//自动折箱：将Integer这个引用数据类型的对象折开变成int这个基本数据类型的变量
		int c=b;
		System.out.println(c);
		System.out.println(a);
		//将字符串转成整数的3中方法
		String cj="88";
		String cj1=cj+10;
		System.out.println(cj1);
		System.out.println("No.1:包装类的valueOf方法--->"+(Integer.valueOf(cj)+10));
		System.out.println("No.2:包装类的parseXXX方法--->"+(Integer.parseInt(cj)+10));
		System.out.println("No.3:包装类的构造方法--->"+(new Integer(cj)+10));
		
		Integer zs=88;
		System.out.println("No.1:包装类的valueOf方法--->"+Integer.valueOf(zs));
		System.out.println("No.2:String类的toString方法--->"+zs.toString(zs)+10);
		System.out.println("No.3:空串连接整数数法--->"+ zs+"");
	}

}
