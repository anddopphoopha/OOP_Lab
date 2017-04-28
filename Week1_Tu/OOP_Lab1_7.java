package Week1_Tu;

import java.util.Scanner;

public class OOP_Lab1_7 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int a = 5;
		int b = 9;
		int temp; //uninitialized
		temp = a;
		a = b;
		b = temp;
		System.out.println(a+ "\n" + b + "\n" + temp);
		
	}

}
