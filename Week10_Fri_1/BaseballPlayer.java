package Week10_Fri_1;

public class BaseballPlayer extends Player {
	protected int numberOfHit;
	private double chanceOfBat;

	public BaseballPlayer(String name, String sport, String team, int numberOfHit, double chanceOfBat) {
		super(name, sport, team);
		this.numberOfHit = numberOfHit;
		this.chanceOfBat = chanceOfBat;
	}

	public BaseballPlayer(String name, String sport, String team) {
		super(name, sport, team);
	}

}
