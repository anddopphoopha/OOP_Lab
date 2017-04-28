package Week7_Tu_2_Nut;

public class Bullet {
	String type;

	public Bullet() {
		type = "null";
	}

	public Bullet(String bulletType) {
		type = bulletType;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String bulletType) {
		this.type = bulletType;
	}
}
