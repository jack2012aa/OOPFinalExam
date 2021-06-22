package two;

import java.sql.SQLException;

public class F implements D, E {

	@Override
	public void m1() throws RuntimeException, SQLException {
		System.out.println("HI");
	}

}
