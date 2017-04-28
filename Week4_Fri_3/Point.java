package Week4_Fri_3;

public class Point {
	public int x = 0;
	public int y = 0;
	public String temp = "";

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x) {
		this(x, x);
	}

	public Point() {
		this(0, 0);

	}

	public String print() {
		return this.temp;
	}

	public Boolean equal(Point a) {
		Boolean check = false;
		if (this.x == a.x && this.y == a.y) {
			check = true;
		}
		return check;
	}
}
