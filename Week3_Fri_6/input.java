package Week3_Fri_6;

import java.util.Scanner;

public class input {
	public static String Input() {
		Scanner input = new Scanner(System.in);
		String manu = "";
		String model = "";
		String price = "";
		String inventory = "";
		System.out.print("Please input your manufacturer: ");
		manu = input.nextLine();
		System.out.print("Please input your model: ");
		model = input.nextLine();
		System.out.print("Please input your price: ");
		price = input.nextLine();
		System.out.print("Please input your inventory: ");
		inventory = input.nextLine();
		return "," + manu + "," + model + "," + price + "," + inventory;
	}
}
