package MidtermReview;

import java.io.*;
import java.util.*;

public class Management {
	private String filename;
	private Scanner input = new Scanner(System.in);
	private Scanner input2 = new Scanner(System.in);
	Information a;

	public Management(Information a) {
		filename = a.getFilename();
		this.a = a;
	}

	public void write() {
		a.setManufactuer(input2.nextLine());
		a.setModel(input2.nextLine());
		a.setPrice(input.nextInt());
		a.setInventory(input.nextInt());
		try {
			String bytes = a.getAll(read());
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

	public void search(String text) {
		Boolean checker = true;
		String delim = "\n";
		String[] token = read().split(delim);
		for (int i = 0; i < token.length - 1; i++) {
			String delim2 = ",";
			String[] token2 = token[i].split(delim2);
			if (token2[1].equals(text) || token2[2].equals(text)) {
				System.out.println(token[i]);
				checker = false;
			}
		}
		if (checker) {
			System.out.println("Sorry !!! there is no data");
		}
	}
}
