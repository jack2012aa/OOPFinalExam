package two;

public class C extends A implements Cloneable{

	private int n3;
	
	public C(C obj) {
		this.setN1(obj.getN1());
		this.setN2(obj.getN2());
		this.setN3(obj.getN3());
	}
	
	public Object clone() {
		return (C) super.clone();
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}
	
	public C(int n1, int n2, int n3) {
		super(n1, n2);
		this.setN3(n3);
	}
	
}
