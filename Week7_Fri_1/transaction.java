package Week7_Fri_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.*;

public class transaction {
	private static int count = 0;
	information a;
	public transaction(information a) {
		this.a = a;
	}

	public void searchDebit(int debit) {
		String split1 = "\n";
		String[] info = read().split(split1);
		for (int i = 0; i < info.length-1; i++) {
			String delim = "-";
			String[] token = info[i].split(delim);
			double temp = Double.parseDouble(token[2]);
			if (temp >= debit) {
				System.out.println(info[i]);
				count++;
			}
		}
		getNumTran();
	}

	public void searchCredit(int credit) {
		String split1 = "\n";
		String[] info = read().split(split1);
		for (int i = 0; i < info.length-1; i++) {
			String delim = "-";
			String[] token = info[i].split(delim);
			System.out.println(token.length);
			double temp = Double.parseDouble(token[3]);
			if (temp >= credit) {
				System.out.println(info[i]);
				count++;
			}
		}
		getNumTran();
	}

	public void getNumTran() {
		System.out.println("Number of transactions found is " + count);
	}

	public void write(String type, int debit, int credit) {
		try {
				String temp = "" + a.getId(read()) + "-" + type + "-" + debit + "-" + credit + "";
				String bytes = temp;
				byte[] buffer = bytes.getBytes();
				FileOutputStream outputStream = new FileOutputStream(a.getFilename(), true);
				outputStream.write(buffer);
				outputStream.write(13);
				outputStream.write(10);
				outputStream.close();
		} catch (IOException ex) {
			System.out.println("Error writing file '" + a.getFilename() + "'");
		}

	}

	public void summarize() {
		double credit = 0;
		double debit = 0;
		String split1 = "\n";
		String[] info = read().split(split1);
		for (int i = 0; i < info.length-1; i++) {
			String delim = "-";
			String[] token = info[i].split(delim);
			credit += Double.parseDouble(token[3]);
			debit += Double.parseDouble(token[2]);
		}
		System.out.println("The credit is " + credit + "\nThe debit is " + debit);
		if (credit < debit) {
			System.out.println("Credit and debit are in loss state");
		} else if (credit > debit) {
			System.out.println("Credit and debit are in gain state");
		} else if (credit == debit) {
			System.out.println("Account is balanced");
		}

	}

	public String read() {
		String text = "";
		try {
			byte[] buffer = new byte[1000];
			FileInputStream inputStream = new FileInputStream(a.getFilename());
			while (inputStream.read(buffer) != -1) {
				text = text + new String(buffer);
			}
			inputStream.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + a.getFilename() + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + a.getFilename() + "'");
		}
		return text;
	}

}
