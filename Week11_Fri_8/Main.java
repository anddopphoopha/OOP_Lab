package Week11_Fri_8;

public class Main {
public static void main(String args[]){
	Person one = new Person("Andrew", "Dopphoopha", 16);
	Employee two = new Employee("Andrew", "Dopphoopha", 16, "Walmart", 7);
	Student three = new Student("Andrew", "Dopphoopha", 16, "CAMT", 4.0);
	Lecturer four = new Lecturer("Prompong", "Sugannisil", 16, "CAMT", "Computer Science");
	one.displayAll();
	System.out.println();
	two.displayAll();
	System.out.println();
	three.displayAll();
	System.out.println();
	four.displayAll();
	
}
}
