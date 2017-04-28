package Week5_Fri_3;

public class Student {
	private int id;
	private String name;
	private int phnum;
	private Boolean avail;

	public Student(int id, String name, int phnum) {
		this.id = id;
		this.name = name;
		this.phnum = phnum;
		this.avail = false;
	}

	public String getID() {
		return "" + this.id;
	}
	
	public Boolean getAvail() {
		return this.avail;
	}
	
	public void setAvail(Boolean a) {
		this.avail = a;
	}

	public String getName() {
		return this.name;
	}

	public String getPhnum() {
		return "" + this.phnum;
	}
	
	public void setID(int a) {
		this.id = a;
	}

	public void setName(String a) {
		this.name = a;
	}

	public void setPhnum(int a) {
		this.phnum = 0;
	}

}
