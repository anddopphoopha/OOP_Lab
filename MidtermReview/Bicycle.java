package MidtermReview;

public class Bicycle {
	// manufacturer of the bicycle, the current gear, and the current speed
	private String manufacturer;
	private int gear;
	private double speed;

	public Bicycle(String manufacturer) {
		this(manufacturer, 0, 0);
	}

	public Bicycle(int gear) {
		this("", 0, gear);
	}

	public Bicycle(double speed) {
		this("", speed, 0);
	}

	public Bicycle(String manufacturer, int gear) {
		this(manufacturer, 0, gear);
	}

	public Bicycle(String manufacturer, double speed) {
		this(manufacturer, speed, 0);
	}

	public Bicycle(double speed, int gear) {
		this("", speed, gear);
	}

	public Bicycle(String manufacturer, double speed, int gear) {
		this.manufacturer = manufacturer;
		this.gear = gear;
		this.speed = speed;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public double getSpeed() {
		return this.speed;
	}

	public int getGear() {
		return this.gear;
	}

}
