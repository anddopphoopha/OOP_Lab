package Week4_Fri_4;

import java.io.FileOutputStream;
import java.io.IOException;

public class write {
	public static void Write(String a, String b) {
		try {
			String bytes = a;
			byte[] buffer = bytes.getBytes();
			FileOutputStream outputStream = new FileOutputStream(b, true);
			outputStream.write(13);
			outputStream.write(10);
			outputStream.write(buffer);
			outputStream.close();
		} catch (IOException ex) {
			System.out.println("Error writing file '" + b + "'");
		}
	}
}
