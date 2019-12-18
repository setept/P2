package p1;
class xs{
	static String schoolName;
}
public class E12 {

	public static void main(String[] args) {
		xs stu1 = new xs();
		xs stu2 = new xs();
		xs.schoolName="js";
		
		System.out.println("我是"+stu1.schoolName+"的学生");
		System.out.println("我是"+stu2.schoolName+"的学生");
	}

}
