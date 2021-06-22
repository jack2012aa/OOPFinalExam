package one;

public class A {

	private int a;

	public A() {}
	
	public A(int a) {
		this.setA(a);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public void m1() {
		System.out.println("Class A version of m1");
	}
	
	//1(b)
	public static void m2() {
		System.out.println("Class A version of m2");
	}
	public final void m3() {
		System.out.println("Class A version of m3");
	}
	
	//1(c)
	public void m1(String s) {
		System.out.println("Class A overloading m1 + " + s);
	}
	
	//1(d)
	public boolean equals(A obj) {
		if (this.getA() == obj.getA()) {
			return true;
		}
		return false;
	}
}
