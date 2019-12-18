package jieko;
interface Animal{
	public abstract void shout();
}
class Dog implements Animal{
	public void  shout() {
	System.out.println("汪汪...");
 }
}
public class E13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog=new Dog ();
		dog.shout();
	}
}