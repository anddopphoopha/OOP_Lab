package Week4_Fri_1;

public class OOP_Lab6_1 {
	public static void main(String[] args) {
		Point point1 = new Point(1, 3);
		Point point2 = new Point(1);
		Point point3 = new Point();
		Point point4 = new Point(0);
		System.out.println("1st Point is at " + point1.print());
		System.out.println("2nd Point is at " + point2.print());
		System.out.println("3rd Point is at " + point3.print());
		if (point1.equal(point2)) {
			System.out.println("Point 1 and Point 2 are the same.");
		} else {
			System.out.println("Point 1 and Point 2 are the difference.");
		}
		if (point3.equal(point4)) {
			System.out.println("Point 3 and Point 4 are the same.");
		} else {
			System.out.println("Point 3 and Point 4 are the difference.");
		}
	}
}
