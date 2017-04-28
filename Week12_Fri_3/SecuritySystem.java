package Week12_Fri_3;

import java.util.*;

public class SecuritySystem {
	private Caesar caesar = new Caesar();
	private Scanner input = new Scanner(System.in);
	private String encryptedPassword;

	public String encryptUserInfo(String firstname, String lastname, String username, String password) {
		System.out.print("Input shift amount: ");
		caesar.setShift(input.nextInt());
		encryptedPassword = caesar.encrypt(password);
		return "Firstname: " + firstname + "\nLastname: " + lastname + "\nUsername: " + username + "\nPassword: "
				+ encryptedPassword;
	}

	public String decryptUserInfo() {
		return "Decrypted password: " + caesar.decrypt(encryptedPassword);
	}
}
