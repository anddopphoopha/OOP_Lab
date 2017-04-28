package Week9_Fri_4_1;

public class Car {
	protected double speed = 0;
	public double getCurrentDistance(double duration) {
		return duration * this.speed;
	}
}
