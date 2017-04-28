package Week12_Fri_4;

import java.util.Scanner;

public class Caesar extends EncryptionAlgorithm {
	private int shift = 3;
	private Scanner input = new Scanner(System.in);

	public Caesar(int shift) {
		setShift(shift);
	}

	public void setShift(int a) {
		if (a <= 26 && a > 0)
			this.shift = a;
		else {
			System.out.println("Input out of Bounds\nThe shifting position has been set to 3");
		}
	}

	public String encrypt(String text) {
		String temp = "";
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
				char c = (char) (text.charAt(i) + this.shift);
				if (c > 'Z') {
					temp += (char) (text.charAt(i) - (26 - this.shift));
				} else {
					temp += (char) (text.charAt(i) + this.shift);
				}
			}

			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				char c = (char) (text.charAt(i) + this.shift);
				if (c > 'z') {
					temp += (char) (text.charAt(i) - (26 - this.shift));
				} else {
					temp += (char) (text.charAt(i) + this.shift);
				}
			}
			if (text.charAt(i) == ' ')
				temp += (char) text.charAt(i);

		}
		return temp;

	}

	public String decrypt(String text) {
		String temp = "";
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
				char c = (char) (text.charAt(i) - this.shift);
				if (c < 'A') {
					temp += (char) (text.charAt(i) + (26 - this.shift));
				} else {
					temp += (char) (text.charAt(i) - this.shift);
				}
			}

			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				char c = (char) (text.charAt(i) - this.shift);
				if (c < 'a') {
					temp += (char) (text.charAt(i) + (26 - this.shift));
				} else {
					temp += (char) (text.charAt(i) - this.shift);
				}
			}
			if (text.charAt(i) == ' ')
				temp += (char) text.charAt(i);

		}
		return temp;

	}
}
