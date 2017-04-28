package Week7_Fri_1;

import java.util.*;

public class main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		String filename = "C:\\test\\tran.txt";
		transaction one = new transaction(new information(filename));
		boolean checker = true;
		while (checker) {
			one.read();
			System.out.println("1 Add new transaction\n2 Search transaction\n3 Summarize transaction\n0 Exit\nMenu:");
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.print("Please input type: ");
				String type = input2.nextLine();
				System.out.print("Please input debit: ");
				int debit = input.nextInt();
				System.out.print("Please input credit: ");
				int credit = input.nextInt();
				one.write(type, debit, credit);
			} else if (choice == 2) {
				System.out.println("1 Debit search\n2 Credit search");
				int choice2 = input.nextInt();
				System.out.println("Please input the amount you want to search: ");
				if (choice2 == 1) {
					one.searchDebit(input.nextInt());
				} else if (choice2 == 2) {
					one.searchCredit(input.nextInt());
				}
			} else if (choice == 3) {
				one.summarize();
			} else {
				break;
			}
			System.out.println("********************************************************************");
		}
	}
}
