package Week9_Fri_2_1;

public class Employee extends Person {
	protected String empID = "0";

	public Employee() {
		// line X
		super();
		System.out.println("Employee => Default Constructor");
	}

	public Employee(String name, int age, double height, double weight, String empID) {
		super(name, age, height, weight);
		this.empID = empID;
		System.out.println("Employee => Parameterized Constructor");
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

	public static void main(String args[]) {
		Employee myEmployee2 = new Employee("Sombra", 17, 170.0, 65.0, "001");
		myEmployee2.printInfo();
		myEmployee2.setAge(20);
		myEmployee2.printInfo();
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("empID : " + empID + " " + super.weight + " " + super.height);
	}
}
