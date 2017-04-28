package MidtermReview;

public class Calculator {
	private static double variable;

	public void setVariable(double variable) {
		this.variable = variable;
	}

	public void getVariable() {
		System.out.println("The result is " + this.variable);
	}

	public void divide(double divisor) {
		this.variable /= divisor;
	}

	public void multiply(double multiply) {
		this.variable *= multiply;
	}

	public void add(double add) {
		this.variable += add;
	}

	public void subtract(double sub) {
		this.variable -= sub;
	}
	

	public void print() {
		System.out.println(
				" Calculator\n****************************************\n1 Input number\n0 Exit\n****************************************\nMenu: ");
	}

	public void print2() {
		System.out.println(
				" Calculator\n****************************************\n2 Addition\n3 Mulitplication\n4 Division\n5 Subtraction\n6 Display result\n0 Exit\n****************************************\nMenu: ");
	}
}
