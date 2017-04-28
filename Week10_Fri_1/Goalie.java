package Week10_Fri_1;

public class Goalie extends SoccerPlayer {
	private int numOfGoals;
	private int numOfMiss;

	public Goalie(String name, String sport, String team, int numOfGoals, int numOfMiss) {
		super(name, sport, team);
		this.numOfGoals = numOfGoals;
		this.numOfMiss = numOfMiss;
	}

	public void calAllowGoal() {
		System.out.println(numOfGoals - numOfMiss);
	}

}
