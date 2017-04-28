package Week9_Fri_1_2;

import Week9_Fri_1_1.*;

public class Lecturer extends Person{
	private int ID = 9999;

	public static void main(String[] args) {
		Student myStudent = new Student();
		System.out.println(myStudent.ID);
		System.out.println(myStudent.getName());
		System.out.println(myStudent.getAge());
		System.out.println(myStudent.getWeight());
		System.out.println(myStudent.getHeight());
	}
}