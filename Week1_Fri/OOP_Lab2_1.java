package Week1_Fri;

import java.util.*;

public class OOP_Lab2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double mygrade = 0;
		Boolean checker = false;
		while (!checker) {
			System.out.println("Please input you grade");
			mygrade = input.nextDouble();
			if (mygrade > 100 || mygrade < 0) {
				System.out.println("Input again");
			} else {
				checker = true;
			}
		}
		System.out.println("Your grade is " + grade(mygrade));
		System.out.println(message(grade(mygrade)));

	}

	public static String grade(double a) {
		String c = "";
		if (a >= 80 && a <= 100) {
			c = "A";
		} else if (a >= 70 && a <= 79.9) {
			c = "B";
		} else if (a >= 60 && a <= 69.9) {
			c = "C";
		} else if (a >= 50 && a <= 59.9) {
			c = "D";
		} else if (a >= 0 && a <= 49.9) {
			c = "F";
		}
		return c;
	}

	public static String message(String a) {
		String b = "";
		if (a.equals("A")) {
			b = "Well done";
		} else if (a.equals("B")) {
			b = "Try a little bit to get the better result";
		} else if (a.equals("C")) {
			b = "So so";
		} else if (a.equals("D")) {
			b = "You almost failed";
		} else if (a.equals("F")) {
			b = "You Lose!!!";
		}

		return b;
	}
}
