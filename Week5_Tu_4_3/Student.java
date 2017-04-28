package Week5_Tu_4_3;

public class Student {
	private String firstName;
	private String lastName;
	private String gender;

	public Student(String firstName, String lastName, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return getGender() + " " + this.firstName + " " + this.lastName;
	}
	public String getGender(){
		if(gender.equals("male"))
			return "Mr";
		else if(gender.equals("female"))
			return "Miss";
		else
			return "Wrong Input";
	}
}
