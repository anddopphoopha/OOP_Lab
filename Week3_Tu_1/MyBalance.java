package Week3_Tu_1;

import java.util.*;

public class MyBalance {

	public static void main(String args[]) {
		Boolean checker = true;
		Scanner input = new Scanner(System.in);
		AccountBalance myBank = new AccountBalance();
		while (checker) {
			System.out.print("[1] View balance\n[2] Withdraw\n[3] Deposit\n[4] Calculate interest\nPlease choose: ");
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println(myBank.view());
			} else if (choice == 2) {
				myBank.with();
				myBank.checkW();
			} else if (choice == 3) {
				myBank.dep();
				myBank.checkD();
			} else if (choice == 4) {
				System.out.println("Your balance after " + myBank.Hyear() + " years is " + myBank.calculateInterest());
			}

			System.out.print("Do you wish to contine?\n[1] Yes\n[2] No\nPlease choose: ");
			int choice2 = input.nextInt();
			if (choice2 == 1){
			} else if (choice2 == 2){
				System.out.println("Thank you for using this bank");
				break;
			}

		}
	}
}
