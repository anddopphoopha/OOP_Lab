package Week2_Tu_1;

public class MainStudent1 {
	public static void main(String[] args) {
		Student a = new Student("Somsri", "5212123", 23);
		System.out.println("name = " + a.name);
		System.out.println("student id = " + a.studentID);
		System.out.println("score = " + a.score);
		Student b = new Student("Suree", "52111222", 55);
		b.printScore();
		a = b;
		a.printScore();
	}

}
