package Week3_Tu_1;

public class Rectangle {
	private double oriX;
	private double oriY;
	private double w;
	private double h;

	public Rectangle(double a, double b, double c, double d) {
		oriX = a;
		oriY = b;
		w = c;
		h = d;
	}
	
	public Rectangle(double a, double b){
		oriX = a;
		oriY = b;
		w = 1;
		h = 1;
	}
	public String bottomLeft() {
		String coor1 = oriX + ", " + oriY;
		return coor1;
	}

	public String topLeft() {
		double temp = oriY + h;
		String coor2 = oriX + ", " + temp;
		return coor2;
	}

	public String topRight() {
		double temp1 = oriX + w;
		double temp2 = oriY + h;
		String coor3 = temp1 + ", " + temp2;
		return coor3;
	}

	public String bottomRight() {
		double temp = oriX + w;
		String coor4 = temp + ", " + oriY;
		return coor4;
	}
	
	public double calArea(){
		return h*w;
	}
}
