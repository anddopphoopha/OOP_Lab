package Week1_Fri;

import java.util.Scanner;

public class OOP_Lab2_3_1 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner input = new Scanner(System.in);
		System.out.print("Please input number: ");
		int num = input.nextInt();
		String star = "*";
		String text = "";
		for (int count = num; count != 0; count--) {
			text = text + star;
			System.out.println(space(count) + text);

		}
		System.out.println("It takes: "+ (System.currentTimeMillis() - start) + " milliseconds to finish excuting the code");
	}

	public static String space(int a) {
		String space1 = " ";
		String text = "";
		for (int count = 1; count < a; count++) {
			text = space1 + text;
		}
		return text;
	}
}
