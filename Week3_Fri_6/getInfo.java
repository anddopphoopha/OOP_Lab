package Week3_Fri_6;

public class getInfo {
	public static String getID(String a) {
		int ID;
		String delim = "\n";
		String[] token = a.split(delim);
		ID = token.length + 1;
		String i = "" + ID;
		return i + input.Input();
	}
}
