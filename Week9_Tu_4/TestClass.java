package Week9_Tu_4;

public class TestClass {
	public static void main(String args[]) {
		MotherClass mother = new MotherClass();
		System.out.println("This is the mother.sayHello()");
		mother.sayHello();
		ChildClass child = new ChildClass();
		System.out.println("This is the child.sayHello()");
		child.sayHello();
		System.out.println("This is the child.sayHello2()");
		child.sayHello2();
	}
}