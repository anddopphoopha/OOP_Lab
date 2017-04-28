package Week6_Tu_1;

public class OOP_Lab9_1 {
	public static void main(String args[]) {
		sportMan me = new sportMan("Andrew", "Dopphoopha");
		me.setDay(13);
		me.setMonth(9);
		me.setYear(2000);
		me.setSal(0);
		System.out.println("My Birthday is " + me.getDay() + "/" + me.getMonth() + "/" + me.getYear()
				+ " and my salary is " + me.getSal());
	}
}
