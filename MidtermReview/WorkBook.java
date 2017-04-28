package MidtermReview;

import java.util.*;
import java.lang.Integer;

public class WorkBook {
	private Vector<Student> info = new Vector<Student>();
	private Iterator<Student> iter;
	private static int count = 1;

	public void add(Student a) {
		boolean checker = true;
		iter = info.iterator();
		while (iter.hasNext()) {
			Student temp = iter.next();
			if (a.getId() == temp.getId()) {
				checker = false;
			}
		}
		if (checker) {
			if (count <= 5) {
				info.add(a);
				count++;
			} else {
				System.out.println("list is full");
			}
		} else {
			System.out.println("This ID is already used");
		}

	}

	public void displayAll() {
		iter = info.iterator();
		while (iter.hasNext()) {
			Student temp = iter.next();
			System.out.println("ID: " + temp.getId() + " name : " + temp.getName() + " phone " + temp.getPhone());
		}
	}

	public void search(String text) {
		boolean checker = true;
		iter = info.iterator();
		while (iter.hasNext()) {
			Student temp = iter.next();
			if (text.equals("" + temp.getId()) || text.equals(temp.getName()) || text.equals("" + temp.getPhone())) {
				System.out.println("ID: " + temp.getId() + " name : " + temp.getName() + " phone " + temp.getPhone());
				checker = false;
			}
		}
		if(checker){
			System.out.println("No Data Matched");
		}
	}

	public void del(int id) {
		iter = info.iterator();
		while (iter.hasNext()) {
			Student temp = iter.next();
			if (temp.getId() == id) {
				iter.remove();
				count--;
				break;
			}
		}
	}
}
