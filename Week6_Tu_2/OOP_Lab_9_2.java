package Week6_Tu_2;

import camt.oop.lab4.bankcustomer.*;
import camt.oop.lab6.bankcustomer.*;
public class OOP_Lab_9_2 {
	public static void main(String arg[]) {
		BankCustomer me = new BankCustomer();
		me.addAccount(new BankAccount());
		me.addAccount(new BankAccount());
		me.addAccount(new BankAccount());
		me.addAccount(new BankAccount());
		System.out.println(me.getAccountAmount());
		me.getTotalMoney();
	}
}
