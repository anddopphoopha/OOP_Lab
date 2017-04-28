package Week5_Tu_4_4;

public class Student {
	private String firstName;
	private String lastName;
	private String gender;
	private int birth;

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

	public void setBirth(int birth) {
		if (birth > 2100)
			this.birth = birth - 543;
		else
			this.birth = birth;
	}

	public int getBirth() {
		return birth;
	}

	public String getFullName() {
		return getGender() + " " + this.firstName + " " + this.lastName;
	}

	public String getGender() {
		if (gender.equals("male"))
			return "Mr";
		else if (gender.equals("female"))
			return "Miss";
		else
			return "Wrong Input";
	}
}
