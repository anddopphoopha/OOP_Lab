package Week8_Fri_4;

public class Factorial {
	private int factorial = 1;
	private int number;
	private String text;

	public Factorial(int number) {
		this.number = number;
	}

	public int[] calculateFactorial() {
		int[] factArray = new int[500];
		factArray[0] = 1;
		for (int i = 1; i <= number; ++i) {
			int carry = 0;
			System.out.println(carry);
			for (int j = 0; j < factArray.length; ++j) {
				int x = factArray[j] * i + carry;
				factArray[j] = x % 10;
				carry = x / 10;
				System.out.println("factArray: " + factArray[j] + "	i: " + i + "	carry: " + carry);
			}
		}
		return factArray;
	}

	public void printFact() {
		int[] result = calculateFactorial();
		int i = result.length - 1;
		System.out.println(result.length);
		while (i > 0 && result[i] == 0) {
			i--;
		}
		while (i >= 0) {
			System.out.print(result[i]);
			i--;
		}
		System.out.println();
	}
}
