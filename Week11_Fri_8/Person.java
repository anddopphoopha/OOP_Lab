package Week11_Fri_8;

public class Person {
	private String firstname;
	private String lastname;
	private int age;

	public Person(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String toString() {
		return "I am " + firstname + " " + lastname + ". I am " + age + " years old.";
	}

	public void displayAll(){
		System.out.println(toString());
	}
}
