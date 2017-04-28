package Week8_Fri_2_2;

public class BreakExample2 {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.println("The outter loop is " + i + " The inner loop is " + j + " and i*j = " + i * j);
				if (i * j >= 10) {
					System.out.println("Break is called");
					break;
					// line x
				}
			}
			System.out.println("The outer loop " + i + " ends.");
		}
	}
}
