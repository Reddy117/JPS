
public class Test {

	public static void main(String[] args) {
		InterF f=new Chul();
		
		f.m1().m2();
		
		f.m1();
		
		InterP ip=new Child();
		ip.m2();
	}
}
