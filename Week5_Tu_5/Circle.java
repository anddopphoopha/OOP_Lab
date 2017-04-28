package Week5_Tu_5;

public class Circle {
	private double radius;
	private double area;

	public Circle() {
		this.getArea();
	}

	public void setRadius(double radius) {
		if (radius < 0) {
			this.radius = 0;
			System.out.println("Error ! the input is incorrect");
		} else
			this.radius = radius;

		this.getArea();
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		this.area = (Math.pow(this.radius, 2.0)) * (22.0/7.0);
		return this.area;

	}

}
