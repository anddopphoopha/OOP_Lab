package MidtermReview;

import java.util.*;

public class Gun {
	private Vector<Bullet> ammo = new Vector<Bullet>();
	private Scanner input = new Scanner(System.in);

	public void shooting() {
		if (ammo.size() > 0) {
			System.out.println(ammo.elementAt(0).getType() + " is used");
			ammo.remove(0);
		} else {
			System.out.println("There is no bullet.");
		}
	}

	public void reloading(int reload) {
		System.out.println(
					"Please input type of bullet: \n(1) for lead bullet (2) for gold bullet (3) for plasma bullet");
		for (int count = 0; count < reload; count++) {
			ammo.add(new Bullet(input.nextInt()));
		}

	}
}
