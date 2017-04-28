package Week8_Fri_3_4;

public class ATM {
	private double amountOfMoney = 300000;

	public void withdraw(double withdraw) {
		if(withdraw > this.amountOfMoney && withdraw >= 0)
			System.out.println("Invalid Input");
		else
			this.amountOfMoney -= withdraw;
		
	}

	public void deposit(double deposit) {
		if(deposit > 0)
		this.amountOfMoney += deposit;
		else
			System.out.println("Invalid Input");
	}
	
	public void printBalance(){
		System.out.println(this.amountOfMoney);
	}
}
