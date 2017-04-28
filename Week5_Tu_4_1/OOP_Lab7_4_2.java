package Week5_Tu_4_1;

public class OOP_Lab7_4_2 {
	public static void main(String arg[]) {
		Student me = new Student("Andrew", "Dopphoopha");
		System.out.println(me.getFullName());
		me.setFirstName("Guoqing");
		me.setLastName("Li");
		System.out.print(me.getFullName());
		
	}
}
