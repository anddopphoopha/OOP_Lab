package Week10_Fri_4;

public class Cube extends Shape implements ThreeDShape, Polygon {
	private double length;

	public void setLength(int length) {
		this.length = length;

	}

	public double getVolume() {
		return Math.pow(this.length, 3);
	}

}
