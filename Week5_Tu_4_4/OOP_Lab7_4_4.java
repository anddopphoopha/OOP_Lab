package Week5_Tu_4_4;

public class OOP_Lab7_4_4 {
	public static void main(String args[]){
	Student me = new Student("Andrew", "Dopphoopha", "male");
	System.out.println(me.getFullName());
	me.setBirth(2543);
	System.out.println(me.getBirth());
}
}
