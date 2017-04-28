package MidtermReview;

public class BankAccount {
	private double amountOfMoney;

	public double getAmountOfMoney() {
		return this.amountOfMoney;
	}
	
	public void setAmountOfMoney(double amount) {
		this.amountOfMoney = amount;
	}

	public void deposit(double deposit) {
		this.amountOfMoney += deposit;
	}

	public void withdraw(double withdraw) {
		this.amountOfMoney -= withdraw;
	}
}
