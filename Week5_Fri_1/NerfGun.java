package Week5_Fri_1;

public class NerfGun {
	private int ammo;
	private static int count = 0;
	private int ID;

	public NerfGun() {
		this(0);
		this.ID = count;
		count++;
	}

	public NerfGun(int ammo) {
		this.ammo = ammo;
		this.ID = count;
		count++;
	}

	public void fire() {
		if (this.ammo == 0)
			System.out.println("There is no ammunition");
		else {
			System.out.println("Bang!!!");
			this.ammo = this.ammo - 1;
		}
	}

	public void reload(int reload) {
		if (this.ammo + reload > 15)
			System.out.println("Error!! the ammunition cannot be reloaded");
		else
			this.ammo = this.ammo + reload;
	}

	public void displayGunID() {
		System.out.println("The ID of this gun is " + this.ID);
	}

	public void displayNumOfAmmunition() {
		System.out.println(this.ammo + " bullet left");
	}
}
