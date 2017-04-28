package Week12_Fri_4;

import java.util.*;

public class SecuritySystem {
	private EncryptionAlgorithm cipher;

	public SecuritySystem(EncryptionAlgorithm cipher) {
		this.cipher = cipher;
	}

	private String encryptedPassword;

	public String encryptUserInfo(String firstname, String lastname, String username, String password) {
		encryptedPassword = cipher.encrypt(password);
		return "Firstname: " + firstname + "\nLastname: " + lastname + "\nUsername: " + username + "\nPassword: "
				+ encryptedPassword;
	}

	public String decryptedUserInfo() {
		return cipher.decrypt(encryptedPassword);
	}
}
