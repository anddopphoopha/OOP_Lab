package MidtermReview;

public class Circle2 {
	private int x;
	private int y;
	private double radius;

	public Circle2(Point2 a, double radius) {
		if (radius < 0) {
			radius = 0;
		}
		this.x = a.getX();
		this.y = a.getY();
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public double calculateArea() {
		return Math.pow(this.radius, 2.0) * Math.PI;
	}

	public double calculateCircumference() {
		return this.radius * 2.0 * Math.PI;
	}
}
