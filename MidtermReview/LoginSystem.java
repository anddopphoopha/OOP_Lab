package MidtermReview;

import java.io.*;
import java.util.Scanner;

public class LoginSystem {
	private String filename;
	private Information2 a;
	private Scanner input = new Scanner(System.in);

	public LoginSystem(Information2 a) {
		this.filename = a.getFilename();
		this.a = a;
	}

	public void write() {
		a.setUsername(input.next());
		a.setPassword(input.next());
		a.setFirstname(input.next());
		try {
			String bytes = a.getUsername() + " " + a.getPassword() + " " + a.getFirstname();
			byte[] buffer = bytes.getBytes();
			FileOutputStream outputStream = new FileOutputStream(filename, true);
			outputStream.write(buffer);
			outputStream.write(13);// Carriage Return
			outputStream.write(10);// Line Feed
			outputStream.close();
		} catch (IOException ex) {
			System.out.println("Error writing file '" + filename + "'");
		}
	}

	public String read() {
		String text = "";
		try {
			byte[] buffer = new byte[1000];
			FileInputStream inputStream = new FileInputStream(filename);
			while (inputStream.read(buffer) != -1) {
				text += new String(buffer);
			}
			inputStream.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + filename + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + filename + "'");
		}
		return text;
	}

	public Boolean search(String username, String password) {
		Boolean checker = true;
		String delim = "\n";
		String[] token = read().split(delim);
		for (int i = 0; i < token.length - 1; i++) {
			String delim2 = " ";
			String[] token2 = token[i].split(delim2);
			if (token2[0].equals(username) && token2[1].equals(password)) {
				System.out.println("Welcome to the system!!! " + token2[2]);
				return true;
			}
		}
		return false;
	}

}
