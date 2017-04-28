package Week4_Tu_7;

public class Dice {
	public static int up = 1;
	public static int front = 3;
	public static int right = 2;
	public static int left = 5;
	public static int back = 4;
	public static int bottom = 6;
	public static int temp = 0;
	public static int temp2 = 0;

	public Dice(int a, int b) {// a is up & b is front
		if (a + b != 7 && a < 7 && b < 7 && a != b) {
		} else {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		while (up != a || front != b) {
			randomDice();
		}

	}

	public void randomDice() {
		int random = 1 + (int) (Math.random() * 6);
		if (random == 1) {
			Dice.rollDown();
		} else if (random == 2) {
			Dice.rollUp();
		} else if (random == 3) {
			Dice.rollLeft();
		} else if (random == 4) {
			Dice.rollRight();
		} else if (random == 5) {
			Dice.hori();
		} else {
			Dice.vert();
		}

	}

	public static void rollLeft() {
		temp = front;
		front = right;
		right = back;
		back = left;
		left = temp;

	}

	public static void rollRight() {
		temp = front;
		front = left;
		left = back;
		back = right;
		right = temp;
	}

	public static void rollUp() {
		temp = front;
		front = bottom;
		bottom = back;
		back = up;
		up = temp;
	}

	public static void rollDown() {
		temp = front;
		front = up;
		up = back;
		back = bottom;
		bottom = temp;
	}

	public static void vert() {
		Dice.rollUp();
		Dice.rollUp();
	}

	public static void hori() {
		Dice.rollDown();
		Dice.rollDown();
	}

	public void printAll() {
		System.out.println("top is " + this.up + "\nfront is " + this.front + "\nleft is " + this.left + "\nright is "
				+ this.right + "\nback is " + this.back + "\nbottom is " + this.bottom);
	}
}