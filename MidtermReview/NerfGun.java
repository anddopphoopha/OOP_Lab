package MidtermReview;

public class NerfGun {
	private static int ammo;
	private static int count = 0;

	public NerfGun() {
		this(0);
	}

	public NerfGun(int ammo) {
		this.ammo = ammo;
		this.count += 1;
	}

	public void fire() {
		if (this.ammo <= 0) {
			System.out.println("There is no ammunition");
		} else {
			System.out.println("Bang!!!");
			this.ammo--;
		}
	}

	public void reload(int amount) {
		if (amount + this.ammo > 15) {
			System.out.println("Error this ammo cannot be reloaded");
		} else {
			this.ammo += amount;
		}
	}

	public void displayNumOfAmmunition() {
		System.out.println(this.ammo);
	}

	public void displayGunID() {
		System.out.println(this.count);
	}
}
