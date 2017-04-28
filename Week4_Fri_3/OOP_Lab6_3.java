package Week4_Fri_3;

public class OOP_Lab6_3 {
	public static void main(String[] args) {

		Line line1 = new Line(new Point(0, 0), new Point(2, 0));

		Line line2 = new Line(new Point(2, 0), new Point(2, 2));

		Line line3 = new Line(new Point(2, 2), new Point(0, 2));

		Line line4 = new Line(new Point(0, 2), new Point(0, 0));

		Rectangle rect = new Rectangle(line1, line2, line3, line4);

		rect.print();

		System.out.println("The area is " + rect.calculateArea());

		System.out.println("The total length is " + rect.calculateTotallength());

		Line line5 = new Line(new Point(0, 2), new Point(0, 2));

		Rectangle rect2 = new Rectangle(line1, line2, line3, line5);

	}
}
