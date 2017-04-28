package Week3_Fri_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class userPass {
	public static String text = "";
	public static String info = "";
	public static Boolean boo = false;
	public static String un = "";
	public static String fn = "";
	public static String ln = "";
	public static String ps = "";
	public static int counter = -1;

	public static String Input() {
		Scanner input = new Scanner(System.in);

		System.out.print("Please input your firstname: ");
		fn = input.nextLine();
		System.out.print("Please input your lastname: ");
		ln = input.nextLine();
		System.out.print("Please input your username: ");
		un = input.nextLine();
		System.out.print("Please input your password: ");
		ps = input.nextLine();
		info = fn + "," + ln + "," + un + "," + ps;
		return info;
	}

	public static String splitInput() {
		String delim = ",";
		String[] token2 = info.split(delim);
		return token2[2];

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

	public static void storeInfo(String b) {
		try {
			String bytes = info;
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

	public static Boolean checkUs() {
		String delim = "\n";
		Boolean checker = false;
		String[] token = text.split(delim);
		for (int i = 0; i < token.length; i++) {
			String delim2 = ",";
			String[] token2 = token[i].split(delim2);
			if (userPass.splitInput().equals(token2[2])) {
				checker = true;
				break;
			}
		}
		return checker;
	}

	public static String failus() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input your username: ");
		un = input.next();
		info = fn + "," + ln + "," + un + "," + ps;
		return info;
	}

	public static void compareUs() {
		Boolean checker = true;
		while (checker) {
			if (userPass.checkUs()) {
				System.out.println("This username is already used");
				userPass.failus();
			} else {
				checker = false;
			}
		}
	}

	public static void print() {
		System.out.println(counter);
		String delim = "\n";
		String[] token = text.split(delim);
		System.out.print(token[counter]);
		String delim2 = ",";
		String[] token2 = token[counter].split(delim2);
		System.out.print(token2[3]);
	}

	public static Boolean loginUS() {
		String inputUs = "";
		Scanner input = new Scanner(System.in);
		String delim = "\n";
		Boolean checker = false;
		Boolean checker2 = true;
		String[] token = text.split(delim);
		System.out.print("Please input username: ");
		inputUs = input.next();
		for (int i = 0; i < token.length; i++) {
			counter++;
			String delim2 = ",";
			String[] token2 = token[i].split(delim2);
			if (inputUs.equals(token2[2])) {
				checker = true;
				checker2 = false;
				boo = true;
				break;
			}
		}
		return checker;

	}

	public static Boolean loginPS() {
		String inputPs = "";
		Scanner input = new Scanner(System.in);
		String delim = "\n";
		Boolean checker = false;
		String[] token = text.split(delim);
		String delim2 = ",";
		String[] token2 = token[counter].split(delim2);
		for (int i = 0; i < 3; i++) {
			System.out.print("Please input password: ");
			inputPs = input.next();
			if (inputPs.equals(token2[3])) {
				checker = true;
				break;
			}
		}
		return checker;

	}

	public static void checkUsername() {
		if (userPass.loginUS()) {
		} else {
			System.out.println("Sorry!!!");
		}
	}

	public static void checkPassword() {
		if (boo) {
			if (userPass.loginPS()) {
				System.out.println("Welcome!!!!");
			} else {
				System.out.println("Sorry!!!");
			}
		}
	}

}
