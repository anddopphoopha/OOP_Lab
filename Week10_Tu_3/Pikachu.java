package Week10_Tu_3;

public class Pikachu implements Pokemon {
	public void attack(int volts) {
		System.out.println(volts + " volts ");
	}

	public void move(int time) {
		System.out.println("jumped " + time * 5);
	}

	public void specialMove() {
		int random = (int) (Math.random() * 10 - 1) + 1;
		if (random <= 3) {
			System.out.println("paralyzed the enemy");
		} else
			System.out.println("fail");
	}
}
