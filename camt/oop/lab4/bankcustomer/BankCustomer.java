package camt.oop.lab4.bankcustomer;

import camt.oop.lab6.bankcustomer.*;
import java.util.*;

//Create the BankCustomer. BankCustomer represents customers of bank. As one customer can hold multiple
//accounts in a time. Therefore, the accountList contains a list of accounts which the customer hold. The
//BankCustomer must contains the method getAccountAmount to return a number of account which customer
//has, the method addAccount which receives the BankAccount object to add to the accountList, and
//getTotalMoney to calculate the total amount of money which customer has in all account. The BankCustomer
//must be in the camt.oop.lab4.bankcustomer
public class BankCustomer {
	private int accountList = 0;
	private ArrayList<BankAccount> store = new ArrayList<BankAccount>();
	private Scanner input = new Scanner(System.in);

	public int getAccountAmount() {
		return this.accountList;
	}

	public void addAccount(BankAccount a) {
		store.add(this.accountList, a);
		System.out.print("Input amount of money in this account: ");
		store.get(this.accountList).setAmount(input.nextDouble());
		this.accountList += 1;
	}

	public void getTotalMoney() {
		double temp = 0;
		for (int count = 0; count < this.accountList; count++) {
			temp = store.get(count).getAmount() + temp;
		}
		System.out.println(temp);
	}
}
