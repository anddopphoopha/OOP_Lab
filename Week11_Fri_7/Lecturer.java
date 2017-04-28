package Week11_Fri_7;

public class Lecturer extends Person {
	private String faculty;
	private String expertise;

	public Lecturer(String firstname, String lastname, int age, String faculty, String expertise) {
		super(firstname, lastname, age);
		this.faculty = faculty;
		this.expertise = expertise;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getFaculty() {
		return this.faculty;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String getExpertise() {
		return this.expertise;
	}

	public String toString() {
		return super.toString() + "\nI work at " + faculty + " and I have expertise in " + expertise;
	}

}
