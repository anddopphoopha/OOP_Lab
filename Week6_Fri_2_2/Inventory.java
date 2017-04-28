package Week6_Fri_2_2;

import java.util.Vector;
import java.util.Iterator;

public class Inventory {
	private Iterator<Product> iter;
	private Vector<Product> inventory = new Vector<Product>();

	public void addProduct(Product a) {
		if(!a.getName().equals("") && a.getPrice() != 0)
		inventory.add(a);
	}

	public void displayProduct() {
		iter = inventory.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().getName());
		}
	}

	public Product searchProduct(String a) {
		int count = 0;
		for (count = 0; count < inventory.size(); count++) {
			if (inventory.elementAt(count).getName().equals(a)) {
				return inventory.elementAt(count);
			}
		}
		return new Product("(DID NOT FIND ANYTHING)", Double.NaN);
	}

	public void deleteProduct(String a) {
		int count = 0;
		for (count = 0; count < inventory.size(); count++) {
			if (inventory.elementAt(count).getName().equals(a)) {
				inventory.remove(count);
				break;
			}
		}
	}

	public void updateProduct(Product a) {
		int count = 0;
		for (count = 0; count < inventory.size(); count++) {
			if (inventory.elementAt(count).getName().equals(a)) {
				inventory.remove(count);
				inventory.add(count, a);
				break;
			}
		}
	}

}
