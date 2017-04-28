package Week1_Tu;

import java.util.Scanner;

public class OOP_Lab1_9 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double Fahren = input.nextDouble();
		System.out.println(convert(Fahren));
		
	}
	
	public static double convert(double a){
		double b = (a - 32) * 5/9;
		return b;
	}
}
