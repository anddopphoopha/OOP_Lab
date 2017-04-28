package Week3_Fri_6;

import java.util.Scanner;

public class Search {
	public static String search() {
		String searching;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter what you want to look for: ");
		searching = input.nextLine();
		return searching;
	}
}
