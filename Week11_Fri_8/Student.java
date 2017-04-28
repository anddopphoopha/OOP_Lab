package Week11_Fri_8;

public class Student extends Person {
	private String faculty;
	private double GPA;

	public Student(String firstname, String lastname, int age, String faculty, double GPA) {
		super(firstname, lastname, age);
		this.faculty = faculty;
		this.GPA = GPA;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getFaculty() {
		return this.faculty;
	}

	public String toString() {
		return super.toString() + "\nI study at " + faculty + " and I have GPA Of " + GPA;
	}

}
