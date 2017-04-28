package Week6_Fri_2;

import java.util.Iterator;
import java.util.Vector;

public class MainApplication {
	public static void main(String[] args) {
		// Create Iterator class whose supported type is String
		Iterator<String> days;
		// Create Vector class whose supported type is String
		Vector<String> dayNames = new Vector<String>();
		// Insert data into object of Vector class
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		dayNames.add("Sunday");
		// Assign the object of Iterator class to the Vector
		days = dayNames.iterator();
		// go to the next element
		while (days.hasNext()) {
			// get the data from Iterator class and display
			System.out.println(days.next());
		}
		System.out.println("***************************************");
		System.out.println("Add at a specific position");
		// add a new object to position 2
		dayNames.add(2, "5555");
		// You have to reset the iterator
		days = dayNames.iterator();
		while (days.hasNext()) {
			System.out.println(days.next());
		}
		System.out.println("***************************************");
		System.out.println("Remove a value");
		days = dayNames.iterator();
		System.out.println("The data before the removal");
		while (days.hasNext()) {
			System.out.println(days.next());
		}
		System.out.println("Removing process");
		
		dayNames.remove("5555");
		
		System.out.println("The data after the removal");
		days = dayNames.iterator();
		while (days.hasNext()) {
			System.out.println(days.next());
		}
		System.out.println("Remove a value");
	}
}
