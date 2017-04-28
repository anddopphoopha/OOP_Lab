package Week9_Fri_2_1;

public class Person {
	protected String name = "Orisa";
	protected int age = 1;
	protected double height = 200.0;
	protected double weight = 1000.0;

	public Person() {
	}

	public void printInfo() {
		System.out.println(name + " " + age + " years old");
	}

	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}