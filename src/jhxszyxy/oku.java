package jhxszyxy;

public class oku {

	public static void main(String[] args) {
		xs s1=new xs();
		s1.setName("mike");
		s1.setAge(600);
		xs s2=new xs(590,"serend");
		System.out.println(s1.getName()+"考了"+s1.getAge()+"分");
		System.out.println(s2.getName()+"考了"+s2.getAge()+"分");
		
		kc c1=new kc();
		c1.setCourse_name("java程序设计");
		c1.setCourse_book("java基础入门");
		System.out.println(c1.getCourse_name()+"这门课使用的教材是《"+c1.getCourse_book()+"》");
	}

}
