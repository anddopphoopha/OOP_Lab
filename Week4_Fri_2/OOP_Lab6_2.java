package Week4_Fri_2;

public class OOP_Lab6_2 {
	public static void main(String[] args) {

		Line line1 = new Line(new Point(0, 0), new Point(3, 3));

		System.out.println(line1.print());

		System.out.println("The length is " + line1.length());

		Line line2 = new Line(0, 2, 2, 0);

		System.out.println(line2.print());

		System.out.println("The length is " + line2.length());

	}
}
