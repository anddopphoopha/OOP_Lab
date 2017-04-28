package Week10_Tu_2;

public class TestInterface2 {
	public void testMethod() {
		System.out.println("This is method from Example" + "1");
	}

	public void testMethod2() {
		System.out.println("This is method from Example" + "2");
	}

	public static void main(String[] args) {
		Example1 myTest = new TestInterface();
		myTest.testMethod();
		//myTest.testMethod2();
		// line X
	}
}
