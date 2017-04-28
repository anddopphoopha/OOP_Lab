package Week3_Fri_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class readWrite {
	Scanner input = new Scanner(System.in);
	public static String text = "";
	public static int ID = 0;
	public static String searching = "";

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

	public static String Read(String a) {
		text = "";
		try {
			byte[] buffer = new byte[1000];
			FileInputStream inputStream = new FileInputStream(a);
			while (inputStream.read(buffer) != -1) {
				text = text + new String(buffer);
			}
			inputStream.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + a + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + a + "'");
		}
		return text;
	}

	public static void Write(String a, String b) {
		try {
			String bytes = a;
			byte[] buffer = bytes.getBytes();
			FileOutputStream outputStream = new FileOutputStream(b, true);
			outputStream.write(13);
			outputStream.write(10);
			outputStream.write(buffer);
			outputStream.close();
		} catch (IOException ex) {
			System.out.println("Error writing file '" + b + "'");
		}
	}

	public static String getID(String a) {
		int ID;
		String delim = "\n";
		String[] token = a.split(delim);
		ID = token.length + 1;
		String i = "" + ID;
		return i + readWrite.Input();
	}

	public static void check() {
		String delim = "\n";
		Boolean checker = false;
		String[] token = text.split(delim);
		for (int i = 0; i < token.length; i++) {
			String delim2 = ",";
			String[] token2 = token[i].split(delim2);
			for (int j = 1; j < token2.length - 3; j++) {
				if (searching.equals(token2[j])) {
					System.out.print(token[i]);
					checker = true;
				}
			}
		}
		if (!checker) {
			System.out.print("Sorry !!! there is no data");
		}

	}

	public static String search() {
		String searching;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter what you want to look for: ");
		searching = input.nextLine();
		return searching;
	}

}
