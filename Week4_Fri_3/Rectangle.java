package Week4_Fri_3;

public class Rectangle {
	public static int co1 = 0;
	public static int co2 = 0;
	public static int co3 = 0;
	public static int co4 = 0;
	public static int co5 = 0;
	public static int co6 = 0;
	public static int co7 = 0;
	public static int co8 = 0;
	public static int co9 = 0;
	public static int co10 = 0;
	public static int co11 = 0;
	public static int co12 = 0;
	public static int co13 = 0;
	public static int co14 = 0;
	public static int co15 = 0;
	public static int co16 = 0;
	public double length2 = 0;
	public double length = 0;
	static Boolean checker = false;
	static Boolean checker2 = false;
	static Boolean checker3 = false;
	static Boolean checker4 = false;
	static Boolean checker5 = false;

	public Rectangle(Line a, Line b, Line c, Line d) {

		co1 = a.c1;
		co2 = a.c2;
		co3 = a.c3;
		co4 = a.c4;// line a

		co5 = b.c1;
		co6 = b.c2;
		co7 = b.c3;
		co8 = b.c4;// line b

		co9 = c.c1;
		co10 = c.c2;
		co11 = c.c3;
		co12 = c.c4;// line c

		co13 = d.c1;
		co14 = d.c2;
		co15 = d.c3;
		co16 = d.c4;// line d
		System.out.println(slope(a));
		System.out.println(slope(b));
		System.out.println(slope(c));
		System.out.println(slope(d));
		if (co3 == co5 && co4 == co6) {
			checker = true;
		} else
			checker = false;
		if (co7 == co9 && co8 == co10) {
			checker2 = true;
		} else
			checker2 = false;
		if (co11 == co13 && co12 == co14) {
			checker3 = true;
		} else
			checker3 = false;
		if (co15 == co1 && co16 == co2) {
			checker4 = true;
		} else
			checker4 = false;
		if (slope(a) == slope(c) && slope(b) == slope(d)) {
			checker5 = true;
		} else
			checker5 = false;
		if (!(checker && checker2 && checker3 && checker4 && checker5)) {
			System.out.println("The input is invalid. The rectangle cannot be created");
		}

	}

	public void print() {
		if ((checker && checker2 && checker3 && checker4 && checker5)) {
			System.out.println("The first point is (" + co1 + "," + co2 + ") The second point is (" + co5 + "," + co6
					+ ") The third point is (" + co9 + "," + co10 + ") The fourth point is (" + co13 + "," + co14
					+ ")");
		}
	}

	public double calculateTotallength() {
		return (distance1() * 2) + (2 * distance2());
	}

	public double calculateArea() {
		return (distance1() * distance2());
	}

	public double distance1() {
		return Math.sqrt(((co1 - co5) * (co1 - co5)) + ((co2 - co6) * (co2 - co6)));
	}

	public double distance2() {
		return Math.sqrt(((co3 - co7) * (co3 - co7)) + ((co4 - co8) * (co4 - co8)));
	}

	public double slope(Line a) {
		double xd = a.c1 - a.c3;
		double yd = a.c2 - a.c4;
		double temp = yd / xd;
		if (temp == -0.0) {
			temp = temp + -0;
		} else if (temp == Double.NEGATIVE_INFINITY) {
			temp = Double.POSITIVE_INFINITY;
		}
		return temp;
	}
}
