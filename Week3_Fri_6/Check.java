package Week3_Fri_6;

public class Check {
	public static void check(String a, String b) {
		String delim = "\n";
		Boolean checker = false;
		String[] token = a.split(delim);
		for (int i = 0; i < token.length; i++) {
			String delim2 = ",";
			String[] token2 = token[i].split(delim2);
			for (int j = 1; j < token2.length - 2; j++) {
				if (b.equals(token2[j])) {
					System.out.print(token[i]);
					checker = true;
				}
			}
		}
		if (!checker) {
			System.out.print("Sorry !!! z");
		}

	}
}
