package Week11_Fri_1_1;

public class MathComparisonTool {
	public static void main(String[] args) {
		MathComparisonTool ex = new MathComparisonTool();
		// line X
		System.out.println(ex.max(1, 10));
		System.out.println(ex.max(1.5, 10.5));
		System.out.println(ex.max("hello", "world01"));
		System.out.println(ex.max(100,100));
		// there is error because the parameter is for int not double
	}

	/*
	 * This method compare 2 integers and returns true if the first parameter is
	 * greater than the second parameter.Otherwise,it return false.
	 */

	/*public boolean max(int num1, int num2) {
		if (num1 > num2) {
			return true;
		}
		return false;
	}*/
	
	public String max(int num1, int num2) {
		if (num2 > num1)
			return "-1";
		else if (num2 == num1)
			return "0";
		else
			return "1";
	}

	public boolean max(double num1, double num2) {
		if (num1 > num2) {
			return true;
		}
		return false;
	}

	public boolean max(String string1, String string2) {
		if (string1.length() > string2.length()) {
			return true;
		}
		return false;
	}
}
