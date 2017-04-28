package Week11_Fri_7;

public class Main {
public static void main(String args[]){
	Person one = new Person("Andrew", "Dopphoopha", 16);
	Person two = new Employee("Andrew", "Dopphoopha", 16, "Walmart", 7);
	Person three = new Student("Andrew", "Dopphoopha", 16, "CAMT", 4.0);
	Person four = new Lecturer("Prompong", "Sugannisil", 16, "CAMT", "Computer Science");
	Person five = new Student("Benjamin", "Dopphoopha", 16, "CAMT", 4.0);
	Employee six = (Employee) two;
	one.displayAll();
	System.out.println();
	two.displayAll();
	System.out.println();
	three.displayAll();
	System.out.println();
	four.displayAll();
	System.out.println();
	six.displayAll();
	System.out.println();
	System.out.println(three.equals(five));
	
}
}
