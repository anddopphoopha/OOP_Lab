package Week1_Fri;

import java.util.Scanner;

public class OOP_Lab2_3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input number: ");
		int num = input.nextInt();
		something(num);
	}

	public static void something(int a) {
		String under = "*_*";
		String star = "*";
		String space1 = " ";
		int b = a - 1;

		for (int count = 1; count <= a; count++) {
			String text = "";
			for (int count3 = b; count3 != 0; count3--) {
				text = space1 + text;
			}
			b--;
			System.out.print(text);
			for (int count2 = 1; count2 <= a; count2++) {

				if (count == count2) {
					System.out.print(under);
				} else {
					System.out.print(star);
				}
			}
			System.out.println("");
			
		}
	}

}
