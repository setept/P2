package p1;

public class k2 {
	
	public static void main(String[] args) {
		byte b=1;
		short s=1;
		int i=1;
		long l=1;
		System.out.println("字节型整数数据的长度是"+Byte.SIZE);
		System.out.println("短整型整数数据的长度是"+Short.SIZE);
		System.out.println("整型整数数据的长度是"+Integer.SIZE);
		System.out.println("长整型整数数据的长度是"+Long.SIZE);
		
		System.out.println("字节型整数数据的长度是"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
		System.out.println("短整型整数数据的长度是"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
		System.out.println("整型整数数据的长度是"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
		System.out.println("长整型整数数据的长度是"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
	}
}
