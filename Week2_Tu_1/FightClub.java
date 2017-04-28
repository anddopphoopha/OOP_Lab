package Week2_Tu_1;

import java.util.Scanner;

public class FightClub {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student Andrew = new Student("Andrew", "592115035", 0);
		System.out.println("Please input score for Andrew: ");
		Andrew.score = input.nextInt();
		Student Awesome = new Student("Awesome", "592115xxx", 0);
		System.out.println("Please input score for Awesome: ");
		Awesome.score = input.nextInt();
		Andrew.fightClub(Awesome);
	}
}
