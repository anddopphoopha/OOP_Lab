package Week2_Tu_1;

public class GradeCalculation {
	public static void main(String[] args){
		Student Andrew = new Student("Andrew", "592115035", 61);
		System.out.println("Your grade is " + calculateGrade(Andrew));
		
	}
	public static char calculateGrade(Student a){
		char grade;
		if (a.score > 80){
			grade = 'A';
		} else if (a.score > 70){
			grade = 'B';
		} else if (a.score > 60){
			grade = 'C';
		} else {grade = 'F';}
		
		return grade;
	}
}
