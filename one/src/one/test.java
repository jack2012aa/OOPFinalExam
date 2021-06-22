package one;

public class test {

	public static void main(String[] args) {

		//1(a)
		A obja = new A();
		B objb = new B();
		obja.m1();
		objb.m1();
		
		//1(c)
		obja.m1();
		obja.m1("Hello");
		
		//1(d)
		A newA = new A(1);
		B newB = new B(1, 2);
		System.out.print(newB.equals(newA));
	}

}
