package Week8_Fri_3_5;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input whole number: ");
		int num = input.nextInt();
		String month;
		if (num == 1) {
			month = "January";
		} else if (num == 2) {
			month = "Feburary";
		} else if (num == 3) {
			month = "March";
		} else if (num == 4) {
			month = "April";
		} else if (num == 5) {
			month = "May";
		} else if (num == 6) {
			month = "June";
		} else if (num == 7) {
			month = "July";
		} else if (num == 8) {
			month = "August";
		} else if (num == 9) {
			month = "September";
		} else if (num == 10){
			month = "October";
		} else if (num == 11) {
			month = "November";
		} else if (num == 12) {
			month = "December";
		} else {
			month = "Invalid value";
		}
		System.out.println(month);
	}
}
