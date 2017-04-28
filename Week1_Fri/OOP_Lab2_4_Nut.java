package Week1_Fri;

import java.util.*;

public class OOP_Lab2_4_Nut {
	public static void main(String args[]) {
		char tester;
		double income = 0;
		Boolean marry = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Are you married? Y/N");
		tester = input.next().charAt(0);
		if (tester == 'Y' || tester == 'y') {
			marry = true;
		} else if (tester == 'N' || tester == 'n') {
			marry = false;
		}
		System.out.println("What is your income?");
		income = input.nextInt();
		System.out.print("You have to pay" + taxCal(marry, income)+ " in tax.");
	}

	public static double taxCal(Boolean marry, double income) {
		double temp = 0;
		double original = income;
		double tax = 0;
		if (marry) {
			income = income - 7000;
		} else {
			income = income - 4000;
		}
		if (income >= 30000) {
			income -= 30000;
			temp += 3000;
			if (income >= 30000) {
				income -= 30000;
				temp += 6000;
				if (income > 0) {
					tax = (income * 0.3);
					temp += tax;
				}

			}

		}
		else{
			temp=income*0.1;
		}
		return temp;
	}
}



