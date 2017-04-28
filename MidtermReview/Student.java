package MidtermReview;

public class Student {
	private int id;
	private String name;
	private int phoneNum;

	public Student(int id, String name, int phoneNum) {
		this.id = id;
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getPhone() {
		return this.phoneNum;
	}

}
