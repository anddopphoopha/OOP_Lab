package Week4_Fri_4;

public class Check {
	public static Boolean check(String a, String b, String c) {
		String delim = "\n";
		Boolean checker = false;
		String name = "";
		String[] token = a.split(delim);
		for (int i = 0; i < token.length; i++) {
			String delim2 = " ";
			String[] token2 = token[i].split(delim2);
			if (b.equals(token2[0]) && c.equals(token2[1])) {
				name = token2[2];
				checker = true;
			}
		}
		if (!checker) {
			System.out.println("Sorry !!! you're not in the system");
		} else {
			System.out.println("Welcome to the system\n" + name);
		}
		return checker;
	}
}
