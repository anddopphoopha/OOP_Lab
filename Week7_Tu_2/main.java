package Week7_Tu_2;

import java.util.*;

public class main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		gun ak = new gun();
		boolean checker = true;
		while (checker) {
			System.out.println(
					"McCree Ability\n****************************************\n1 Shoot\n2 Reload\n0 Exit\n****************************************\nMenu :");
			int choice = input.nextInt();
			if (choice == 1) {
				ak.shooting();
			} else if (choice == 2) {
				System.out.println("How many bullet you want to load :");
				ak.reloading(input.nextInt());
			} else if (choice == 0) {
				break;
			}
		}
	}
}
