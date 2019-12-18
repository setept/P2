package p1;

public class zxbl {

	public static void main(String[] args) {
		//字面上的整型变量
			System.out.println("二进制以0b开头"+0b11000110);
			System.out.println("八进制以0开头"+0306);
			System.out.println("十六进制以0x开头"+0xc6);
		//字面上的浮点型变量
			System.out.println("单精度浮点数以f结尾"+5.022e+6f);
			System.out.println("双精度浮点数以d结尾"+5.022e+6d);
			System.out.println("双精度浮点数d可以省略"+5.022e+6);
			//Java中的字符常量使用单引号，采用16位unicode编码，用\\uXXXX来表示
			System.out.println("我的名字是"+'\u80e1'+'\u946b'+'\u8339');
			//Java中的字符串常量使用双引号括起来
			System.out.println("Hello,\nSeptember!");
			//Java中的布尔常量只有两个，真true 假false
			System.out.println("布尔型常量"+true+"或者"+false);
			//Java中的null常量,只能引用数据类型
			System.out.println("null常量只有一个"+null+",表示空对象");
			//同变量类似的常量要使用final关键字，常量被赋值后不能在次被修改，常量一般用大写
			final int A=5;//定义一个整型变量a，如果前面加final修饰它变成一个常量
	}

}
