package Week8_Fri_2_1;

public class BreakExample {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			sum = sum + i;
			if (sum >= 55) {
				break;
			}
		}
		System.out.println("The sum is " + sum);
	}
}
