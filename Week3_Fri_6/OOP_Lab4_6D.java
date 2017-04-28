package Week3_Fri_6;

import java.util.*;

public class OOP_Lab4_6D {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String filename = "C:\\test\\caseD.txt";
		String text = "";
		String search = "";
		boolean checker = true;
		boolean checker2 = true;
		int choice = 0;

		while (checker) {
			text = read.Read(filename);
			while (checker2) {
				System.out.print("[1] ADD\n[2] SEARCH\nPlease choose: ");
				choice = input.nextInt();
				if (choice == 1) {
					write.Write(getInfo.getID(text), filename);
					break;
				} else if (choice == 2) {
					search = Search.search();
					Check.check(text, search);
					break;
				} else {
					System.out.println("Incorrect Input");
				}
			} // checker2 loop closer
			while (checker2) {
				System.out.print("\n[1] YES\n[2] NO\nWould you like to continue: ");
				choice = input.nextInt();
				if (choice == 1) {
					break;
				} else if (choice == 2) {
					checker = false;
					break;
				} else {
					System.out.print("Incorrect Input");
				}
			}
		} // checker loop closer
	}
}
