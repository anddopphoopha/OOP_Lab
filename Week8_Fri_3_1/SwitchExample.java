package Week8_Fri_3_1;
import java.util.*;
public class SwitchExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Hello 1");
			break;
		case 2:
			System.out.println("Hello 2");
		case 3:
			System.out.println("Hello 3");
			break;
		case 4:
			System.out.println("Hello 4");
		default:
			System.out.println("Hello Default");
		}
	}
}
