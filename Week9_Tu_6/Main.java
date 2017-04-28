package Week9_Tu_6;

public class Main {
	public static void main(String args[]) {
		Bicycle one = new Bicycle(90);
		one.displayCurrentSpeed();
		one.brake();
		one.displayCurrentSpeed();
		one.speedUp();
		one.displayCurrentSpeed();
	}
}
