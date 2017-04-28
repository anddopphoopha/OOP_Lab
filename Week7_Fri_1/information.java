package Week7_Fri_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class information {
	private String filename;

	public information(String filename) {
		this.filename = filename;
	}

	public String getFilename() {
		return this.filename;
	}
	
	public int getId(String text) {
		String split1 = "\n";
		String[] info = text.split(split1);
		return info.length;
	}

}
