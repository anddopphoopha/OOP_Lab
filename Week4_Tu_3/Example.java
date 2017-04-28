package Week4_Tu_3;

public class Example {
	private String name;
	private int num;

	public Example() {
		this("OOP", 953231);
	}

	public Example(String name, int num) {
		this.name = name;
		this.num = num;
	} // Methods

	public String getName() {
		return this.name;
	}

	public int getNum() {
		return this.num;
	}
}
