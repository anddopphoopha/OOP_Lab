package Week5_Fri_3v2;

import java.util.ArrayList;

public class WorkBook {
	private ArrayList<Student> info = new ArrayList<Student>();
	private int count = 0;

	public void add(Student a) {
		if (this.count == 5)
			System.out.println("The list is full");
		else if (check(a))
			info.add(this.count, a);
		if (this.count != 5)
			this.count++;
	}

	public void displayAll() {
		for (int count = 0; count < info.size(); count++) {
			System.out.println("ID: " + info.get(count).getID() + " name : " + info.get(count).getName() + " phone :"
					+ info.get(count).getPhnum());
		}
	}

	public void search(String a) {
		Boolean checker = true;
		for (int count = 0; count != info.size(); count++) {
			if (a.equals(info.get(count).getID()) || a.equals(info.get(count).getName())
					|| a.equals(info.get(count).getPhnum())) {
				System.out.println("ID: " + info.get(count).getID() + " name : " + info.get(count).getName()
						+ " phone :" + info.get(count).getPhnum());
				checker = false;
				break;
			}

		}
		if (checker) {
			System.out.println("No data matched");
		}

	}

	public void del(int a) {
		String temp = "" + a;
		for (int count = 0; count < info.size(); count++) {
			if (info.get(count).getID().equals(temp)) {
				info.remove(count);
				this.count--;
				break;
			}
		}

	}

	public boolean check(Student a) {
		boolean check = true;
		if (this.count > 0) {
			for (int count = this.count - 1; count != 0; count--) {
				if (a.getID().equals(info.get(count).getID())) {
					System.out.println("This ID is already used");
					check = false;
					this.count--;
					break;
				}
			}
		}
		return check;
	}

}
