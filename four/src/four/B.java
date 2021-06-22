package four;

import java.awt.Frame;

public class B extends Frame {

	public B() {
		this.addWindowListener(new C(this));
	}
}
