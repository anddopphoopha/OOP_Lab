package Week10_Fri_2;

public class Salaried extends Employee {
	public Salaried(String name, int age, String numOfEmployment, int payment) {
		super(name, age, numOfEmployment, payment);
	}

	public void paymentEachMonth() {
		System.out.println(getPayment());
	}

	public void paymentEachYear() {
		System.out.println(getPayment()*356);
	}

}
