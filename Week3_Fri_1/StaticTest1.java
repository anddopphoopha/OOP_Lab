package Week3_Fri_1;

public class StaticTest1 {
	public static int variable1 = 1;
	public static int counter = 0;
	public int variable2 = -1;
	public void setVar(int number) {
	this.variable1 = number; this.variable2 = number;
	}
	public int getVar1() {return variable1;}
	public int getVar2() {return variable2;}



public StaticTest1() {
	counter++;
}

public int getCounter() {
	return counter;
}
}
