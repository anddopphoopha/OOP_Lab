package Week9_Tu_5;

public class Main {
	public static void main(String args[]) {
		Cylinder one = new Cylinder(new Point(0, 0), 3, 3);
		System.out.println(one.getSurfaceArea());
		System.out.println(one.getVolume());
	}
}
