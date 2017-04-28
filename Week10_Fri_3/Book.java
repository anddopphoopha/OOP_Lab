package Week10_Fri_3;

public class Book extends Item implements Tax {
	private String author;
	private int pages;
	private double taxRate;

	public Book(String name, double price, double description, String author, int pages) {
		super(name, price, description);
		this.author = author;
		this.pages = pages;
	}

	public void totalTax() {
		System.out.println(getTaxRate() * this.price);
	};

	public void setTaxRate(int taxRate) {
		this.taxRate = taxRate;
	}

	public double getTaxRate() {
		return this.taxRate;
	}
}
