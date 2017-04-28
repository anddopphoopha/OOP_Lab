package Week6_Fri_2_2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class MainApplication {
	public static void main(String[] args) {
		System.out.println("The probelm 2.2");
		Inventory myInventory = new Inventory();
		
		//Insert the data into the Inventory
		myInventory.addProduct(new Product("vegetable1",10.0));
		myInventory.addProduct(new Product("vegetable2",15.0));
		myInventory.addProduct(new Product("vegetable3",7.0));
		myInventory.addProduct(new Product("pork",100.0));
		myInventory.addProduct(new Product("beef",150.0));
		myInventory.addProduct(new Product("lamb",120.0));
		
		//Display the inventory
		myInventory.displayProduct();
		System.out.println("\n\nThe probelm 2.3");
		//Search the inventory for a certain product
		Product product = myInventory.searchProduct("por");
		System.out.println("The product is "+product.getName()+" with price of "+product.getPrice());
		System.out.println("\n\nThe probelm 2.4");
		//Delete a certain product
		System.out.println("Display the invenory before the removal");
		myInventory.displayProduct();
		myInventory.deleteProduct("pork");
		System.out.println("\nDisplay the invenory after the removal");
		myInventory.displayProduct();
		
		System.out.println("\n\nThe probelm 2.5");
		//Update a certain product
		//Take a close look at vegetable3 (the price)
		product = new Product("vegetable3",500.0);
		myInventory.updateProduct(product);
		myInventory.displayProduct();
		System.out.println("The product is "+product.getName()+" with price of "+product.getPrice());
	}
}
