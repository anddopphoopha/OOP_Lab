package Week7_Tu_1;

import java.util.*;

public class main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		cipher me = new cipher();
		Boolean checker = true;
		System.out.println(
				"Menu\n****************************************\n1 Set up the Machine\n0 Exit\n****************************************\nMenu: ");
		int choice = input.nextInt();
		if (choice == 1) {
			System.out.println("Please enter the shifting position");
			int temp = input.nextInt();
			me.setShift(temp);
			System.out.println("The shifting position is : " + temp + "\nDone");
		} else if (choice == 0) {
		}

		while (checker) {
			System.out.println(
					"\n\nMenu\n****************************************\n1 Encrypt text\n2 Decrypt text\n3 Change the shifting position\n0 Exit\nMenu:");
			int choice2 = input.nextInt();
			if (choice2 == 1) {
				System.out.println("Please enter the plain text");
				String temp = input2.nextLine();
				System.out.println("The encrypted text is : " + me.encrypting(temp) + "\nDone");
			} else if (choice2 == 2) {
				System.out.println("Please enter the cipher text");
				String temp = input2.nextLine();
				System.out.println("The text is : " + me.decrypting(temp) + "\nDone");
			} else if (choice2 == 3) {
				System.out.println("Please enter the shifting position");
				int temp = input.nextInt();
				me.setShift(temp);
				System.out.println("The shifting position is : " + temp + "\nDone");
			} else if (choice2 == 0) {
				break;
			}
		}
	}
}
