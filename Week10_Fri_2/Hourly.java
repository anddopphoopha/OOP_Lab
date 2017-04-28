package Week10_Fri_2;

public class Hourly extends Employee {
	private int numberOfHrs;
	public Hourly(String name, int age, String numOfEmployment, int payment, int numberOfHrs) {
		super(name, age, numOfEmployment, payment);
		this.numberOfHrs = numberOfHrs;
	}

	public void paymentEachMonth() {
		int salary = 30 * getPayment() * numberOfHrs;
		System.out.println(salary);
	}

	public void paymentEachYear() {
		int salary = 30 * getPayment() * numberOfHrs * 356;
		System.out.println(salary);
	}

}
