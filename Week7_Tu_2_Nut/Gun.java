package Week7_Tu_2_Nut;

import java.util.*;

public class Gun {

	Iterator<Bullet> bullets;
	Vector<Bullet> bulletType = new Vector<Bullet>();

	Bullet[] chamber = new Bullet[5];

	public Gun() {
		this.bullets = this.bulletType.iterator();
		/*
		 * for (int i = 0; i < 5; i++) { chamber[i] = new Bullet(); }
		 */

	}

	public void shoot(int a) {
		boolean noBullet = false;
		this.bullets = this.bulletType.iterator();
		if (bullets.hasNext()) {

			Bullet currBullet = bullets.next();

			// if (bulletType.elementAt(0).getType().equals("lead")) {
			System.out.println(currBullet.type + "Bullet is used!!!!");
			bullets.remove();

		} else {
			System.out.println("There is no bullet . !!. .");
		}
		if (a == 1 && !noBullet) {
			System.out.println("It's high noon");
		}
	}

	/*
	 * if(this.chamber[0].getType().equals("lead")){
	 * System.out.println("Lead Bullet is used!!!!"); } else
	 * if(this.chamber[0].getType().equals("gold")){
	 * System.out.println("Gold Bullet is used!!!!"); } else
	 * if(this.chamber[0].getType().equals("plasma")){
	 * System.out.println("Plasma Bullet is used!!!!"); } else {
	 * System.out.println("There is no bullet . . ."); noBullet=true; }
	 * 
	 * 
	 * this.chamber[0] = new Bullet(); shift(); //showBullet(); }
	 */

	public void reload(String bulletType) {
		this.bulletType.add(new Bullet(bulletType));
		this.bullets = this.bulletType.iterator();

		/*
		 * for (int i = 0; i < 5; i++) { if
		 * (chamber[i].getType().equals("null")) {
		 * chamber[i].setType(bulletType); i = 5; } }
		 */
		// showBullet();
	}

	public void shift() {
		Bullet temp = this.chamber[0];
		for (int i = 0; i < 4; i++) {

			this.chamber[i] = this.chamber[i + 1];
		}
		this.chamber[4] = temp;

	}

	public void showBullet() {
		for (int i = 0; i < 5; i++) {
			System.out.print("[" + chamber[i].getType() + "]");
		}
		System.out.println("");
	}
}
