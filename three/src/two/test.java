package two;

public class test {

	public static void main(String[] args) {

		//2(b)
		A objA1 = new A(1, 2);
		C objC1 = new C(1, 2, 3);
		try {
			B objB1 = new B(objA1);
			B objB2 = new B(objC1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
