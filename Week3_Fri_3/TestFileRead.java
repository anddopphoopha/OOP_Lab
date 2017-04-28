package Week3_Fri_3;

import java.io.*;

public class TestFileRead {
	public static void main(String[] args) {
		// The path of the file to open. Dont forget the path.
		String fileName = "C:\\test\\test.txt";
		try {
			// the buffer is used to get the data.
			byte[] buffer = new byte[1000];
			FileInputStream inputStream = new FileInputStream(fileName);
			// The read method fills buffer with data.
			// the read method return -1 when it reaches the end of the data
			// stream
			while (inputStream.read(buffer) != -1) {
				// Convert the value in buffer to String and display it.
				System.out.println(new String(buffer));
			}
			// close the input stream.
			inputStream.close();
		}
		// the anticipated errors
		catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
	}

}
