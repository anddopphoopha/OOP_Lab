package Week6_Fri_2_2;

public class Product {
	private String name;
	private double price;

	public Product(String name, double price) {
			this.name = name;
			this.price = price;
	}

	public String getName() {
			return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	private boolean checkPrice(double price) {
		if (price > 0 && price != 0)
			return true;
		else
			return false;

	}

	private boolean checkName(String name) {
		if (name.equals(""))
			return false;
		else
			return true;
	}
}
