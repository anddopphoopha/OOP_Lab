package Week12_Fri_2;

public class MainApplication {
	public static void main(String[] args) {
		CPU myCPU = new CPU();
		HDD myHDD = new HDD();
		RAM myRAM = new RAM();
		Computer myCom = new Computer(myCPU, myHDD, myRAM);
		myCom.displaySpecs();
		myCPU.setSpeed(2.4);
		myRAM.setRAM(4000.0);
		myHDD.setCapacity(100000000.0);
		myCom.displaySpecs();
	}
}
