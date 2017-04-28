package Week12_Fri_1;

import java.util.*;

public class Container {
	int count = 0;
	private Vector<I1> something = new Vector<I1>();
	B a;

	public Container(I1 b, B a, I1 c) {
		this.a = a;
		this.something.add(b);
		this.something.add(c);
	}

	public void Act() {
		if (count == 1) {
			a = new AI();
			AI ai = (AI) a;
			ai.IwannaSay();
		} else if (count == 0) {
			something.elementAt(0).IwannaSay();
		} else if (count == 2) {
			something.elementAt(1).IwannaSay();
		}
		count++;
		if (count == 3)
			count = 0;
	}
}
