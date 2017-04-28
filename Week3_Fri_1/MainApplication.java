package Week3_Fri_1;

public class MainApplication {
	public static void main(String[] args) {
		StaticTest1 myObj1 = new StaticTest1();
		StaticTest1 myObj2 = new StaticTest1();
		// I print the value from the first object.
		System.out.println("1st Value of myObj1 " + myObj1.getVar1());
		System.out.println("2nd Value of myObj1 " + myObj1.getVar2());
		System.out.println();
		// I print the value from the second object.
		System.out.println("1st Value of myObj2 " + myObj2.getVar1());
		System.out.println("2nd Value of myObj2 " + myObj2.getVar2());
		System.out.println();
		// I change the value of the first object to 100.
		System.out.println("Valuea of myObj1 is changed to 100.");
		myObj1.setVar(100);
		System.out.println();
		// I print the value from the first object.
		System.out.println("1st Value of myObj1 " + myObj1.getVar1());
		System.out.println("2nd Value of myObj1 " + myObj1.getVar2());
		System.out.println();
		// I print the value from the second object.
		// I have not done anything to the second object.
		System.out.println("1st Value of myObj2 " + myObj2.getVar1());
		System.out.println("2nd Value of myObj2 " + myObj2.getVar2());
		System.out.print(myObj1.getCounter());
	}
	
	
}
