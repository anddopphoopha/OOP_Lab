package Week10_Fri_5;

public class Spider extends Animal {

	public Spider(int legs) {
		super(legs);
	}

	public void move() {
		System.out.println("Spiders are cute and can crawl with " + this.legs + " legs");

	}

	public void eat() {
		System.out.println("Spider eat cat");

	}

}
