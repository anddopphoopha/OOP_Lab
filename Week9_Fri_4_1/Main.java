package Week9_Fri_4_1;

public class Main {
	public static void main(String args[]) {
		SUV one = new SUV();
		Truck two = new Truck();
		Sport three = new Sport();
		System.out.println(one.getCurrentDistance(2));
		System.out.println(two.getCurrentDistance(2));
		System.out.println(three.getCurrentDistance(2));
	}
}
