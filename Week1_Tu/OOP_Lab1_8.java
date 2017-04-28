package Week1_Tu;

import java.util.Scanner;

public class OOP_Lab1_8 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double Cel = input.nextDouble();
		System.out.println(convert(Cel));
		
	}
	
	public static double convert(double a){
		double b = (a*9/5) + 32;
		return b;
	}
}
