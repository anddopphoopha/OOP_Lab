package Week11_Fri_5;

public class ClassA {
	private int num2 = 100;

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void greet3() {
		System.out.println("GREET from A");
	}

	public ClassC toClassC(ClassA obj) {
		obj = new ClassC();
		return (ClassC) obj;
	}
}
