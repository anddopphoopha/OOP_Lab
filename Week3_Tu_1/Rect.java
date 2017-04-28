package Week3_Tu_1;

import java.util.*;

public class Rect {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input x: ");
		double x = input.nextDouble();
		System.out.print("Please input y: ");
		double y = input.nextDouble();
		System.out.print("[1] Input only origin\n[2] Input origin, width, and height\nPlease choose: ");
		int choice = input.nextInt();
		Rectangle rect1 = new Rectangle(x, y);
		if (choice == 1) {
		} else if (choice == 2) {
			System.out.print("Please input width : ");
			double width = input.nextDouble();
			System.out.print("Please input height: ");
			double height = input.nextDouble();
			rect1 = new Rectangle(x, y, width, height);
		}

		System.out.println("Origin point is " + rect1.bottomLeft() + "\nTop left is " + rect1.topLeft()
				+ "\nTop right is " + rect1.topRight() + "\nBottom right is " + rect1.bottomRight());
		System.out.println(rect1.calArea());
	}
}
