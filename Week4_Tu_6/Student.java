package Week4_Tu_6;

public class Student {
	int stuID = 0;
	String fn = "";
	double gpa = 0;

	public Student() {
		this(592115035, "Andrew", 4.00);
	}

	public Student(int a, String b, double c) {
		this.stuID = a;
		this.fn = b;
		this.gpa = c;
	}

	public int getStu() {
		return this.stuID;
	}

	public String getFn() {
		return this.fn;
	}

	public double getGpa() {
		return this.gpa;
	}
}
