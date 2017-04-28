package Week8_Fri_3_4;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ATM one = new ATM();
		boolean checker = true;
		while (checker) {
			System.out.println("Menu\n1 Withdraw\n2 Deposit\n3 See ATM Balance");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Please input amount to withdraw: ");
				one.withdraw(input.nextInt());
				break;
			case 2:
				System.out.println("Please input amount to deposit: ");
				one.deposit(input.nextInt());
				break;
			case 3:
				one.printBalance();
				break;
			default:
				checker = false;
				break;
			}
		}
	}
}
