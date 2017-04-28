package MidtermReview;

public class Rectangle2 {
	private Line a;
	private Line b;
	private Line c;
	private Line d;
	public static boolean checker = true;

	public Rectangle2(Line a, Line b, Line c, Line d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		if (!check()) {
			System.out.println("The input is invalid");
		}
	}

	public boolean check() {
		if ((a.getX2() == b.getX1() && a.getY2() == b.getY1()) && (b.getX2() == c.getX1() && b.getY2() == c.getY1())
				&& (c.getX2() == d.getX1() && c.getY2() == d.getY1())
				&& (d.getX2() == a.getX1() && d.getY2() == a.getY1())) {
			if (a.getSlope() == c.getSlope() && b.getSlope() == d.getSlope()) {
				return true;
			}

		}
		checker = false;
		return false;
	}

	public void print() {
		if (checker)
			System.out.println("The first point is " + a.getX1() + " , " + a.getY1() + " The second point is "
					+ b.getX1() + " , " + b.getY1() + " The third point is " + c.getX1() + " , " + c.getY1()
					+ " The fourth point is " + d.getX1() + " , " + d.getY1());
		else {
			System.out.println("Error in printing out");
		}
	}


	public double calculateArea() {
		return a.length() * b.length();
	}

	public double calculatePerimeter() {
		return a.length() * 2 + b.length() * 2;
	}
}
