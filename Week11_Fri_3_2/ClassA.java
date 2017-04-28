package Week11_Fri_3_2;

public class ClassA {
	private int num2 = 100;

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public boolean checkIfSame() {
		if (new ClassA().getClass().getSimpleName().equals(this.getClass().getSimpleName())) {
			return true;
		}
		return false;
	}
}
