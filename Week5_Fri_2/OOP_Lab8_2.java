package Week5_Fri_2;

public class OOP_Lab8_2 {
	public static void main(String args[]) {
		Circle one = new Circle(new Point(0, 0), 2);
		System.out.println(one.getArea());
		System.out.println(one.getCir());
		Circle two = new Circle(new Point(1, 2), 3);
		System.out.println(two.getArea());
		System.out.println(two.getCir());
		Circle three = new Circle(new Point(3, 5), 1);
		System.out.println(three.getArea());
		System.out.println(three.getCir());
		Circle four = new Circle(new Point(-1, -10), -1);
		System.out.println(four.getArea());
		System.out.println(four.getCir());
		one.intersect(two);
		one.intersect(three);
	}
}
