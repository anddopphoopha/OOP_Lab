package Week9_Tu_5;

public class Circle {
	private double radius;
	private double pt1;
	private double pt2;

	public Circle(Point a, double radius) {
		this.pt1 = a.x;
		this.pt2 = a.y;
		this.radius = radius;
		if (radius < 0) {
			this.radius = 0;
		}
	}

	public double getArea() {
		return Math.PI * (Math.pow(this.radius, 2.0));
	}

	public double getCircumference() {
		return Math.PI * 2 * this.radius;
	}

	public double getRadius() {
		return this.radius;
	}

}
