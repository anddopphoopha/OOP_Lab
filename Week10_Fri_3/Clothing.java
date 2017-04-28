package Week10_Fri_3;

public class Clothing extends Item implements Tax{
	private int size;
	private double taxRate;

	public Clothing(String name, double price, double description, int size) {
		super(name, price, description);
		this.size = size;
	}

	public void totalTax() {
		System.out.println(getTaxRate()*this.price);
	}
;
	public void setTaxRate(int taxRate) {
		this.taxRate = taxRate;
	}
	
	public double getTaxRate() {
		return this.taxRate;
	}

}
