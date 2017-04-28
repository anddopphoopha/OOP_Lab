package Week7_Tu_1;

public class shift {
	private int shift = 3;

	public int getShift() {
		return this.shift;
	}

	public void setShift(int a) {
		if (a <= 26 && a > 0)
			this.shift = a;
		else {
			System.out.println("Input out of Bounds\nThe shifting position has been set to 3");
		}
	}

}
