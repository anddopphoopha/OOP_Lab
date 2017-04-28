package MidtermReview;

public class VideoMain {
	public static void main(String[] args) { // Test a Video.
		Video vid1 = new Video();
		vid1.setTitle("The Godfather");
		//vid1.addRating(5);
		//vid1.addRating(4);
		vid1.addRating(1);
		vid1.addRating(4);
		//vid1.addRating(5);
		//vid1.addRating(5);
		//vid1.addRating(3);
		vid1.addRating(2);
		vid1.getRating();
		System.out.println(Video.Max);
		System.out.println(Video.Min);
		String s1 = String.format("%s: %s", vid1.getTitle(), vid1.getRating());
		System.out.println(s1);
		vid1.checkOut();
		getStatus(vid1);
		vid1.returnToStore();
		getStatus(vid1);
		
	}

	public static void getStatus(Video v) {
		String title = v.getTitle();
		if (v.isCheckedOut()) {
			String s = String.format("'%s' is checked out.", title);
			System.out.println(s);
		} else {
			String s = String.format("'%s' is on the shelves.", title);
			System.out.println(s);
		}
	}
}
