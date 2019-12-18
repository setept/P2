package p1;

public class Operator {

	public static void main(String[] args) {
		//算术运算符
		int i=1;
		int j=1;
		System.out.println("后加"+(i++));
		System.out.println("先加"+(++j));
		System.out.println("不管做先加还是后加以后变量的值的加了1，i="+i);
		System.out.println("不管做先加还是后加以后变量的值的加了1，j="+j);
		//赋值运算符
		int a=2;
		a+=3;//等价于a=a+3
		System.out.println(a);
		//比较运算符
		String s1="hello";
		String s2="hello";
		k2 e1=new k2();
		k2 e2=new k2();
		System.out.println(s1==s2);
		System.out.println(e1==e2);
	}

}
