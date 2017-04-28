package Week7_Tu_2_Nut;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		Gun gun1 = new Gun();
		int looper = 0;
		while (looper == 0) {
			System.out.print("");
			looper = mainMenu(gun1, ((Math.random() <= 0.5) ? 1 : 2));

		}

	}

	public static int mainMenu(Gun gun1, int chance) {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"McCree Ability \n****************************************\n1 Shoot\n2 Reload\n0 Exit\n****************************************");
		System.out.print("Menu : ");
		int select = input.nextInt();
		int temp = 0;
		if (select == 1) {
			gun1.shoot(chance);

		} else if (select == 2) {
			reloadSelection(gun1);
		} else if (select == 0) {
			System.out.print("Program will now terminate. . .");
			temp = 1;
		} else {
			System.out.print("Incorrect Input!");
		}
		return temp;

	}

	public static void reloadSelection(Gun gun1) {
		Scanner input2 = new Scanner(System.in);

		int amountReload = 0;
		boolean looper = true;
		// while (looper) {
		System.out.print("How many bullet you want to load : ");
		amountReload = input2.nextInt();
		/*
		 * if (amountReload > 5) { System.out.
		 * println("Amount of bullet more than the chamber size . . ."); } else{
		 * looper=false; }
		 */
		// }
		System.out.println("(1) for lead bullet (2) for gold bullet (3) for plasma bullet");
		for (int i = 0; i < amountReload; i++) {
			int bulletSelect = input2.nextInt();
			if (bulletSelect == 1) {
				gun1.reload("lead");
			} else if (bulletSelect == 2) {
				gun1.reload("gold");
			} else if (bulletSelect == 3) {
				gun1.reload("plasma");
			} else {
				System.out.println("Sorry incorrect bullet type.");
				i--;
			}
		}

	}
}
