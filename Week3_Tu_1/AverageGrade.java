package Week3_Tu_1;

import java.util.*;

public class AverageGrade {
	Scanner input = new Scanner(System.in);
	public int ID;
	public String name;
	public double gradeO;
	public double gradeL;
	
	public static double gradeForAll = 0;
	public AverageGrade(int a, String b) {
		ID = a;
		name = b;
	}

	public void inputGradeO() {
		System.out.print("Please input your grade for OOP: ");
		this.gradeO = input.nextDouble();
	}

	public void inputGradeL() {
		System.out.print("Please input your grade for Logic: ");
		this.gradeL = input.nextDouble();
	}

	 public double aveGrade() {
		return (this.gradeO + this.gradeL) / 2;
	}

	public double addAll(){
		gradeForAll = (gradeForAll + this.aveGrade());
		return gradeForAll;
	}
	public void printAll(){
		System.out.println(addAll());
	}

}
