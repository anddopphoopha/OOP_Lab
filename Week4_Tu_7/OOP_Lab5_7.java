package Week4_Tu_7;

import java.util.*;

public class OOP_Lab5_7 {
	public static void main(String args[]) {
		boolean checker = true;
		Scanner input = new Scanner(System.in);
		//int top = 0;
		//int front = 0;
		//while (checker) {
			//System.out.print("Please input the top of the dice: ");
				//top = input.nextInt();
				//System.out.print("Please input the front of the dice: ");
				//front = input.nextInt();
			//if (top + front != 7 && top < 7 && front < 7 && top != front) {
				//checker = false;
			//} else{System.out.println("Invalid Input");}
		//}
		Dice one = new Dice(7, 2);
		one.printAll();
		// one.randomDice();
		// one.printAll();

	}
}
