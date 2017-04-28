package MidtermReview;

public class Dice {
	private static int top = 1;
	private static int front = 3;
	private static int back = 4;
	private static int bottom = 6;
	private static int left = 5;
	private static int right = 2;

	public Dice(int top, int front) {
		Boolean checker = true;
		if (top + front == 7 || front > 7 || top > 7) {
			System.out.println("Invalid Input");
		} else {
			while (checker) {
				randomDice();
				if (this.top == top && this.front == front) {
					System.out.println(top + " " + bottom + "\n" + front + " " + back + "\n" + left + " " + right);
					break;
				}
			}
		}
	}

	public void randomDice() {
		int random = 1 + (int) (Math.random() * 6);
		if (random == 1) {
			rollLeft();
		} else if (random == 2) {
			rollRight();
		} else if (random == 3) {
			rollUp();
		} else if (random == 4) {
			rollDown();
		} else if (random == 5) {
			rollHorizontal();
		} else if (random == 6) {
			rollVertical();
		}

	}

	public void rollLeft() {
		int temp = front;
		front = right;
		right = back;
		back = left;
		left = temp;

	}

	public void rollRight() {
		int temp = right;
		right = front;
		front = left;
		left = back;
		back = temp;
	}

	public void rollUp() {
		int temp = top;
		top = front;
		front = bottom;
		bottom = back;
		back = top;
	}

	public void rollDown() {
		int temp = top;
		top = back;
		back = bottom;
		bottom = front;
		front = temp;
	}

	public void rollHorizontal() {
		rollUp();
		rollUp();
	}

	public void rollVertical() {
		rollDown();
		rollDown();
	}

}
