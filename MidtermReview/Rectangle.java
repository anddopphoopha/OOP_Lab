package MidtermReview;

public class Rectangle {
	private double width;
	private double height;
	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Rectangle(Point point) {
		this(point, 1, 1);
	}

	public Rectangle(Point point, double width, double height) {
		this.width = width;
		this.height = height;
		this.a = point;
		this.b = new Point(a.getX(), a.getY() + height);
		this.c = new Point(a.getX() + width, a.getY() + height);
		this.d = new Point(a.getX() + width, a.getY());
	}

	public double calculateArea() {
		return this.width * this.height;
	}

	public void printCorners() {
		System.out.println(a.getPoint() + "\n" + b.getPoint() + "\n" + this.c.getPoint() + "\n" + this.d.getPoint());

	}
}
