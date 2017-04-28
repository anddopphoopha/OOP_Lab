package Week1_Fri;

import java.util.Arrays;
import java.util.Scanner;

public class OOP_Lab2_3_1_Lee {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		int num = input.nextInt();
		input.close();
		stars(num);
		System.out.println("It takes: "+ (System.currentTimeMillis() - start) + " milliseconds to finish excuting the code");
	}

	public static void stars(int num) {
		int i = 1;
		while (i <= num) {
			char[] stars = new char[i];
			char[] space = new char[num - i];
			Arrays.fill(stars, '*');
			Arrays.fill(space, ' ');
			i++;
			String result = new String(space) + new String(stars);
			System.out.println(result);

		}
	}

}
