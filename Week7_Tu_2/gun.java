package Week7_Tu_2;

import java.util.*;

public class gun {
	Scanner input = new Scanner(System.in);
	private Vector<Integer> ammo = new Vector<Integer>();
	private static int count = 0;

	public void reloading(int a) {
		if (count + a <= 5) {
			System.out.println("(1) for lead bullet (2) for gold bullet (3) for plasma bullet");
			for (int i = 0; i < a; i++) {
				int choice = input.nextInt();
				if (choice == 1) {
					addBullet(1);
				} else if (choice == 2) {
					addBullet(2);
				} else if (choice == 3) {
					addBullet(3);
				}
			}
			count += a;
		} else {
			System.out.println("Chamber is full");
		}
	}

	public void addBullet(int a) {
		ammo.addElement(a);
	}

	public void shooting() {
		if (!ammo.isEmpty()) {
			if (ammo.elementAt(0) == 1) {
				System.out.println("Lead Bullet has been used");
			} else if (ammo.elementAt(0) == 2) {
				System.out.println("Gold Bullet has been used");
			} else if (ammo.elementAt(0) == 3) {
				System.out.println("Plasma Bullet has been used");
			}
			ammo.removeElementAt(0);
			random();
		} else {
			System.out.println("There is no bullet");
		}
		
	}

	public void random() {
		int random = 1 + (int) (Math.random() * 2);
		if (random == 2)
			System.out.println("It's high noon");
	}

}
