package Week9_Tu_5;

public class Cylinder extends Circle {
	private double height;

	public Cylinder(Point a, double radius, double height) {
		super(a, radius);
		this.height = height;
	}

	public double getSurfaceArea() {
		return (getCircumference() * this.height + (2* getArea()));
	}

	public double getVolume() {
		return (getArea() * this.height);
	}
}
