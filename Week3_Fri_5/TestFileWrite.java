package Week3_Fri_5;

import java.io.*;
import java.util.*;
public class TestFileWrite {
	public static void main(String[] args) {
		// The name of the file to create.
		String fileName = "C:\\test\\test3.txt";
		for (int count = 0; count < 3; count++) {
			try {
				// Prepare a string to write
				String bytes = "953231 710";
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
}
