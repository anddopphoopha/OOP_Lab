package Week1_Fri;

import java.util.Scanner;

public class OOP_Lab2_3_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input number: ");
		int num = input.nextInt();
		int num2 = 1;
		for (int count = num; count != 0; count--) {
			System.out.println(space(count) + something(num2));
			num2++;
		}
		
	}

	public static String something(int a) {
		String text = "";
		String star = "*";
		for (int count = 1; count <= a; count++) {
			if (count % 2 == 1) {
				text = text + count;
			} else {
				text = text + star;
			}
		
		}
		return text;
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
