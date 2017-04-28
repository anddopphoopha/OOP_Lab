package Week9_Fri_3;

public class Employee extends Person {
	protected String empID = "0";

	public Employee() {
		// line X
		super();
	}

	public Employee(String name, int age, double height, double weight, String empID) {
		super(name, age, height, weight);
		this.empID = empID;
	}

	public void setName(String name) {
		super.name = name;
	}

	public void setAge(int age) {
		super.age = age;
	}

	public void setHeight(double height) {
		super.height = height;
	}

	public void setWeight(double weight) {
		super.weight = weight;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("empID : " + empID + " " + super.weight + " " + super.height);
	}

	public void printHello() {
		System.out.println("Hello Employee");
	}

	public void printSth() {
		System.out.println("Something");
	}

	public static void main(String args[]) {
		Person myEmployee1 = new Person();
		Person myEmployee2 = new Employee();
		myEmployee1.printHello();
		myEmployee2.printHello();
		//myEmployee2.printSth();
	}

}
