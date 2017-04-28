package Week11_Fri_8;

public class Employee extends Person {
	private String department;
	private int durationOfEmployment;

	public Employee(String firstname, String lastname, int age, String department, int durationOfEmployment) {
		super(firstname, lastname, age);
		this.department = department;
		this.durationOfEmployment = durationOfEmployment;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment(){
		return this.department;
	}

	public String toString() {
		return super.toString() + "\nI work at " + department + " for " + durationOfEmployment + " years.";
	}

}
