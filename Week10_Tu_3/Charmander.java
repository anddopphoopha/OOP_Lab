package Week10_Tu_3;

public class Charmander implements Pokemon{

	@Override
	public void attack(int number) {
		System.out.println("spit fire in " + number + " min");
		
	}

	@Override
	public void move(int time) {
		System.out.println("ran " + time*10);
		
	}

	@Override
	public void specialMove() {
		int random = (int) (Math.random() * 2 - 1) + 1;
		if(random == 1){
			System.out.println("Burn enemy");
		} else
			System.out.println("fail");
		
	}

}
