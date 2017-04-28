package MidtermReview;

import java.util.*;

public class Video {
	private String title;
	private Boolean checkedOut = false;
	private double averageRating;
	private double ratingSum = 0;
	private int ratingCount = 0;
	static double Max;
	static double Min;
	private Vector<Double> store = new Vector<Double>();
	private Iterator<Double> iter;

	public void setTitle(String iTitle) {
		title = iTitle;
	}

	public String getTitle() {
		return title;
	}

	public void addRating(int rate) {
		ratingSum = rate + ratingSum;
		ratingCount = ratingCount + 1;
		store.add((double) rate);
	}

	public double getRating() {
		if (ratingCount > 4) {
			Collections.sort(store);
			Min = store.elementAt(0);
			Max = store.lastElement();
			return (ratingSum - (Max + Min)) / (ratingCount - 2);
		}
		return ratingSum / ratingCount;
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
}
