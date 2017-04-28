package Week2_Tu_1;

import java.util.*;

public class MainStudent3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student Apisit = new Student("Apisit", "4921362", 0);
		System.out.println("Please input score for Apisit: ");
		Apisit.score = input.nextInt();
		Student Thaksin = new Student("Thaksin", "54223456", 0);
		System.out.println("Please input score for Thaksin: ");
		Thaksin.score = input.nextInt();
		Student Samak = new Student("Samak", "489653", 0);
		System.out.println("Please input score for Samak: ");
		Samak.score = input.nextInt();
		System.out.println("Between " + Apisit.name + " & " + Thaksin.name + "\n" + Apisit.compareScore(Thaksin)
				+ " has the greater score");

	}

}
