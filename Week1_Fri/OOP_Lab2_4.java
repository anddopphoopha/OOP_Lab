package Week1_Fri;

import java.util.Scanner;

public class OOP_Lab2_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Boolean checker = true;
		System.out.println("Are you married: ");
		String ans = input.next();
		if (ans.equals("yes")) {
		} else if (ans.equals("no")) {
			checker = false;
		}
		System.out.println("Your tax is " + Marriage(checker));

	}

	public static double Marriage(boolean a) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input income");
		double inc = input.nextDouble();
		double tax = 0;
		double temp = 0;
		if (a) {
			System.out.println("You are Married");
			inc = inc - 7000;
		} else {
			System.out.println("You are Single");
			inc = inc - 4000;
		}

		if (inc >= 30000) {
			inc -= 30000;
			temp += 3000;
			if (inc >= 30000) {
				inc -= 30000;
				temp += 6000;
				if (inc > 0) {
					tax = (inc * 0.3);
					temp += tax;
				}

			}

		}
		else{
			temp=inc*0.1;
		}
		return temp;
	}

}