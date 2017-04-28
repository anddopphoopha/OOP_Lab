package Week4_Fri_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class read {
	public static String Read(String a) {
		String text = "";
		try {
			byte[] buffer = new byte[1000];
			FileInputStream inputStream = new FileInputStream(a);
			while (inputStream.read(buffer) != -1) {
				text = text + new String(buffer);
			}
			inputStream.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + a + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + a + "'");
		}
		return text;
	}

}
