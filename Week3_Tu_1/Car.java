package Week3_Tu_1;

import java.util.*;

public class Car {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		BrakeAndAccel car1 = new BrakeAndAccel();
		System.out.print("Please input the current speed of the car: ");
		double speed = input.nextDouble();
		car1.curSpeed(speed);
		System.out.print("Do you want to accel or brake: \n[1] Accelerate\n[2] Brake");
		int choice = input.nextInt();
		if (choice == 1) {
			System.out.print("How many degrees of accel: ");
			double acel = input.nextDouble();
			System.out.print(car1.accel(acel) + "km/h");
		} else if (choice == 2) {
			System.out.print("How many degrees of brake: ");
			double brak = input.nextDouble();
			System.out.print(car1.brake(brak) + "km/h");
		}

	}
}
