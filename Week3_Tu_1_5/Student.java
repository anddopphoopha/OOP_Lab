package Week3_Tu_1_5;

public class Student {
	// the attribute of the class
	private int studentID = 999;
	private String firstName = "Hello";

	// the method of the class
	public Student(int a){
		studentID = a;
	}
	public Student(String a){
		firstName = a;
	}
	public Student(int a, String b){
		studentID = a;
		firstName = b;
	}

}
