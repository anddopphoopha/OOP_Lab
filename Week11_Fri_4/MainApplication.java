package Week11_Fri_4;

public class MainApplication {
	public static void main(String[] args) {

		/*ClassA obj1 = new ClassA();
		ClassA obj2 = new ClassC();
		obj1.greet3();
		obj2.greet3();*/

		ClassA obj1 = new ClassA();
		ClassC obj2 = obj1.toClassC();
		System.out.println(obj1 instanceof ClassC);
		obj1.greet3();
		obj2.greet4();
	}
}
