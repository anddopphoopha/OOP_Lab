package Week10_Fri_4;

public class Square extends Shape implements Polygon, TwoDShape {
	private double length;

	public double getArea() {
		return length * length;
	}

	@Override
	public void setLength(int length) {
		this.length = length;
	}

}
