package Week12_Fri_4;

public class Substitution extends EncryptionAlgorithm {
	private char[] plainText = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
			'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'X' };
	private char[] cipherText = { 'Z', 'E', 'B', 'R', 'A', 'S', 'C', 'D', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
			'O', 'P', 'Q', 'T', 'U', 'V', 'W', 'X', 'Y' };

	public String encrypt(String text) {
		text = text.toUpperCase();
		String encryptedText = "";
		char[] charArray = text.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < plainText.length; j++) {
				if (plainText[j] == charArray[i]) {
					encryptedText += cipherText[j];
					break;
				} else if (charArray[i] == ' ') {
					encryptedText += ' ';
					break;
				}
			}
		}
		return encryptedText;

	}

	public String decrypt(String text) {
		text = text.toUpperCase();
		String decryptedText = "";
		char[] charArray = text.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < cipherText.length; j++) {
				if (cipherText[j] == charArray[i]) {
					decryptedText += plainText[j];
					break;
				} else if (charArray[i] == ' ') {
					decryptedText += ' ';
					break;
				}
			}
		}
		return decryptedText;

	}
}
