package Week1_Fri;

import java.util.*;

public class OOP_Lab2_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String ans = "" + num;
		test(ans);
	}

	public static void test(String a) {
		int rep = 0;

		String c = "";
		char[] b = a.toCharArray();
		Boolean checker = true;
		int sum = 0;
		while (checker) {
			if (b.length > 1) {
				sum = 0;
				for (int count = 0; count < b.length; count++) {
					if (b[count] == '1') {
						rep = 1;
					} else if (b[count] == '2') {
						rep = 2;
					} else if (b[count] == '3') {
						rep = 3;
					} else if (b[count] == '4') {
						rep = 4;
					} else if (b[count] == '5') {
						rep = 5;
					} else if (b[count] == '6') {
						rep = 6;
					} else if (b[count] == '7') {
						rep = 7;
					} else if (b[count] == '8') {
						rep = 8;
					} else if (b[count] == '9') {
						rep = 9;
					} else if (b[count] == '0') {
						rep = 0;
					}

					sum = sum + rep;
					c = "" + sum;
					
				}
				System.out.println(c);
				b = c.toCharArray();

			} else {
				checker = false;
			}
		}
		if (sum % 9 != 0) {
			System.out.println("This number is not divisible by 9");
		} else {
			System.out.println("This number is divisible by 9");
		}

	}

}
