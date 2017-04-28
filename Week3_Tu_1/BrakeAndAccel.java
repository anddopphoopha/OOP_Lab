package Week3_Tu_1;

public class BrakeAndAccel {
private double speed = 0;
	public void curSpeed(double a){
		speed = a;
	}


	public double brake(double a){
	speed = speed - a;
	return speed;
	}
	public double accel(double a){
	speed = speed + a;
	return speed;
	}
}
