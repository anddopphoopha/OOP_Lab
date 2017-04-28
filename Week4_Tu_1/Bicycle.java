package Week4_Tu_1;

public class Bicycle {
	String manu = "";
	int curGr = 0;
	double curSpd = 0;

	public Bicycle(String a) {
		this.manu = a;
	}

	public Bicycle(int a) {
		this.curGr = 0;
	}

	public Bicycle(double a) {
		this.curSpd = a;
	}

	public Bicycle(String a, int b) {
		this.manu = a;
		this.curGr = b;
	}

	public Bicycle(String a, double b) {
		this.manu = a;
		this.curSpd = b;
	}

	public Bicycle(double a, int b) {
		this.curSpd = a;
		this.curGr = b;
	}

	public Bicycle(String a, int b, double c) {
		this.manu = a;
		this.curGr = b;
		this.curSpd = c;
	}

	public String getManu() {
		return this.manu;
	}

	public int getcurGr() {
		return this.curGr;
	}

	public double getcurSpd() {
		return this.curSpd;
	}
}
