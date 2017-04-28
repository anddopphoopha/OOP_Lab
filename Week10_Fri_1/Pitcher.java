package Week10_Fri_1;

public class Pitcher extends BaseballPlayer {
	private int successDeliver;
	private double numberOfThrow;

	public Pitcher(String name, String sport, String team, int successDeliver, double chanceAtMound,
			double numberOfThrow) {
		super(name, sport, team);
		this.successDeliver = successDeliver;
		this.numberOfThrow = numberOfThrow;
	}

	public double averageSuccess() {
		return successDeliver / numberOfThrow;
	}

}
