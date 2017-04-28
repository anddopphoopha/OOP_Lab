package Week1_Fri;

public class Div_9 {
	public static void main(String args[]) {
		System.out.println(recur(999999993));
	}

	public static long recur(long n) {/// use recursive method.
		long sum = 0;
		while (n > 0) {
			long digit = n - n / 10 * 10;
			sum = sum + digit;
			n = n / 10;
		}
		if (sum > 9) {
			return recur(sum);
		}
		return sum;

	}
}
