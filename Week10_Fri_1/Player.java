package Week10_Fri_1;

public class Player {
	private String name;
	private String sport;
	private String team;

	public Player(String name, String sport, String team) {
		this.name = name;
		this.sport = sport;
		this.team = team;
	}

	public String getName() {
		return this.name;
	}

	public String getSport() {
		return this.sport;
	}

	public String getTeam() {
		return this.team;
	}
	
}
