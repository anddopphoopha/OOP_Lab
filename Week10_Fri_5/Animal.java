package Week10_Fri_5;

public abstract class Animal {
	protected int legs;

	public Animal(int legs) {
		this.legs = legs;
	}

	public abstract void move();

	public abstract void eat();

}
