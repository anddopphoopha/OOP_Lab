package Week10_Fri_2;

public abstract class Employee {
	private String name;
	private int age;
	private String numOfEmployment;
	private int payment;

	public Employee(String name, int age, String numOfEmployment, int payment) {
		this.name = name;
		this.age = age;
		this.numOfEmployment = numOfEmployment;
		this.payment = payment;
	}

	public abstract void paymentEachMonth();

	public abstract void paymentEachYear();
	
	public int getPayment(){
		return this.payment;
	}
}
