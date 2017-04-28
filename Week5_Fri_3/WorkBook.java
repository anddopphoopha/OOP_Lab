package Week5_Fri_3;

public class WorkBook {
	private Student[] info = new Student[5];
	private int count = 0;

	public void add(Student a) {
		if (this.count == 5)
			System.out.println("The list is full");
		else if (check(a))
			info[this.count] = a;
		if (this.count != 5)
			this.count++;
	}

	public void displayAll() {
		for (int count = 0; count < this.count; count++) {
			System.out.println("ID: " + info[count].getID() + " name : " + info[count].getName() + " phone :"
					+ info[count].getPhnum());
		}
	}

	public void search(String a) {
		Boolean checker = true;
		for (int count = 0; count != info.length; count++) {
			if (a.equals(info[count].getID()) || a.equals(info[count].getName()) || a.equals(info[count].getPhnum())) {
				System.out.println("ID: " + info[count].getID() + " name : " + info[count].getName() + " phone :"
						+ info[count].getPhnum());
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
		int count;
		for (count = 0; count < info.length; count++) {
			if (info[count].getID().equals(temp)) {
				break;
			}
		}
		for (; count < info.length; count++) {
			if (count + 1 < 5)
				info[count] = info[count + 1];
		}
		this.count--;
	}

	public boolean check(Student a) {
		boolean check = true;
		if (this.count > 0) {
			for (int count = this.count - 1; count != 0; count--) {
				if (a.getID().equals(info[count].getID())) {
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
