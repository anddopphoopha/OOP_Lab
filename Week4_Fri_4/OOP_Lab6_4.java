package Week4_Fri_4;

import java.util.Scanner;

public class OOP_Lab6_4 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String filename = "C:\\test\\username.txt";
		int i = 0;
		String text = read.Read(filename);
		for (i = 2; i >= 0; i--) {
			String username = Search.searchU();
			String password = Search.searchP();
			Boolean check = Check.check(text, username, password);
			if (check) {
				i = -1;
			}
			if (i == 0) {
				System.out.println("You have no more chance left.");
			}
		}
	}
}
