package Week9_Tu_7;

public class MountainBike extends Bicycle {
	private int gear = 1;

	public MountainBike(double currentSpeed) {
		super(currentSpeed);
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public void speedUp(double speed) {
		if (getCurrentSpeed() + (speed * this.gear) <= 99) {
			System.out.println(getCurrentSpeed() + (speed * this.gear));
		} else
			System.out.println("Invalid Input");

	}
}
