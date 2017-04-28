package MidtermReview;

public class Information {
	private String manufacturer;
	private int id;
	private String model;
	private int price;
	private int inventory;
	private String filename;

	public Information(String filename) {
		this.filename = filename;
	}

	public String getFilename() {
		return this.filename;
	}

	public int getId(String text) {
		String delim = "\n";
		String[] token = text.split(delim);
		return token.length;
	}

	public void setManufactuer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public String getAll(String text) {
		return "" + this.getId(text) + "," + this.manufacturer + "," + this.model + "," + this.price + ","
				+ this.inventory;
	}
}
