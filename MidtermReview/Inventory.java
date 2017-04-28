package MidtermReview;

import java.util.*;

public class Inventory {
	private Vector<Product> inventory = new Vector<Product>();
	private Iterator<Product> iter;

	public void addProduct(Product a) {
		if (a.getPrice() > 0 && !a.getName().equals(""))
			inventory.add(a);
	}

	public void displayProduct() {
		iter = inventory.iterator();
		while (iter.hasNext()) {
			Product temp = iter.next();
			System.out.println(temp.getName() + ", " + temp.getPrice());
		}
	}

	public Product searchProduct(String text) {
		iter = inventory.iterator();
		while (iter.hasNext()) {
			Product temp = iter.next();
			if (temp.getName().equals(text)) {
				return temp;
			}
		}
		return new Product("(Was not found)", 0.0);
	}

	public void deleteProduct(String text) {
		iter = inventory.iterator();
		while (iter.hasNext()) {
			if (iter.next().getName().equals(text)) {
				iter.remove();
			}
		}
	}

	public void updateProduct(Product a) {
		int count = 0;
		for (count = 0; count < inventory.size(); count++) {
			if (inventory.elementAt(count).getName().equals(a.getName())) {
				inventory.remove(count);
				inventory.add(count, a);
				break;
			}
		}

	}
}
