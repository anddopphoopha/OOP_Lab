package Week5_Fri_3_Lee;

import java.util.ArrayList;

public class WorkBook {
	private int i = 0; // declare int i inside of add method won't work.
	private String[] myarray = new String[5];
	ArrayList<String> obj = new ArrayList<String>();

	public WorkBook() {

	}

	public void add(Student ob) {
		if (i >= 5) {
			System.out.println("The list is full");
		} else {
			myarray[i] = ob.list;
			i++;
		}
	}

	public void add2(Student ob) {
		if (i >= 5) {
			System.out.println("The list is full");
		} else {
			obj.add(i, ob.list);
			i++;
		}
	}

	public void displayAll() {
		for (int i = 0; i < 5; i++) {
			if (myarray[i] == null) {
             
			} else {
				System.out.println(myarray[i]);
			}
		}

	}

	public void search(String a) {
		if (a.equals("1") || a.equals("191") || a.equals("mr a")&&myarray[0]!=null) {
			System.out.println(myarray[0]);
		} else if (a.equals("2") || a.equals("1669") || a.equals("mr b")&&myarray[1]!=null) {
			System.out.println(myarray[1]);
		} else if (a.equals("3") || a.equals("1599") || a.equals("mr c")&&myarray[2]!=null) {
			System.out.println(myarray[2]);
		}

		else if (a.equals("4") || a.equals("1122") || a.equals("mr d")&&myarray[3]!=null) {
			System.out.println(myarray[3]);
		}

		else if (a.equals("5") || a.equals("1112") || a.equals("mr e")&&myarray[4]!=null) {
			System.out.println(myarray[4]);
		} else {
			System.out.println("no record found");
		}
	}

	public void del(int a) {
		if (a == 1) {
			myarray[0] = null;
		}
		if (a == 2) {
			myarray[1] = null;
		}
		if (a == 3) {
			myarray[2] = null;
		}
		if (a == 4) {
			myarray[3] = null;
		}
		if (a == 5) {
			myarray[4] = null;
		}
	}

}
