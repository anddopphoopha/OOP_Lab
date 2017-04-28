package MidtermReview;

public class Compare {
	public void intersecting(Circle2 a, Circle2 b) {
		if (Math.sqrt(Math.pow(a.getX() - b.getX(), 2.0) + Math.pow(a.getY() - b.getY(), 2.0)) <= a.getRadius()
				+ b.getRadius() && a.getRadius() + b.getRadius() >= Math.abs(a.getRadius() - b.getRadius())) {
			System.out.println("It does intersect");
		} else
			System.out.println("It does not intersect");
	}
}
