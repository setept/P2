package yichang;

import java.security.PublicKey;

public class E28 {

		
		// TODO 自动生成的方法存根
		public static int divide(int x, int y) {
			try {
			int result=x/y;
			return result;
			} catch(Exception e){
				System.out.println("不获的异常信息为"+e.getMessage());
			}finally {
				System.out.println("asljfhsaljkhikfhnaobnas");
			}
			return -1;
		}
		public static void main(String[] args) {
			int result=divide(4,0);
			if (result==-1) {
				System.out.println("程序发生异常!");
			}else {
			System.out.println(result);
			}
	}
}
