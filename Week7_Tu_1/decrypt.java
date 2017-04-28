package Week7_Tu_1;

public class decrypt {

	public String decrypting(String text, shift a) {
		String temp = "";
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
				char c = (char) (text.charAt(i) - a.getShift());
				if (c < 'A') {
					temp += (char) (text.charAt(i) + (26 - a.getShift()));
				} else {
					temp += (char) (text.charAt(i) - a.getShift());
				}
			}

			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				char c = (char) (text.charAt(i) - a.getShift());
				if (c < 'a') {
					temp += (char) (text.charAt(i) + (26 - a.getShift()));
				} else {
					temp += (char) (text.charAt(i) - a.getShift());
				}
			}
			if (text.charAt(i) == ' ')
				temp += (char) text.charAt(i);

		}
		return temp;

	}

}
