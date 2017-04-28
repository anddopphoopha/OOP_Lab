package Week10_Fri_5;

public class Fish extends Animal implements Pet {
	private String name;

	public Fish(int legs, String name) {
		super(legs);
		this.setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void move() {
		System.out.println("fish can swim with " + this.legs + " fin");
	}

	public void eat() {
		System.out.println("fish eat spider");
	}

}
