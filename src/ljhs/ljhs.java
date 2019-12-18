package ljhs;
class Person{
	public void finalize() {
		System.out.println("垃圾回收...");
	}
}
public class ljhs {
	public static void recyclegWaste1() {
		Person p1=new Person();
		p1=null;
		int i=1;
		while(i<10) {
			System.out.println("很瓜皮...");
			i++;
		}
	}
	
	public static void recyclegWaste2() {
		Person p2=new Person();
		p2=null;
		System.gc();
		int i=1;
		while(i<10) {
			System.out.println("瓜皮瓜皮...");
			i++;
		}
	}
	public static void main(String[] args) {
		recyclegWaste1();
		System.out.println("============================");
		recyclegWaste2();
	}
}
