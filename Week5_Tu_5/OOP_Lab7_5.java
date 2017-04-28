package Week5_Tu_5;

public class OOP_Lab7_5 {
	public static void main(String args[]) {
		Circle one = new Circle();
		Circle two = new Circle();
		one.setRadius(2);
		two.setRadius(10);
		System.out.println("The area of a circle with radius " + one.getRadius() + " is " + one.getArea()+ ".");
		System.out.println("The area of a circle with radius " + two.getRadius() + " is " + two.getArea()+ ".");

	}
}
