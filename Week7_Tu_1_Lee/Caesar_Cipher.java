package Week7_Tu_1_Lee;

public class Caesar_Cipher {
	private int shift;

	public Caesar_Cipher() {

	}

	public void setShift(int a) {
		this.shift = a;
	}

	public int getShift() {
		return this.shift;
	}

	public void encrypt(String a) {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				System.out.print(' ');
			} else if (Character.isLowerCase(a.charAt(i))) {
				if ((a.charAt(i) + this.shift) % 123 < 97) {
					System.out.print((char) ((a.charAt(i) + this.shift) % 123 + 97));
				}
				System.out.print((char) ((a.charAt(i) + this.shift) % 123));
			} else if (Character.isUpperCase(a.charAt(i)))
				if ((a.charAt(i) + this.shift) % 91 < 65) {
					System.out.print((char) ((a.charAt(i) + this.shift) % 91 + 65));
				} else {
					System.out.print((char) ((a.charAt(i) + this.shift) % 91));
				}
			else {
				System.out.println();
				System.out.println("Warning: text contains numbers or other symbols");
				break;
			}

		}
	}

	public void decrypt(String a) {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				System.out.print(' ');
			} else if (Character.isLowerCase(a.charAt(i)))
				if ((a.charAt(i) - this.shift) % 123 < 97) {
					System.out.print((char) ((a.charAt(i) - this.shift) % 123 + 26));
				} else {
					System.out.print((char) ((a.charAt(i) - this.shift) % 123));
				}
			else if (Character.isUpperCase(a.charAt(i)))
				if ((a.charAt(i) - this.shift) % 91 < 65) {
					System.out.print((char) ((a.charAt(i) - this.shift) % 91) + 26);
				} else {
					System.out.print((char) ((a.charAt(i) - this.shift) % 91));
				}
			else {
				System.out.println();
				System.out.println("Warning: text contains numbers or other symbols");
				break;
			}

		}
	}
}
