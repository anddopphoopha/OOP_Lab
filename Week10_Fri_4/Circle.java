package Week10_Fri_4;

public class Circle extends Shape implements Circular,TwoDShape {
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2.0);
	}
	

}
