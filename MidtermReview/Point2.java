package MidtermReview;

public class Point2 {
	private int x;
	private int y;

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point2(int x) {
		this(x, x);
	}

	public Point2() {
		this(0, 0);
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public String print() {
		return this.x + " , " + this.y;
	}

	public boolean equal(Point2 a) {
		if (this.x == a.x && this.y == a.y) {
			return true;
		}
		return false;
	}
}
