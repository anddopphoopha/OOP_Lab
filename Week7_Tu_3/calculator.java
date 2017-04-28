package Week7_Tu_3;

public class calculator {
	private static double var;

	public void setVar(int var) {
		this.var = var;
	}

	public void mult(int a) {
		this.var *= a;
	}

	public void div(int a) {
		this.var /= a;
	}

	public void add(int a) {
		this.var += a;
	}

	public void sub(int a) {
		this.var -= a;
	}

	public void display() {
		System.out.println("The result is " + this.var);
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
