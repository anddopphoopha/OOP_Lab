package Week5_Fri_2;

public class Circle {
	private double radius;
	private double pt1;
	private double pt2;

	public Circle(Point a, double radius) {
		this.pt1 = a.x;
		this.pt2 = a.y;
		this.radius = radius;
		if (radius < 0) {
			this.radius = 0;
		}
	}

	public Circle(Point a) {
		this.radius = 1;
	}

	public double getArea() {
		return Math.PI * (Math.pow(this.radius, 2.0));
	}

	public double getCir() {
		return Math.PI * (2 * this.radius);
	}

	public double ptLength(Circle b) {
		double temp = Math.pow((this.pt1 - b.pt1), 2) + Math.pow((this.pt2 - b.pt2), 2);
		return Math.sqrt(temp);
	}
	
	public void setRadius(int radius){
		this.radius = radius;
		this.getArea();
		this.getCir();
	}
	
	public double getRadius(){
		return this.radius;
	}

	public Boolean check(Circle b) {
		if (this.radius + b.radius >= ptLength(b) && ptLength(b) >= Math.abs(this.radius - b.radius))
			return true;
		else
			return false;

	}

	public void intersect(Circle b) {
		if (check(b)) {
			System.out.println("It does intersect");
		} else {
			System.out.println("It does not intersect");
		}
	}

}
