package camt.oop.lab6.bankcustomer;
//Create class BankAccount. The BankAccount store the information of the amount of money in the account. The
//getter method for amount is required. The method for depositing and withdrawing money from the account is also
//required. Depositing receives the amount of money to be deposited and add it to the money in the account, whereas
//the withdrawing receives the amount of money to be deducted from the money in the account. The BankAccount
//must be placed in package camt.oop.lab6.bankcustomer.
public class BankAccount {
	private double amount;
	
	
	public void setAmount(double amount){
		this.amount = amount;
	}
	
	public double getAmount(){
		return this.amount;
	}
	
	public void withdraw(double withdraw){
		this.amount -= withdraw;
	}
	public void deposit(double deposit){
		this.amount += deposit;
	}
}
