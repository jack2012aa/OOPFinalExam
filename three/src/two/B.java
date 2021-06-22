package two;

public class B {

	private Object obja;

	public B(A obja) throws Exception {
		for (Class c : obja.getClass().getInterfaces()) {
			if (c.getName().equals("Cloneable")) {
				this.setObja(obja);
				return;
			}
		}
		throw new Exception();
	}
	
	public B() {}
	
	public A getObja() {
		return (A) ((A)obja).clone();
	}

	public void setObja(A obja) {
		this.obja = obja.clone();
	}
	
	
}
