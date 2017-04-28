package Week8_Fri_3_3;

import java.util.*;

public class Grade {
	private int countA = 0;
	private int countB = 0;
	private int countC = 0;
	private int countD = 0;
	private int countF = 0;
	Scanner input = new Scanner(System.in);

	public void countGrade() {
		boolean checker = true;
		while (checker) {
			System.out.println("Please input your grade: ");
			char grade = input.next().charAt(0);
			switch (grade) {
			case 'a':
				countA++;
				break;
			case 'b':
				countB++;
				break;
			case 'c':
				countC++;
				break;
			case 'd':
				countD++;
				break;
			case 'f':
				countF++;
				break;
			default:
				checker = false;
				break;
			}
		}
		System.out.println("a " + countA +"\n" + "b " + countB +"\n" + "c " + countC +"\n" + "d " + countD +"\n" + "f " +countF);
	}

}
