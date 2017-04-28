package Week10_Tu_2_5;

public class Shape implements Rectangle, Circle {
	public double height;
	public double width;
	public double radius;

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void calCircumference() {
		System.out.println(Math.PI * 2 * this.radius);
	}

	public void calAreaCircle() {
		System.out.println(Math.pow(radius, 2) * Math.PI);
	}

	public void calPerimeter() {
		System.out.println(2 * height + 2 * width);
	}

	public void calAreaRect() {
		System.out.println(height * width);
	}

	public static void main(String args[]) {
		Rectangle one = new Shape();
		one.setHeight(5);
		one.setWidth(5);
		one.calAreaRect();
		one.calPerimeter();
		Circle two = new Shape();
		two.setRadius(5);
		two.calAreaCircle();
		two.calCircumference();
	}
}
