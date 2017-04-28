package Week4_Fri_4;

import java.util.Scanner;

public class Search {
	public static String searchU() {
		String searching;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your username: ");
		searching = input.nextLine();
		return searching;
	}
	
	public static String searchP() {
		String searching;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your password: ");
		searching = input.nextLine();
		return searching;
	}
}
