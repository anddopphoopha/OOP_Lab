package Week4_Fri_2;

public class Line {
	public static int x1 = 0;
	public static int y1 = 0;
	public static int x2 = 0;
	public static int y2 = 0;
	public double length = 0;

	public Line(Point a, Point b) {
		length = Math.sqrt(((a.x - b.x) * (a.x - b.x)) + ((a.y - b.y) * (a.y - b.y)));
		x1 = a.x;
		y1 = a.y;
		x2 = b.x;
		y2 = b.y;
	}

	public Line(int a, int b, int c, int d) {
		length = Math.sqrt(((a - c) * (a - c)) + ((b - d) * (b - d)));
		x1 = a;
		y1 = b;
		x2 = c;
		y2 = d;
		
	}

	public String print() {
		return "The first point is (" + x1 + "," + y1 + ") The second point is (" + x2 + "," + y2 + ")";
	}

	public double length() {
		return length;
	}

}
