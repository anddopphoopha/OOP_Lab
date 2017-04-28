package Week3_Fri_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OOP_Lab4_4_1 {
	public static void main(String[] args) {
		// The path of the file to open. Dont forget the path.
		String fileName = "D:\\OOP_Lab4_4_1\\Name&StudentID.txt";
		try {
			// Prepare a string to write
			String bytes = "Andrew Dopphoopha 592115035 " +"\n" + "Guoqing Li 592115502 " + "\n" + "James Taylor 592115506 ";
			// Encode the string to binary value
			byte[] buffer = bytes.getBytes();
			FileOutputStream outputStream =
			new FileOutputStream(fileName);
			// The write method is used to write bytes into a file.
			outputStream.write(buffer);
			// Always close files.
			outputStream.close();
			}
			catch(IOException ex) {
			System.out.println("Error writing file '"+ fileName + "'");
			}
	
			}
}
