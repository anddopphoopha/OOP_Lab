package Week5_Fri_3_Lee;

public class MainApplication {
	public static void main(String[] args) {
		WorkBook workbook1 = new WorkBook();

		Student student1 = new Student(1, "mr a", 191);
		Student student2 = new Student(2, "mr b", 1669);
		Student student3 = new Student(3, "mr c", 1599);
		Student student4 = new Student(4, "mr d", 1122);
		Student student5 = new Student(5, "mr e", 1112);

		Student student6 = new Student(6, "mr f", 1912);

		workbook1.add(student1);
		workbook1.add(student2);
		workbook1.add(student3);
		workbook1.add(student4);
		workbook1.add(student5);

		workbook1.add(student6);

		workbook1.displayAll();

		workbook1.search("1");

		workbook1.search("mr c");

		workbook1.search("1112");

		workbook1.del(3);
		workbook1.search("mr c");
		workbook1.displayAll();
		workbook1.add(student6);
	}

}
