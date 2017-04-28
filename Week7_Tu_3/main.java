package Week7_Tu_3;

import java.util.*;

public class main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		calculator cal = new calculator();

		Boolean checker = true;
		cal.print();
		int choice = input.nextInt();
		if (choice == 1) {
			System.out.println("Input the number1: ");
			cal.setVar(input.nextInt());

			while (checker) {
				cal.print2();
				int choice2 = input.nextInt();
				if (choice2 == 2) {
					cal.print();
					int choice3 = input.nextInt();
					if (choice3 == 1) {
						System.out.println("Input the number2: ");
						cal.add(input.nextInt());
					} else if (choice3 == 0) {
						break;
					}

				} else if (choice2 == 3) {
					cal.print();
					int choice3 = input.nextInt();
					if (choice3 == 1) {
						System.out.println("Input the number2: ");
						cal.mult(input.nextInt());
					} else if (choice3 == 0) {
						break;
					}
				} else if (choice2 == 4) {
					cal.print();
					int choice3 = input.nextInt();
					if (choice3 == 1) {
						System.out.println("Input the number2: ");
						cal.div(input.nextInt());
					} else if (choice3 == 0) {
						break;
					}

				} else if (choice2 == 5) {
					cal.print();
					int choice3 = input.nextInt();
					if (choice3 == 1) {
						System.out.println("Input the number2: ");
						cal.sub(input.nextInt());
					} else if (choice3 == 0) {
						break;
					}
				} else if (choice2 == 6) {
					cal.display();
				} else if (choice2 == 0) {
					break;
				}
			}
		} else {
			System.exit(0);
		}
	}
}
