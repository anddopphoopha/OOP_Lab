package Week9_Fri_1_1;

public class Student extends Person {
	public int ID = 9999;

	public static void main(String[] args) {
		Student myStudent = new Student();
		System.out.println(myStudent.ID);
		System.out.println(myStudent.name);
		System.out.println(myStudent.age);
		System.out.println(myStudent.weight);
		System.out.println(myStudent.height);
	}
}
