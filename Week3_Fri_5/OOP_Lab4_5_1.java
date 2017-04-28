package Week3_Fri_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OOP_Lab4_5_1 {
	public static void main(String[] args) {
		// The name of the file to create.
		String fileName = "D:\\OOP_Lab4_4_1\\Name&StudentID.txt";
			try {
				// Prepare a string to write
				String bytes = "APISADA MAHAWAN 592115033 "  + "\n" + " APISIT POOLPOKA 592115034";
				// Encode the string to binary value
				byte[] buffer = bytes.getBytes();
				FileOutputStream outputStream = new FileOutputStream(fileName, true);
				// The write method is used to write bytes into a file.
				outputStream.write(13);// Carriage Return
				outputStream.write(10);// Line Feed
				outputStream.write(buffer);
				// Always close files.
				outputStream.close();
			} catch (IOException ex) {
				System.out.println("Error writing file '" + fileName + "'");
			}
		}

	}

