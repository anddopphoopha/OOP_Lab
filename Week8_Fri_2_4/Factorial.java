package Week8_Fri_2_4;

public class Factorial {
	private int number;
	private int factorial = 1;
	// can only contain 9 digits

	public Factorial(int number) {
		this.number = number;
	}

	public void calculateFactorial() {
		for (int i = 1; i <= this.number; i++) {
			factorial *= i;
		}
		if(factorial < 2147483647 || factorial >= 0){
			System.out.println("The result is too big for int");
		} else
		printFactorial();
	}

	private void printFactorial() {
		System.out.println(factorial);
	}
}
