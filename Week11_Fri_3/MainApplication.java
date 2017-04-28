package Week11_Fri_3;

public class MainApplication {
	public static void main(String[] args) {
		ClassA obj1 = new ClassA();
		ClassB obj2 = new ClassB();
		ClassC obj3 = new ClassC();
		if (obj1 instanceof ClassC) {
			System.out.println("The result is TRUE.");
		} else {
			System.out.println("The result is FALSE.");
		}
	}
}
