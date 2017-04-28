package Week10_Fri_4;

public class Sphere extends Shape implements Circular, ThreeDShape {
	private double radius;

	public double getVolume() {
		return 4 / 3 * Math.PI * Math.pow(radius, 3);
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
