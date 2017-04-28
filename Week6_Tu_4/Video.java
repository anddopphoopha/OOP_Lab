package Week6_Tu_4;

import java.util.*;

public class Video {
	private String title;
	private Boolean checkedOut = false;
	private double averageRating;
	private double ratingSum = 0;
	private int ratingCount = 0;
	private ArrayList<Integer> info = new ArrayList<Integer>();
	private int min = 0;
	private int max = 0;

	public void setTitle(String iTitle) {
		title = iTitle;
	}

	public String getTitle() {
		return title;
	}

	public void addRating(int rate) {
		info.add(ratingCount, rate);
		ratingSum = rate + ratingSum;
		ratingCount = ratingCount + 1;
		averageRating = ratingSum / ratingCount;
	}

	public double getRating() {
		if (ratingCount > 4) {
			ratingCount -= 2;
			Collections.sort(info);
			this.max = info.get(info.size() - 1);
			this.min = info.get(0);
			ratingSum = ratingSum - this.max - this.min;
			averageRating = ratingSum / ratingCount;

		}
		return averageRating;
	}

	public void checkOut() {
		checkedOut = true;
	}

	public void returnToStore() {
		checkedOut = false;
	}

	public Boolean isCheckedOut() {
		return checkedOut;
	}

	public double getMax() {
		return this.max;
	}

	public double getMin() {
		return this.min;
	}

	public double getCount() {
		return this.ratingCount;
	}
}
