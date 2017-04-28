package MidtermReview;

public class Line {
	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public Line(Point2 a, Point2 b) {
		x1 = a.getX();
		y1 = a.getY();
		x2 = b.getX();
		y2 = b.getY();
	}

	public Line(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX1() {
		return this.x1;
	}

	public int getY1() {
		return this.y1;
	}

	public int getX2() {
		return this.x2;
	}

	public int getY2() {
		return this.y2;
	}

	public String print() {
		return "The first point is " + x1 + " , " + y1 + " The second point is " + x2 + " , " + y2;
	}

	public double length() {
		return Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0));
	}

	public double getSlope() {
		double xd = this.x1 - this.x2;
		double yd = this.y1 - this.y2;
		double temp = yd / xd;
		if (temp == -0.0) {
			temp = 0.0;
		} else if (temp == Double.NEGATIVE_INFINITY) {
			temp = Double.POSITIVE_INFINITY;
		}
		return temp;
	}
}
