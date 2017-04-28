package Week9_Tu_6;

public class Bicycle {
	private double currentSpeed = 0;

	public Bicycle(double currentSpeed) {
		if (currentSpeed > 99) {
			currentSpeed = 99;
		}
		this.currentSpeed = currentSpeed;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public void displayCurrentSpeed() {
		System.out.println(getCurrentSpeed());
	}

	public void speedUp() {
		this.currentSpeed += 5;
	}

	public void brake() {
		if (currentSpeed > 0)
			this.currentSpeed -= 5;
	}
}
