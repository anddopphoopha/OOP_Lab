package Week4_Tu_5;

public class Bicycle {
	String manu = "";
	int curGr = 0;
	double curSpd = 0;

	public Bicycle(){
		this("Trek", 5, 20);
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
