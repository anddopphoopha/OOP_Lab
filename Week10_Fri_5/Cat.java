package Week10_Fri_5;

public class Cat extends Animal implements Pet {

	private String name;

	public Cat(int legs, String name) {
		super(legs);
		this.setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void move() {
		System.out.println("Cat can walk with " + this.legs + " legs");
	}

	@Override
	public void eat() {
		System.out.println("cat eat fish");

	}

}
