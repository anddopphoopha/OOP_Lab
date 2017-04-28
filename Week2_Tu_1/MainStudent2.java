package Week2_Tu_1;

public class MainStudent2 {
public static void main(String[] args){
	Student somsak = new Student("Somsak", "444111", 33);
	Student somchai = new Student("Somchai", "444555", 55);
	System.out.println(somsak.compareScore(somchai));
}
}
