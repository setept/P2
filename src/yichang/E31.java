package yichang;
class BclException extends Exception{

	public BclException() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public BclException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}
	
}
public class E31 {
	public static int divide(int x,int y)throws BclException{
		if (y==0) {
			throw new BclException("除数不能为0");
		}
		int result=x/y;
		return result;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
		int result=divide (4,0);
		System.out.println(result);
		} catch (Exception e) {
			System.out.println("捕获的异常信息为:"+e.getMessage());
		}
	}
}
