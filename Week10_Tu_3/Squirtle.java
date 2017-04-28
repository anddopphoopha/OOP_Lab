package Week10_Tu_3;

public class Squirtle implements Pokemon{

	@Override
	public void attack(int number) {
		System.out.println("release water " + number);
		
	}

	@Override
	public void move(int time) {
		System.out.println("swam " + time*3);
		
	}

	@Override
	public void specialMove() {
		int random = (int) (Math.random() * 10 - 1) + 1;
		if (random <= 1) {
			System.out.println("deflect the attack");
		} else
			System.out.println("fail");
		
	}

}
