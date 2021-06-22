package two;

public class A implements Cloneable {
	
	private int n1;
	private int n2;
	
	public A(A obj) {
		this.setN1(obj.getN1());
		this.setN2(obj.getN2());
	}
	
	public Object clone() {
		try {
			return (A) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public A() {}
	
	public A(int n1, int n2) {
		this.setN1(n1);
		this.setN2(n2);
	}
	
}
