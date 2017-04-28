package Week3_Tu_1_4;

public class OOP_Lab3_1_4 {
	public static void main(String args[]) {
		Student student1 = new Student(); // method creation
		System.out.println(student1.getFirstName()); // line 01
		System.out.println(student1.getStudentID());
		Student leftstudent = new Student();// method creation
		leftstudent.setFirstName("Guoqing");
		leftstudent.setStudentID(592115502);
		System.out.println(leftstudent.getFirstName()); // line 01
		System.out.println(leftstudent.getStudentID());
		Student rightstudent = new Student(); // method creation
		rightstudent.setFirstName("James");
		rightstudent.setStudentID(592115506);
		System.out.println(rightstudent.getFirstName()); // line 01
		System.out.println(rightstudent.getStudentID());
	}
}
