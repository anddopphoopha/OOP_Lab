package Week12_Fri_2;

public class Computer {
	private CPU myCPU;
	private HDD myHDD;
	private RAM myRAM;

	public Computer(CPU myCPU, HDD myHDD, RAM myRAM) {
		this.myCPU = myCPU;
		this.myHDD = myHDD;
		this.myRAM = myRAM;
	}

	public void displaySpecs() {
		System.out.println("This computer is " + myCPU.getSpeed() + " with RAM " + myRAM.getRAM() + " with HDD "
				+ myHDD.getCapacity() + ".");
	}
}
