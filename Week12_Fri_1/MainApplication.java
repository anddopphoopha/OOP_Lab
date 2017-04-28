package Week12_Fri_1;

public class MainApplication {
	public static void main(String args[]) {
		E e = new E();
		B ai = new AI();
		I1 p = new C();
		Container c = new Container(e, ai, p);
		c.Act();
		c.Act();
		c.Act();
		c.Act();
		c.Act();
		c.Act();
	}
}
