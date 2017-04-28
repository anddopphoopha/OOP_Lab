package MidtermReview;

import java.util.*;

import MidtermReview.BankAccount;

public class BankCustomer {
	private Scanner input = new Scanner(System.in);
	private Vector<BankAccount> accountList = new Vector<BankAccount>();
	private Iterator<BankAccount> iter;

	public void addAccount(BankAccount a) {
		accountList.add(a);
	}

	public int getAccountAmount() {
		return accountList.size();
	}

	public double getTotalMoney() {
		iter = accountList.iterator();
		double totalMoney = 0;
		while (iter.hasNext()) {
			totalMoney += iter.next().getAmountOfMoney();
		}
		return totalMoney;
	}
}
