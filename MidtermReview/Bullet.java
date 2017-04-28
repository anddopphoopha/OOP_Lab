package MidtermReview;

public class Bullet {
	private String type;

	public Bullet(int type) {
		if (type == 1) {
			this.type = "Lead";
		} else if (type == 2) {
			this.type = "Gold";
		} else if (type == 3) {
			this.type = "Plasma";
		}
	}

	public String getType() {
		return this.type;
	}
}
