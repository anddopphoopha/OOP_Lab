package Week5_Tu_5;

public class Circle1 {
	public static void main(String args[]) {
		double radius1 = 2.0;// this is a radius for the circle 1.
		double radius2 = 2.0;// this is a radius for the circle 2.
		double area1;// this is an area for the circle 1.
		double area2;// this is an area for the circle 2.
		area1 = Math.pow(radius1, 2.0) * Math.PI;
		area2 = Math.pow(radius2, 2.0) * Math.PI;
		System.out.println("The area of a circle with radius " + radius1 + " is " + area1 + ".");
		radius2 = 10;// line x
		System.out.println("The area of a circle with radius " + radius2 + " is " + area2 + ".");
	}
}
