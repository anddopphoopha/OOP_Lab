package Week3_Fri_4;
import java.io.*;
public class TestFileWrite {
	public static void main(String [] args) {
		// The name of the file to create.
		String fileName = "C:\\test\\test2.txt";
		try {
		// Prepare a string to write
		String bytes = "953231 707";
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
