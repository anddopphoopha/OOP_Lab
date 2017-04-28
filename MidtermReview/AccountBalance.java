package MidtermReview;

public class AccountBalance {
	private double amountOfMoney = 0;

	public AccountBalance(int amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}

	public void withdraw(double withdraw) {
		if (withdraw <= this.amountOfMoney && withdraw >= 0) {
			this.amountOfMoney -= withdraw;
		} else
			System.out.println("The withdrawal amount is invalid");
	}

	public void deposit(double deposit) {
		if (deposit > 0) {
			this.amountOfMoney += deposit;
		} else
			System.out.println("The deposit amount is invalid");
	}

	public void viewBalance() {
		System.out.println("Your total balance is" + this.amountOfMoney);
	}

	public double calculateInterest(int year, double interestRate) {
		double temp = this.amountOfMoney;
		interestRate /= 100;
		for (int i = year; i != 0; i--) {
			temp = temp + (temp * interestRate);
		}
		return temp;
	}
}
