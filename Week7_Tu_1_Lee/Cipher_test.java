package Week7_Tu_1_Lee;

import java.util.*;

public class Cipher_test {
	public static void main(String arg[]) {
		Caesar_Cipher obj = new Caesar_Cipher();
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Menu" + '\n' + "****************************************" + '\n' + "1 Set up the machine"
				+ '\n' + "0 Exit");
		int m = input.nextInt();
		if (m == 1) {
			System.out.println("Please enter the shifting position: ");
			int a = input.nextInt();
			obj.setShift(a);
			System.out.println("Done");
			boolean checker = true;
			while (checker) {
				System.out
						.println("Menu: " + '\n' + "****************************************" + '\n' + "1 Encrypt text"
								+ '\n' + "2 Decrypt text" + '\n' + "3 Change the shifting position" + '\n' + "0 exit");
				int b = input.nextInt();

				if (b == 1) {
					System.out.println("Please enter plain text: ");
					String c = input2.nextLine();
					obj.encrypt(c);
					System.out.println();
					System.out.println("done");
				} else if (b == 2) {
					System.out.println("Please enter the cipher text: ");
					String c = input2.nextLine();
					obj.decrypt(c);
					System.out.println();
					System.out.println("done");
				} else if (b == 3) {
					System.out.println("Please enter the new shifting position: ");
					int p = input.nextInt();
					obj.setShift(p);
				} else if (b == 0) {
					System.out.println("Exited the system succesfully");
					checker = false;
					System.exit(0);
				}
			}
		} else if (m == 0) {
			System.out.println("Exited the system succesfully");
			System.exit(0);
		} else {
			System.out.println("Invalid input");
		}
		input.close();
		input2.close();

	}

}
