package Week3_Tu_1;

import java.util.*;

public class AccountBalance {
	Scanner input = new Scanner(System.in);
	private double AmountOfMoney = 30000;
	private double withdraw;
	private double deposit;
	private int year;
	private double intRate;

	public void inputMon() {
		System.out.print("What is your balance: ");
		this.AmountOfMoney = input.nextDouble();
	}

	public void with() {
		System.out.print("How much do you want to withdraw: ");
		this.withdraw = input.nextDouble();
	}

	public void checkW() {
		if (withdraw > AmountOfMoney || withdraw < 0) {
			System.out.println("You have withdrawn a invalid number");
		} else {
			AmountOfMoney = AmountOfMoney - withdraw;
		}
	}

	public void dep() {
		System.out.println("How much do you want to deposit: ");
		this.deposit = input.nextDouble();
	}

	public void checkD() {
		if (deposit <= 0) {
			System.out.println("You have deposited an invalid number");
		} else {
			AmountOfMoney = AmountOfMoney + deposit;
		}
	}

	public double view() {
		return AmountOfMoney;
	}
	
	public int Hyear(){
		System.out.print("Please input year: ");
		this.year = input.nextInt();
		return year;
	}
	public double calculateInterest(){
		System.out.print("Please input interest rate: ");
		this.intRate = input.nextDouble();
		double temp = AmountOfMoney;
		for (int i = year; i != 0; i--){
			temp = temp + intRate*temp;
		}
		return temp;
	}
	
}
