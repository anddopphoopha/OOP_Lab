package MidtermReview;

public class Circle {
	private double radius;
	private double area;

	public void setRadius(double radius) {
		if (radius < 0){
			radius = 0;
		System.out.println("Error ! the input is incorrect");}
		this.radius = radius;
		this.area = calculateArea();
	}

	public double getRadius() {
		return this.radius;
	}

	public double calculateArea() {
		return Math.pow(this.radius, 2.0) * Math.PI;
	}

}
