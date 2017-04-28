package Week6_Tu_1;

public class sportMan {
	private String lastname;
	private String firstname;
	private int day;
	private int month;
	private int year;
	private double salary;

	public sportMan(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getDay() {
		return this.day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth() {
		return this.month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

	public void setSal(double salary) {
		this.salary = salary;
	}

	public double getSal() {
		return this.salary;
	}
}