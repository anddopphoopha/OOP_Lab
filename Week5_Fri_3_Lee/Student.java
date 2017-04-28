package Week5_Fri_3_Lee;

public class Student {
	private String Name;
	private int ID;
	private int phone;
	public String list;
	public Student() {

	}

	public Student(int ID ,String Name, int phone) {
		this.list = "ID: "+ ID + " " + "Name: "+Name + " " + "Phone: "+ phone ;	
	}
}
