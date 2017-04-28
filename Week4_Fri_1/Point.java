package Week4_Fri_1;

public class Point {
	public String temp = "";

	public Point(int x, int y) {
		this.temp = "(" + x + " , " + y + ")";
	}

	public Point(int x) {
		this(x , x);
	}

	public Point() {
		this(0, 0);

	}

	public String print() {
		return this.temp;
	}

	public Boolean equal(Point a) {
		Boolean check = false;
		if ((this.temp).equals(a.temp)) {
			check = true;
		}
		return check;
	}
}
