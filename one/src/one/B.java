package one;

public class B extends A {

	private int b;

	public B() {}
	
	public B(int a, int b) {
		this.setA(a);
		this.setB(b);
	}
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
//	public void m1() {
//		System.out.println("Class B verion of m1");
//	}
	
	//1(b)
//	public void m1(int number) {
//		System.out.printf("%d\n", number);
//	}
//	public int m1() {
//		System.out.println("Class B verion of m1");
//	}
//	private void m1() {
//		System.out.println("Class B verion of m1");
//	}
//	public static void m2() {
//		System.out.println("Class B version of m2");
//	}
//	public final void m3() {
//		System.out.println("Class B version of m3");
//	}
	
	//1(d)
	public boolean equals(B obj) {
		if (this.getA() == obj.getA() && this.getB() == obj.getB()) {
			return true;
		}
		return false;
	}
	
}
