package Week4_Tu_0;

public class TestClass {
	public static void main(String args[]) {
		System.out.println("Creating 1st object");
		ConstructorExample obj1 = new ConstructorExample();
		System.out.println(obj1.getName());
		System.out.println("Creating 2nd object");
		ConstructorExample obj2 = new ConstructorExample("OOP");
		System.out.println(obj2.getName());
	}
}
